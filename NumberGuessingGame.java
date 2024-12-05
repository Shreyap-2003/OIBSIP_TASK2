import java.util.Random; 
import java.util.Scanner; 
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Attempts to guess the number is 5");
        while (win == false) {
            System.out.println("Guess a number between 1 and 100:");
            guess = input.nextInt();
            numberOfTries++;
            if(numberOfTries == 5)
            {
                System.out.println("Out of tries. Better luck next Time");
                System.out.printf("The Random Number Is :" + numberToGuess);
            }

            if (guess == numberToGuess) {
                win = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("\n Your guess is too low!");
            } else if (guess > numberToGuess) {
                System.out.println("\n Your guess is too high!");
            }  
            
        }
        int score = 5 - numberOfTries;
        System.out.println("\n Congratulations! You found the number in " + numberOfTries + " tries."); 
        System.out.printf("Score =" + score);
       
    }
}
