import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        String plainText = readPlainTextFromFile("plainText.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        String cipherText = encrypt(plainText, key);
        System.out.println("Cipher text: " + cipherText);

        String decryptedText = decrypt(cipherText, key);
        System.out.println("Decrypted text: " + decryptedText);

        String frequency = calculateFrequency(cipherText);
        System.out.println("Frequency analysis: \n" + frequency);
    }

    public static String readPlainTextFromFile(String fileName) {
        String result = "";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                result += scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        return result;
    }
    

    public static String encrypt(String text, int key) {
         //TODO
    }

    public static String decrypt(String text, int key) {
      //TODO
    }

    public static String calculateFrequency(String text) {
          //TODO
    }
}