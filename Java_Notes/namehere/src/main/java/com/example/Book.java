package com.example;
/*There are many 3rd party libraries that handle converting JSONs into Java objects and vice versa.
 *However, in order to make use of most of these libraries, many require you to set up your class in a specific way:
    -they require the Java bean design pattern.
 *The Java Bean design pattern has a few requirements:
    -all fields must be private.
    -all fields must have getter and setter methods to interact with them.
 */
public class Book {
    //So far we've been using the public access modifier: to make a class a Java Bean though, 
    //all fields must be set to private(only accesable to code within the class).
    private String title;
    private String author;
    private String genre;
    private int isbn;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    

}
