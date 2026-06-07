import java.util.*;
public class RockPaperScissorsGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String[] RockPaperScissors = {"Rock", "Paper", "Scissors"};
    public static void main(String[] args) {
        int userInput, computerInput;
        while(true){ 
            displayMenu();
            userInput = (getUserInput());
            if(userInput==4)break;
            computerInput = (getComputerInput());
            if(userInputValidator(userInput)){
                System.out.println("You picked " + RockPaperScissors[userInput-1]);
                System.out.println("The computer picked " + RockPaperScissors[computerInput-1]);
                System.out.println(checkWinner(userInput-1,computerInput-1));
            }else{
                System.out.println("Invalid Input!");
            }            
        }
        System.out.print("Thanks for playing!");
        scanner.close();
    }
    static String checkWinner(int userInput, int computerInput){
        if(userInput==computerInput){
            return "It's a tie!";
        }
        else if((userInput==0 && computerInput==1)||(userInput==1 && computerInput==2)||(userInput==2 && computerInput==0)){
            return "You lose!";
        }
        else{
            return "You win!";
        }
    }
    static int getUserInput(){
        return scanner.nextInt();
    }
    static int getComputerInput(){
        return random.nextInt(1,4);
    }
    static void displayMenu(){
        System.out.println("*******************************");
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Exit");
        System.out.print("Enter your choice(1-4): ");
    }
    static boolean userInputValidator(int userInput){
        return (userInput<5 && userInput>0);
    }
}
