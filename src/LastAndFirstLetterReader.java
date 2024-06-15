import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastAndFirstLetterReader {

    public void readFile(String filePath){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<String> words = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] wordsInLine = line.split("\\s+");
                words.addAll(Arrays.asList(wordsInLine));
            }

            for (int i = 0; i < words.size() - 1; i++) {
                String currentWord = words.get(i);
                String nextWord = words.get(i + 1);
                char lastLetterCurrentWord = currentWord.charAt(currentWord.length() - 1);
                char firstLetterNextWord = nextWord.charAt(0);

                if (Character.toLowerCase(lastLetterCurrentWord) == Character.toLowerCase(firstLetterNextWord)) {
                    System.out.println(currentWord + " " + nextWord);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
