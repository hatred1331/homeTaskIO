import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DigitsReader {
    public void readDigits(String filePath){


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int maxDigits = 0;
                int currentDigits = 0;

                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isDigit(c)) {
                        currentDigits++;
                    } else {
                        maxDigits = Math.max(maxDigits, currentDigits);
                        currentDigits = 0;
                    }
                }


                maxDigits = Math.max(maxDigits, currentDigits);

                System.out.println("Наибольшее число цифр в строке: " + maxDigits);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
