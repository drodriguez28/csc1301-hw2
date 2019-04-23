import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static final int MAXIMUM_NUMBER = 100;

    public static void instructions() {
        System.out.println("This program allows you to play a guessing game");
        System.out.println("I will think of a number between 1 and " + MAXIMUM_NUMBER);
        System.out.println("and will allow you to guess until you get it ");
        System.out.println(" For each guess, I will tell you whether the");
        System.out.println("right answer is higher or lower than your guess ");
    }

    public static int playGame() {
        Random rand = new Random();
        // answer holds the random number for the user to guess it
        int answer = rand.nextInt(MAXIMUM_NUMBER) + 1;

        System.out.println("I'm thinking of a number... ");

        Scanner sc = new Scanner(System.in);
        // is to hold the guess that the users makes
        int usersGuess = 0;

        // creating a counter was to hold the numbers of guesses
        // setting it to zero because, the player hasn't started makng guesses
        int counterNumbersGuesses = 0;

        while (usersGuess != answer) {
            // while the user is guesssing inncorectly, its telling the player to go Higher
            // or lower
            // when the user guess correctly, it exits the while loop

            System.out.print("Your guess? ");
            // the following line asks the player, to enter their guess using the keyboard
            usersGuess = sc.nextInt();
            //
            if (usersGuess < answer) {
                System.out.println("higher");
            }
            if (usersGuess > answer) {
                System.out.println("lower");
            }
            // the counter below keeps up with, the number of trys they attempted
            counterNumbersGuesses++;

        }
        System.out.println("You got it right in " + counterNumbersGuesses + " guesses");
        return counterNumbersGuesses;

        // System.out.println("Do you want to play again?");
    }

    public static void main(String[] args) {
        instructions();
        // records LAST game results
        int resultsLastGame = playGame();
        // records Games played- already played ONE game
        int counterGamesPlayed = 1;
        // ALL GUESS FROM ALL GAMES
        int totalNumberGuesses = 0;
        totalNumberGuesses = totalNumberGuesses + resultsLastGame;
        //System.out.println(" " + resultsLastGame);
        // record worst game 
        int maxGuessGame = 0;
        if (resultsLastGame > maxGuessGame ) {
            maxGuessGame=resultsLastGame;
        }

        while (true) {
            Scanner sc = new Scanner(System.in);
            //
            System.out.println("Do you want to play again?");
            // will print out play again once
            String usersInput = sc.next();
            // whatever the user input is (yes or no) determining the players answer
            if (usersInput.startsWith("Y") || usersInput.startsWith("y")) {
                System.out.print("");
                // uses this in order to excute a Yes
                resultsLastGame = playGame();
                totalNumberGuesses = totalNumberGuesses + resultsLastGame;
                if (resultsLastGame > maxGuessGame ) {
                    maxGuessGame=resultsLastGame;
                }

            }

            if (usersInput.startsWith("N") || usersInput.startsWith("n")) {
                // uses the users input to excute a NO
                System.out.println("");

                break;
                //
            }
            counterGamesPlayed++;
            // totalNumberGuesses
            // counter += userGuess;
            // return counter;

        }

        results(counterGamesPlayed, totalNumberGuesses, maxGuessGame);
    }
    // put in results in here

    public static void results(int gamesPlayed, int totalGuesses, int maxGuessGame) {
        System.out.println("Overall results:");
        System.out.println("    total games   = " + gamesPlayed);
        System.out.println("    total guesses = " + totalGuesses);
        System.out.println("    guesses/game  = " + (float) totalGuesses/gamesPlayed);
        System.out.println("    max guesses   = " + maxGuessGame);

    }
}

// the name called has to match the method definition
// same number of parameters must match
// the type of each parameter must match in order
// three phases of a counter
// 1. initi/zation (create the counter variable)- set the default value -int
// counter =0 (before the while loop)
// 2. modify (++1) counter = counter +1 || counter++ - in the loop
// 3. use the final value - after the while loop