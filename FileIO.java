package task;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        String fileName = "my_file.txt";

        // Read from the file
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            StringBuilder content = new StringBuilder();
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
            System.out.println("File content:\n" + content);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        // Write to the file
        try (FileWriter writer = new FileWriter(fileName, true)) { // Append mode
            writer.write("\nThis text is added to the file.");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        System.out.println("File operations completed.");
    }
}
