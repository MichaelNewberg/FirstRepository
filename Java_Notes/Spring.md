# Spring

## What is Spring?
Spring is an incredibly popular Java Framework that streamlines the development process and allows you as a developer to focus on solutions and features while not worrying about things like implementation or writing boilerplate code. As a framework, Spring has a lot to offer:
-Inversion of Control (IOC)
    -Spring takes the idea of framework (code is provided, you need to supply data) and takes it to another level. With Spring, a web service and database connection can be set up and have the majority of the application ready to go: some novel code implementation may be needed, but Spring will handle the majority of the setup of the application.
-Opinionated Framework
    -Spring Boot, the implementation of the Spring we will be working with, is known as the "opinionated" framework:
    it takes the little amount of input Spring normally requires of the developer and "makes decision" for them.
-Dependency Injection
    -Spring handles providing the correct dependencies to your objects, further allowing you to focus soley on the features that need implementation
-Spring has a huge support framework
    -there are a plethora of resources available on the web that can be utilized. [Baeldung](https://www.baeldung.com/) as an option, along with the main [Spring](https://spring.io/) website

## Spring Boot
If Spring is the framework that handles the majority of the boilerplate code, Spring Boot is the framework implementation that goes further. As an opinionated framework, Spring boot upon initialization handles most configurations for you. We will be using Spring Boot to configure 3 modules for us: 
-Spring Web
    -this is the module that will handle setting up the web server for the application. It also handles mapping routes to controller methods, and even handles crafting the http response body from java objects.
-Spring Data
    -module that will handle creating the connection to a Postgres database and will handle sending queries and getting their results back.
-Spring Actuator
    -module that handles exposing endpoints for the web application that will contain useful metrics for the application. There are performance metrics exposed, but we will focus on the metrics that allow us to observe the state of the application.
