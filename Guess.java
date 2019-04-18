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

    public static void playGame() {
        Random rand = new Random();
        int answer = rand.nextInt(MAXIMUM_NUMBER) + 1;

        System.out.println("I'm thinking of a number... ");

        Scanner sc = new Scanner(System.in);

        int usersGuess = 0;

        // creating a counter was to hold the numbers of attempts
        // setting it to zero because, the player hasn't started makng guesses
        int counter = 0;

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
            counter++;

        }
        System.out.println("You got it right in " + counter + " guesses");
        // System.out.println("Do you want to play again?");
    }

    public static void main(String[] args) {
        // instructions();
        // the method plays a single game and returns
        // playGame();
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to play again?");
            String usersInput = sc.next();
            System.out.println(usersInput);
            if (usersInput.equals("Yes")) {
                System.out.println("Deivid was here ");
                //playGame();
            }

            if (usersInput.equals("No")) {
                System.out.println("Bob ");
                break;

            }

        }
        System.out.println("Results go here");

    }
}
