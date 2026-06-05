import java.util.Scanner;
public class BankingProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput;
        double userBalance=0;
        do { 
            printMenu();
            userInput = getUserInput(scanner);
            if(validateUserInput(userInput)){
                userBalance = transaction(userInput,userBalance,scanner);
            }
            else{
                System.out.println("Invalid Input! Try Again.");
            }
        } while (userInput!=4);
        System.out.println("Thank You, Come Again Later!");
        scanner.close();
    }

    static void printMenu(){
        System.out.println("****************\nBANKING PROGRAM\n****************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    static int getUserInput(Scanner scanner){
        System.out.print("What would you like to do? (1-4): ");
        return scanner.nextInt();
    }

    static boolean validateUserInput(int userInput){
        switch(userInput){
            case 1,2,3,4 -> {return true;}
            default -> {return false;}
        }
    }

    static double transaction(int userInput,double userBalance,Scanner scanner){
        System.out.println("Processing, Please Wait.");
        switch(userInput){
            case 1 -> {
                showBalance(userBalance);
            }
            case 2 -> {
                userBalance=deposit(userBalance, scanner);
                System.out.printf("Your New Balance is PHP%.2f\n",userBalance);
            }
            case 3 -> {
                userBalance=withdraw(userBalance, scanner);
                System.out.printf("Your New Balance is PHP%.2f\n",userBalance);
            }
        }
        return userBalance;
    }

    static void showBalance(double userBalance){
        System.out.printf("Your Balance is: PHP%.2f\n",userBalance);
    }

    static double deposit(double userBalance, Scanner scanner){
        System.out.print("How Much Would You Like to Deposit?: ");
        double cashDeposit = scanner.nextDouble();
        if(cashDeposit<0){
            System.out.println("The Amount is Invalid! Try Again.");
            cashDeposit=0;
        }
        return userBalance+cashDeposit;
    }

    static double withdraw(double userBalance, Scanner scanner){
        System.out.print("How much would you like to withdraw?: ");
        double cashWithdraw = scanner.nextDouble();
        if(cashWithdraw>userBalance){
            System.out.println("Your Balance is Too Low to Withdraw the Desired Amount.");
            cashWithdraw=0;
        }
        else if(cashWithdraw<0){
            System.out.println("The Amount is Invalid! Try Again.");
            cashWithdraw=0;
        }
        return userBalance-cashWithdraw;
    }
}
