package com.company;

import java.util.Arrays;
import java.util.Random;

public class Guitar {
    private String color;
    private int stringCount;
    private int[] tensions;

    public Guitar() {
        this.color = color;
        this.stringCount = stringCount;
        this.tensions = tensions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    public int[] getTensions() {
        return tensions;
    }

    public void tune() {
        tensions = new int[5];
        Arrays.fill(tensions, 5);
        System.out.println(Arrays.toString(tensions));
    }

    private void unsettle() {
        Random rd = new Random();
        for (int i = 0; i < tensions.length; i++) {
            tensions[i] = rd.nextInt(3);
        }
        System.out.print("guitar is upset: ");
        System.out.println(Arrays.toString(tensions));
    }

    public void play() {
        System.out.println("Do you remember, the 21st night of September?");
        System.out.println("Is this the real life? Is this just fantasy?");
        System.out.println("I'm not afraid to take a stand");
        System.out.println("Nothing can stop me, I'm all the way up");
        unsettle();
    }
}

