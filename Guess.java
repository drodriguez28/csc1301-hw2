import java.util.Scanner;


public class Guess {
    public static void instructions() {
        System.out.println("This program allows you to play a guessing game");
        System.out.println("I will think of a number between 1 and 100");
        System.out.println("and will allow you to guess until you get it ");
        System.out.println(" For each guess, I will tell you whether the");
        System.out.println("right answer is higher or lower than your guess ");
    }
    public static void main(String[] args) {
        instructions();
        
        Scanner sc = new Scanner(System.in);
        
        int usersGuess = 0;
        
        while (usersGuess != -1) {
            System.out.println("Guess a number between 1-50 (or –1 to stop):");
            usersGuess = sc.nextInt();
            // if the usersGuess is 17 tell its correct
            if (usersGuess == 17) {
                System.out.println("Correct");
                // usersGuess= -1;
                break;
            } else {
                System.out.println("Inncorrect");
            }
        }
    }
}
