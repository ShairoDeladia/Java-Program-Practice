import java.util.*;
public class Exceptions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }catch (ArithmeticException e) {
            System.out.println("You can't divide by zero.");
        }catch (InputMismatchException e) {
            System.out.println("That wasn't a number.");
        }catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally{
            scanner.close();
            System.out.println("This always execute.");
        }
    }
}
