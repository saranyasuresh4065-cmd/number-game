import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain;

        do {
            int number = rand.nextInt(100) + 1; 
            int attempts = 5;
            boolean guessed = false;
            System.out.println("Guess the number between 1 and 100");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                if (guess == number) {
                    System.out.println("Correct!");
                    guessed = true;
                    score += attempts;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!guessed) {
                System.out.println("You lost! Number was: " + number);
            }

            System.out.println("Your score: " + score);
            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Game Over. Final Score: " + score);
    }
}