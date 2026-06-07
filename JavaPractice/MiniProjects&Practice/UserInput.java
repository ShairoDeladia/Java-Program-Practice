import java.util.Scanner;
public class UserInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height(cm): ");
        double height = scanner.nextDouble();
        System.out.printf("Your name is %s, %d years old, and %.2fcm tall.",name,age,height);
        scanner.close();
    }    
}