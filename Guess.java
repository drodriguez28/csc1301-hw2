import java.util.Scanner;


public class Guess {
    public static void main(String[] args) {
        
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

