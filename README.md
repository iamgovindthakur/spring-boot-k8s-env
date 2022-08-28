# Reading Environment property in Spring Boot Microservices  from Kubernetes Environment
spring-boot-k8s-env is a spring boot project that will show you how to read environment property from Kubernetes environment and use inside spring boot microservices. 

## Installation

Use the maven to install dependencies.

```bash
mvnw clean install
```

## Usage

```docker
Go Inside the project root folder

# First create a docker image file
docker build -t iamgovindthakur/spring-boot-k8s-env .

# Go Inside YamlFile folder and run this 
kubectl apply -f spring-boot-k8s-env.yml

# NOTE: If you are making any change in docker build command , please make sure you are also making change in then spring-boot-k8s-env.yaml file.

```

