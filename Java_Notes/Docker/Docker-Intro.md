# Docker
When deploying applications there are many factors you must account for:
    -Csan I even run my app in the environment?
    -Is the Correct runtime environment installed?
    -Is the correct build tool installed?
    -Do my security settings allow access to my application?

Docker is the answer to simplifying this process. Instead of having to worry about having all te right tools available on whatever device you're deploying your app on,
if you have Docker installed, the answer is 'yes'.
Docker creats a virtual "container" for your app that can handle the building/running/exposure for your app.

## Containerization
According to Docker, a container is "a standard unit of software that packages up code and all its dependencies so the app runs quickly and reliably from one computing
environment to another." This includes the necessary "code, runtime, system tools, system libraries and settings."

This containerization is achieved by turning "images" into containers. Images contain the instructions for how your containerized application should be built/deployed.
Once the Docker engine has read the image, Docker then creates the container based off the configuration details provided in said image, then you are free to interact with the app like you had started it up yourself.

## Image & Dockerfile
Docker uses "Dockerfile"s to know how it is supposed to build an image. You can set the follwing details within a Dockerfile (this is not an exhaustive list):
    -Base Image: what kind of environment should the app run in
    -Working Directory: what directory within the container should be considered the root directory
    -Application Details: what source code and/or executable files should be included in the container
    -Commands: what build/execution commands should be used when the container is started
