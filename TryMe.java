/*
This program allows you to play a guessing game. I will think of a number between 1 and 100
and will allow you to guess until you get it. For each guess, I will tell you whether right answer is 
the higher or lower than your guess.
*/

import java.util.Scanner;
import java.util.Random;

public class TryMe {
    // static void instructions() {
    //     System.out.println("This program allows you to play a guessing game");
    //     System.out.println("I will think of a number between 1 and 100");
    //     System.out.println("and will allow you to guess until you get it ");
    //     System.out.println(" For each guess, I will tell you whether the");
    //     System.out.println("right answer is higher or lower than your guess ");
    // }

    public static void numberToGuess() {
        // TryMe rand = new TryMe();
        // Scanner console = new Scanner(System.in);
        // System.out.print("Your guess: ");
        // int numberToGuess = console.nextInt(50) + 1;
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
        System.out.println("random number "+ number );

    }

    public static void main(String[] args) {
        //instructions();
        numberToGuess();

    }
}
