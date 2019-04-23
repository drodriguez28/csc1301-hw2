/*
This program allows you to play a guessing game. I will think of a number between 1 and 100
and will allow you to guess until you get it. For each guess, I will tell you whether right answer is 
the higher or lower than your guess.
*/

import java.util.Scanner;
import java.util.Random;

public class TryMe {
    
    public static int playGame() {
        System.out.println("starting a game");
        int counterNumbersGuesses = 10;
        System.out.println("number of guesses needed for this game " + counterNumbersGuesses );
        
       return counterNumbersGuesses;  
    }

    public static void main(String[] args) {
        int totalNumberGuesses = 0;
        
        
        System.out.println("starting the app");
      //10  
         
        int resultsLastGame = playGame();
        totalNumberGuesses = totalNumberGuesses + resultsLastGame;
        System.out.println("total number of guesses for all games " + totalNumberGuesses);
    
        



    }
}
