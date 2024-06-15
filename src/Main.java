//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\degty\\WorkWithFiles\\src\\text.txt";
        String digitsPath= "C:\\Users\\degty\\WorkWithFiles\\src\\digits";
        String codePath = "C:\\Users\\degty\\WorkWithFiles\\src\\code.txt";
        String newCodePath = "C:\\Users\\degty\\WorkWithFiles\\src\\newCode.txt";
        String reverseCode = "C:\\Users\\degty\\WorkWithFiles\\src\\reverseCode.txt";
//        VowelLettersReader reader = new VowelLettersReader();
//        reader.readFile("filePath");

//        LastAndFirstLetterReader lastAndFirstLetterReader = new LastAndFirstLetterReader();
//        lastAndFirstLetterReader.readFile("filePath");

//        DigitsReader digitsReader = new DigitsReader();
//        digitsReader.readDigits(digitsPath);

//        WordsChanger changer = new WordsChanger();
//        changer.changeFile(codePath, newCodePath);

        Reverser reverser = new Reverser();
        reverser.reverse(codePath, reverseCode);


    }
}