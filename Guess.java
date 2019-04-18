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

        // DELETE ME
        System.out.println("I'm thinking of a number... ");

        Scanner sc = new Scanner(System.in);
        int usersGuess = 0;
        int counter = 0;

        while (usersGuess != answer) {

            System.out.print("Your guess? ");
            usersGuess = sc.nextInt();
            if (usersGuess < answer) {
                System.out.println("higher");
            }
            if (usersGuess > answer) {
                System.out.println("lower");
            }

            counter++;

        }
        System.out.println("You got it right in " + counter + " guesses");
    }

    public static void main(String[] args) {
        instructions();
        playGame();

    }
}
