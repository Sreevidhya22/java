import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseFileString {
    public static void main(String[] args) {
        String filePath = "input.txt";  // Path to the input file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Remove the last newline character for cleaner output
            if (content.length() > 0 && content.charAt(content.length() - 1) == '\n') {
                content.deleteCharAt(content.length() - 1);
            }

            String reversed = content.reverse().toString();
            System.out.println("Reversed content:\n" + reversed);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

