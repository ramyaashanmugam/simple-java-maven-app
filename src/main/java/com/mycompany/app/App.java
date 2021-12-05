package com.mycompany.app;


public class App
{

    private final String message = "Hello João Pires!";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Hi..." +new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
