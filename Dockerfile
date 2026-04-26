FROM eclipse-temurin:17-ubi10-minimal

WORKDIR /app

COPY target/k8s-demo-spring-boot.jar k8s-demo-spring-boot.jar

ENTRYPOINT [ "java","-jar","k8s-demo-spring-boot.jar" ]

