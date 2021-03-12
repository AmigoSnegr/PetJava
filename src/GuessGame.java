import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Random randomNumber = new Random();
        System.out.println("Which range of numbers you would like to play?");
        int range = sc.nextInt();
        final int y = randomNumber.nextInt(range + 1);
        System.out.println("How many attempts you need?");
        int attempts = sc.nextInt();
        for (int i = 1; i <= attempts; i++) {
            System.out.println("Guess a number!: ");
            int userAnswer = sc.nextInt();
            if(userAnswer > range || userAnswer < 0) {
                i -= 1;
                System.out.println("Please, type a number between 0 and " + range);
            }
            else
            if (i == attempts)
                System.out.println("You lost(\n Correct answer was " + y);
            else
            if (userAnswer == y){
                sc.close();
                System.out.println("Congratulations, You guessed a number!");
                break;
            } else
            if (userAnswer < y)
                System.out.println("Your number is lower then required(\nYou got " + (attempts - i) + " attempts");
            else
            if (userAnswer > y)
                System.out.println("Your number is bigger then required\nYou got " + (attempts - i) + " attempts");
        }
    }
}
