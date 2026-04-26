package com.k8s_demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "User")
@Getter
@Setter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "USER_NAME")
    private String userName;

    public User(){}

    public User(String userName){
        this.userName=userName;
    }

    public User(long id,String userName){
        this.userName=userName;
        this.id=id;
    }
}
