package com.k8s_demo.controller;

import com.k8s_demo.entity.User;
import com.k8s_demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller{

     private final DemoService demoService;

     @Autowired
     public Controller(DemoService demoService){
          this.demoService=demoService;
     }

     @PostMapping("/save")
     public ResponseEntity<User> save(@RequestBody User user){
          User savedUser = demoService.save(new User(user.getUserName()));
          return new ResponseEntity<>(savedUser,HttpStatus.OK);
     }

     @GetMapping("/{userId}")
     public ResponseEntity<User> getByUserId(@PathVariable("userId") long userId){
          User user = demoService.getUserById(userId);
          return new ResponseEntity<>(user, HttpStatus.OK);
     }

     @GetMapping("/")
     public ResponseEntity<String> testEndpoint(){
          return ResponseEntity.ok("Service is up and running!");
     }

}