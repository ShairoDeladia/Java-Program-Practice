public class VarArgs {
    public static void main(String[] args) {
        System.out.print(getSum(1,2,3,4,5));
    }
    static int getSum(int... numbers){
        int sum=0;
        for(int i:numbers){
            sum+=i;
        }
        return sum;
    }
}
