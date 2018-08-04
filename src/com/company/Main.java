package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        Random random = new Random();
        Scanner reader = new Scanner(System.in);
        int randomNum = min + random.nextInt(max);

        System.out.println("Enter number for computer to guess between 1-100");
        int guess = reader.nextInt();

        System.out.println("My guess is " + randomNum);
        System.out.println("Was i...");
        System.out.println("Correct: 1");
        System.out.println("Too high: 2");
        System.out.println("Too low: 3");

        int response = reader.nextInt();

        switch (response) {
            case 1:
                System.out.println("Yay! I got it right!");
                break;
            case 2:
                System.out.println("I'll guess lower next time");
                break;
            case 3:
                System.out.println("I'll guess higher next time");
                break;
        }

    }
}
