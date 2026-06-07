import java.util.*;
public class DiceRollerProgram {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args){
        int diceAmount,diceSum=0;
        diceAmount = getDiceAmount();
        if(validateDiceAmount(diceAmount)){
            diceSum += diceSumCalculator(diceAmount);
            System.out.println("Sum of All Dice is: " + diceSum);
        }else{
            System.out.println("Invalid Input. Program Will Close.");
        }
    }    
    static int getDiceAmount(){
        System.out.print("Enter How Many Dice You Want to Roll: ");
        return scanner.nextInt();
    }
    static boolean validateDiceAmount(int diceAmount){
        return diceAmount>0;
    }
    static int diceSumCalculator(int diceAmount){
        int diceValue,diceSum=0;
        for(int i=0;i<diceAmount;i++){
            System.out.println("Dice "+(i+1)+" Rolled: ");
            diceSum+=diceValue = random.nextInt(1,7);
            System.out.println(diceValue);
        }
        return diceSum;
    }
}
