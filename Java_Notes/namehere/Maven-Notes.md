# pom.xml
The page object model (pom) is where you tell Maven the relevant information about your project.
Points of interest:
    -properties:
        *this is where we tell Maven what version of Java we're using
    -dependencies:
        *this is where we tell Maven the 3rd party libraries we want to integrate into our project
    -build:
        *this is where we can add plugins to our project that affect the way Maven builds our application.
            -a common use case is to use the maven-surefire-plugin so that Maven will only build the application if all tests associated with the project pass
                