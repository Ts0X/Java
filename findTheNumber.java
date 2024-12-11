import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess < number) {
                System.out.println("Too low! Try again.");
            } else if (guess > number) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        } while (guess != number);
    }
}
