package com.example;

import java.util.ArrayList;
import java.util.List;

import io.javalin.Javalin;

/*All Maven projects have their code stored inside of a src/main/java directory. 
 *The reason we also have a "com" package and inside of it a package called "example" is due to the Maven Project Generator
    names your base package structure after the group ID from initial project setup.
 *This means that your java code is going to, at a minimum, have a "package com.example" to start it off in order to let Maven know
    where the code is when it builds our application.
 */
public class App 
{
    public static List<String> names=new ArrayList<>();
    public static void main( String[] args ){
        names.add("Billy");
        names.add("Sting");

        Javalin app= Javalin.create();
        //GET request
        app.get("/hello", ctx -> ctx.result("Hello World!"));//In browser (localhost:8080/hello) 
        
        //POST request
        app.post("/add", ctx -> {
            //get the name from the HTTP request body and save it to variable
            String newName=ctx.body();
            //add new name to list
            names.add(newName);
            //tell Javalin to return a String message to requester
            ctx.result("New name successfully added to database.");
            //tell Javalin to return status code 201 in response
            ctx.status(201);//201 is create/add
        });
        //adding a path parameter to the uri
        app.get("/person/{num}", ctx -> {
            //use the pathParam method to get the value of the num path parameter
            String numString=ctx.pathParam("num");
            //convert string to int
            int num=Integer.parseInt(numString);
            //use new converted int to access index position we want
            String person=names.get(num);
            //tell Javalin to return name of person
            ctx.result(person);
            //tell Javalin to set status code to 200
            ctx.status(200);
        });// GET  localhost:8080/person/ArrayIndexYouWant to operate this

        //A more protected version of the GET to avoid the 500 error should nothing be found.
        app.get("/protectedGet/{num}", ctx -> {
            String numString=ctx.pathParam("num");
            int num=Integer.parseInt(numString);
            try {
                String person=names.get(num);
                ctx.result(person);
                ctx.status(200);
            } catch (IndexOutOfBoundsException e) {
                ctx.result("No person found at this position.");
                ctx.status(404);//404 is for not found
            }
        });

        app.put("/replace/{num}", ctx -> {
            //get the index position for the path as a string
            String numString=ctx.pathParam("num");
            //convert to int
            int num=Integer.parseInt(numString);
            //get string value we will use as a replacement
            String replacePerson= ctx.body();
            //set method to replace old name with new one
            names.set(num, replacePerson);//index position, new input
            ctx.result("Replacement successful!");
            ctx.status(200);
            //PUT localhost:8080/person/ArrayIndexYouWant
        });

        //Context of this is different, even though similar to PUT
        //this "updates" whereas PUT will "replace" the value
        app.patch("/update/{num}", ctx-> {
            String numString= ctx.pathParam("num");
            int num= Integer.parseInt(numString);
            String updatedInfo=ctx.body();
            names.set(num, updatedInfo);
            ctx.result("Update successful!");
            ctx.status(200);
        });

        app.delete("/delete", ctx -> {
            names.clear();
            ctx.result("All names removed!");
            ctx.status(200);
        });
            




       //start the app. THIS WILL BE AT THE BOTTOM
       app.start();//can enter which port it runs on within the (). default is port 8080
    }
}
