public class Methods{
    public static void main(String[] args){
        String name = "Shairo";
        String lastName = "Deladia";
        singHappyBirthday(name, lastName);
    }
    static void singHappyBirthday(String name){
        System.out.printf("Happy Birthday %s!",name);
    }
    static void singHappyBirthday(String name, String lastName){
        System.out.printf("Happy Birthday %s %s!",name,lastName);
    }
}