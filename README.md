# Maana FEEL

Friendly Enough Expression Language (FEEL) evaluation engine provided by [Camunda](https://github.com/camunda/feel-scala)

## Building

Standard scala service with SBT using the JavaAppPackaging plugin.

build the container with

```bash
sbt docker:publishLocal
```

run the container with

```bash
docker run -p 8080:8080 maana_scala_template_service:v1.0.0
```

## Service Endpoint

```bash
http://<hostname>:8080/graphql
```

## Basic Use

query {
testResolver(person:{
id: "name",
name: "Mike"
}){
id
greeting
}
}
