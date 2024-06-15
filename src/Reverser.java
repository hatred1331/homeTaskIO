import java.io.*;

public class Reverser {

    public void reverse(String filePath, String outputPath){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine())!= null) {
                String reversedLine = new StringBuilder(line).reverse().toString();
                writer.write(reversedLine + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

    }
}
