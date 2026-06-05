import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        String temperature = scanner.nextLine().toUpperCase();
        if(!temperature.contains("C")&&!temperature.contains("F")){
            System.out.println("Input is invalid!");
            System.out.println("Program is now closing.");
            System.exit(0);
        }
        double temperatureValue = Double.parseDouble(temperature.substring(0,temperature.length()-1));
        double temperatureConverted = 0;
        boolean isCelsius = false;
        if(temperature.charAt(temperature.length()-1)=='C'){
            isCelsius = true;
        }
        if(isCelsius){
            System.out.println("Would you like to convert it to fahrenheit? (Y/N): ");
        }else{
            System.out.println("Would you like to convert it to celsius? (Y/N): ");
        }
        String input = scanner.next().toUpperCase();
        if(input.equals("Y")){
            if(isCelsius){
                temperatureConverted = (temperatureValue*9/5)+32;
            }else{
                temperatureConverted = (temperatureValue-32)*5/9;
            }
        }else if(input.equals("N")){
            System.out.println("Program closing.");
            System.exit(0);
        }else{
            System.out.print("Invalid input.");
            System.exit(0);
        }
        if(isCelsius){
            System.out.printf("The converted temperature of %s is: %.2fF",temperature,temperatureConverted);
        }else{
            System.out.printf("The converted temperature of %s is: %.2fC",temperature,temperatureConverted);
        }
        scanner.close();
    }    
}
