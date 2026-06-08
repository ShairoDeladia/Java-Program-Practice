
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readers {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\skdel\\OneDrive\\Documents\\Java\\JavaPractice\\MiniProjects&Practice\\Test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't not locate file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
