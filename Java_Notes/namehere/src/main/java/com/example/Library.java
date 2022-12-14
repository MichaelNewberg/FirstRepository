package com.example;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.javalin.Javalin;

public class Library {//default access modifier, any code within here can use this.
    //creating a custom Logger
    public static Logger logger=LoggerFactory.getLogger(Library.class);
    //Putting in the class Library will just set it to the default root

    static List<Book> library= new ArrayList<>();//static is needed in order to be able to reference.

    public static void main(String[] args) {
        //implement the custom Logger
        //these will only trigger at the root value and below
        logger.trace("You are at the TRACE level.");
        logger.debug("You are at the DEBUG level.");
        logger.info("Application starting.");
        logger.warn("You are at the WARN level.");
        logger.error("You are at the ERROR level.");

        Book startingBook= new Book();
        startingBook.setTitle("The Fellowship of the Ring");
        startingBook.setAuthor("J.R.R Tolkien");
        startingBook.setGenre("Fantasy");
        startingBook.setIsbn(123456789);
        library.add(startingBook);

        Javalin app= Javalin.create();

        app.get("/book/{index}", ctx -> {
            //skip creating a holder variable for pathParam.
            int index= Integer.parseInt(ctx.pathParam("index"));//this is essentially combining 2 lines of code (see App.java) into 1.
            Book book =library.get(index);
            //convert a Java Object into a JSON.
            ctx.json(book);
            ctx.status(200);
        });

        app.post("/book", ctx -> {//can have the same path since the verbs themselves are different
            //Convert a JSON in the request into a Java Object with bodyAsClass
            Book newBook= ctx.bodyAsClass(Book.class);
            //add new book
            library.add(newBook);
            ctx.result("Book added to the index.");
            ctx.status(201);
        });

        //this is for updating information about the book
        app.patch("/book/{index}", ctx -> {
            int index=Integer.parseInt(ctx.pathParam("index"));
            Book updatedBook=ctx.bodyAsClass(Book.class);
            //returns book at index, replaces old author related to that book with new one
            library.get(index).setAuthor(updatedBook.getAuthor());
            library.get(index).setTitle(updatedBook.getTitle());
            library.get(index).setGenre(updatedBook.getGenre());
            //since isbn is unique accross books, no code to edit it is needed
            ctx.json(library.get(index));
            ctx.status(200);
        });

        //this will replace all the information at the target index
        app.put("/book/{index}", ctx -> {
            int index=Integer.parseInt(ctx.pathParam("index"));
            Book updatedBook=ctx.bodyAsClass(Book.class);
            //actual replacement code
            library.set(index, updatedBook);
            ctx.json(library.get(index));
            ctx.status(200);
        });

        //remove information at target index
        app.delete("/book/{index}", ctx -> {
            int index = Integer.parseInt(ctx.pathParam("index"));
            library.remove(index);
            ctx.status(200);
        });

        app.start();
    }
}
