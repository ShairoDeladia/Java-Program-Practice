import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many food you want: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] foods = new String[size];
        System.out.println("Enter the food you want: ");
        for(int i=0;i<size;i++)foods[i]=scanner.nextLine();
        for(String food : foods){
            System.out.println(food);
        }
        scanner.close();
    }
}
