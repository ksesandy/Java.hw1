package com.tom;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Costomer[] costomers = {
                new Costomer("0013",490,0),
                new Costomer("0052",1000,0),
                new Costomer("0081",290,0),
                new Costomer("2122",2000,200),
        }
        for (int i = 0; i < costomers.length; i++) {
            costomers[i].print();
        }
    }
}
