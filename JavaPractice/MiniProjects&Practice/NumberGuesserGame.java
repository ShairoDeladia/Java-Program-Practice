import java.util.Random;
import java.util.Scanner;
public class NumberGuesserGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int randomNumber = random.nextInt(10) + 1, guessedNumber=0, numberOfAttempts=0;
        do{
            numberOfAttempts++;
            System.out.print("Guess a number from 1 to 10: ");
            guessedNumber = scanner.nextInt();
            if(guessedNumber!=randomNumber){
                System.out.println("Try again!");
            }
        }while(guessedNumber!=randomNumber);
        System.out.println("Congratulations!");
        System.out.println("You guessed " + numberOfAttempts + " times.");
        scanner.close();
    }
}
