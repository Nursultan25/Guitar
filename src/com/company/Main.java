package com.company;

public class Main {

    public static void main(String[] args) {
        Guitar fender = new Guitar();
        fender.setColor("blue");
        fender.setStringCount(5);


        System.out.println("guitra color: " + fender.getColor());
        System.out.println("amount of strings: " + fender.getStringCount());

        System.out.print("guitar tuned for: ");
        fender.tune();
        System.out.print("guitar playing: ");
        fender.play();
    }
}
