import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static final int MAXIUM_NUMBER = 100;

    public static void instructions() {
        System.out.println("This program allows you to play a guessing game");
        System.out.println("I will think of a number between 1 and " + MAXIUM_NUMBER);
        System.out.println("and will allow you to guess until you get it ");
        System.out.println(" For each guess, I will tell you whether the");
        System.out.println("right answer is higher or lower than your guess ");
    }

    public static void playGame() {
        Random rand = new Random();
        int answer = rand.nextInt(MAXIUM_NUMBER) + 1;
        System.out.println("random number " + answer);

        Scanner sc = new Scanner(System.in);
        int usersGuess = 0;
        while (usersGuess != -1) {
            // System.out.println("Guess a number between 1-50 (or –1 to stop):");
            usersGuess = sc.nextInt();
            // if the usersGuess is 17 tell its correct
            if (usersGuess == answer) {
                System.out.println("Correct");
                // usersGuess= -1;
                break;
            } else {
                System.out.println("Inncorrect");
            }
        }
    }

    public static void main(String[] args) {
        instructions();
        playGame();

    }
}
