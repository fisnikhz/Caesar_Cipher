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
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) ((c - 'a' + key) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                result += (char) ((c - 'A' + key) % 26 + 'A');
            } else {
                result += c;
            }
        }
        return result;

    }


        public static String decrypt(String text, int key) {
            return encrypt(text, 26 - key);
        }





    public static String calculateFrequency(String text) {
          int[] frequency = new int[26];
        int totalLetters = 0;
        for(int i = 0;i < text.length();i++) {
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'z') {
                frequency[c - 'a']++;
                totalLetters++;
            }
        }
        String result = "";
        for(int i = 0;i < 26;i++) {
            double percentage = (double)frequency[i] / totalLetters * 100;
            result += (char) ('a' + 1) + ":" + String.format("%2f",percentage) + "%\n";
        }
        return result;
    }
}
