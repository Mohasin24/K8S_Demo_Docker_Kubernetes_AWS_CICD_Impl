FROM eclipse-temurin:17

WORKDIR /app

COPY target/k8s-demo-spring-boot.jar k8s-demo-spring-boot.jar

ENTRYPOINT [ "java","-jar","k8s-demo-spring-boot.jar" ]

