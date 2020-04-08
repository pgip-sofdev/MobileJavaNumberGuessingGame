package com.example.number_guessing_android;
import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Reference: https://www.java-made-easy.com/guessing-game.html


        Random rand = new Random();
        int numberToGuess = rand.nextInt(1000);
        int numberOfTries = 0;
        Scanner input = new Scanner (System.in);
        int guess;
        boolean win = false;

        while (win == false) {
            System.out.println("Please guess a number between 1 and 1000: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;

            }
            else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            }
            else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            }
        }
        System.out.println("You win");
        System.out.println("The number was " + numberToGuess);
        System.out.println("You took "+ numberOfTries + " tries" );

    }

}

