import java.io.*;

public class WordsChanger {

    public void changeFile(String filePath, String outputPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine())!= null) {
                line = replacePublicWithPrivate(line);
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    private static String replacePublicWithPrivate(String line) {
        return line.replaceAll("\\bpublic\\b", "private");
    }
}
