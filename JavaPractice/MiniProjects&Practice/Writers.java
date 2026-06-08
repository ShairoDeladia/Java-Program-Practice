import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Writers {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\skdel\\OneDrive\\Documents\\Java\\JavaPractice\\MiniProjects&Practice\\Test.txt";
        String textContent = "This is a test.";
        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written.");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location.");
        } catch (IOException e) {
            System.out.println("Couldn't write file.");
        }
    }
}
