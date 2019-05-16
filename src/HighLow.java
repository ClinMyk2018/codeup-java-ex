import java.util.Scanner;
import java.util.Random;

public class HighLow {

    public static void main(String[] args) {

        Random randNum = new Random();
        int numberToGuess = randNum.nextInt(100);
        int numOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        System.out.println("Welcome to the High / Low Guessing Game!");
        System.out.println("May the odds be ever in your favor!");

        while (!win) {

            System.out.println("Guess a number between 1 and 100!");
            guess = input.nextInt();
            numOfTries++;

            if (guess == numberToGuess) {
                win = true;
                break;
            }
            if (guess < numberToGuess) {
                System.out.println(" Sorry that is too LOW!");
            }
            if (guess > numberToGuess) {
                System.out.println(" Sorry that is too HIGH!");
            }
            if (guess != numberToGuess && numOfTries > 6){
                System.out.println("Too many tries, you lose!");
                break;
            }
        }
        if(win) {
            System.out.println("You win!");
            System.out.println("The number was: " + numberToGuess);
            System.out.println(" It took you " + numOfTries + " tries to win!");
        }
    }



}
