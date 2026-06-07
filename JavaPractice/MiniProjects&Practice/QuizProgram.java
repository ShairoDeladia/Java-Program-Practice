import java.util.Scanner;
public class QuizProgram {
    static String[] questions = {
        "What is the difference between RAM and ROM?",
        "What does a CPU do in a computer system?",
        "What is the purpose of an operating system?",
        "What is the difference between a compiler and an interpreter?",
        "What is a microcontroller, and where is it commonly used?"
    };
    static String[][] choices = {
        {
            "a. RAM is volatile memory, ROM is non-volatile memory",
            "b. RAM is slower than ROM",
            "c. RAM stores files permanently, ROM does not",
            "d. There is no difference"
        },
        {
            "a. Stores files on a hard drive",
            "b. Manages network connections only",
            "c. Executes instructions and processes data",
            "d. Provides internet access"
        },
        {
            "a. To create computer hardware",
            "b. To manage hardware and software resources",
            "c. To increase RAM capacity",
            "d. To compile source code"
        },
        {
            "a. A compiler translates the entire program, an interpreter translates line by line",
            "b. A compiler executes line by line, an interpreter translates the whole program",
            "c. They are exactly the same",
            "d. Compilers only work with web applications"
        },
        {
            "a. A CPU used only in servers",
            "b. A programmable chip used in embedded systems such as Arduino and appliances",
            "c. A type of RAM",
            "d. A computer monitor controller"
        }
    };
    static char[] answers = {'a','c','b','a','b'};
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int totalScore=0;
        showMenu();
        for(int i=0;i<5;i++){
            System.out.println("Question " + (i+1));
            System.out.println(question(i));
            for(int j=0;j<4;j++){
                System.out.println(choice(i,j));
            }
            System.out.print("Enter your answer (a-d): ");
            char answer = scanner.next().toLowerCase().charAt(0);
            if(answerValidator(answer)){
                if(answerChecker(i,answer)){
                    totalScore++;
                }
            }else{
                System.out.println("Invalid Answer.");
            }
        }
        System.out.print("Your total score is: " + totalScore);
        scanner.close();
    }
    static boolean answerValidator(char answer){
        return (answer=='a'||answer=='b'||answer=='c'||answer=='d');
    }
    static boolean answerChecker(int questionNumber, char answer){
        return answers[questionNumber]==answer;
    }
    static String question(int questionNumber){
        return questions[questionNumber];
    }
    static String choice(int questionNumber, int questionChoice){
        return choices[questionNumber][questionChoice];
    }
    static void showMenu(){
        System.out.println("**************");
        System.out.println("JAVA QUIZ GAME");
        System.out.println("**************");
    }
}
