
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class qwe {
    private static List<String> words = new ArrayList<>();

    public static void main(String[] args) {
        readWordsFromFile("words.txt");
        if (words.isEmpty()) {
            System.out.println("No words found in the file.");
            return;
        }

        String wordToGuess = selectRandomWord();
        String maskedWord = maskWord(wordToGuess);

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (!wordToGuess.equals(maskedWord)) {
            System.out.println("Guess the word: " + maskedWord);
            System.out.print("Enter a letter or the entire word: ");
            String input = scanner.nextLine().trim();

            if (input.length() == 1) {
                char guess = input.charAt(0);
                if (!Character.isLetter(guess)) {
                    System.out.println("Please enter a valid letter.");
                    continue;
                }
                if (wordToGuess.contains(String.valueOf(guess))) {
                    maskedWord = revealLetters(wordToGuess, maskedWord, guess);
                    System.out.println("Correct guess!");
                } else {
                    System.out.println("Incorrect guess. Try again.");
                }
            } else if (input.length() == wordToGuess.length() && input.equalsIgnoreCase(wordToGuess)) {
                maskedWord = input;
                break;
            } else {
                System.out.println("Incorrect word. Try again.");
            }

            attempts++;
        }

        System.out.println("Congratulations! You guessed the word '" + wordToGuess + "' in " + attempts + " attempts.");
        scanner.close();
    }

    private static void readWordsFromFile(String fileName) {
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNextLine()) {
                words.add(fileScanner.nextLine().trim());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    private static String selectRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

    private static String maskWord(String word) {
        return word.replaceAll("[a-zA-Z]", "?");
    }

    private static String revealLetters(String word, String maskedWord, char letter) {
        StringBuilder sb = new StringBuilder(maskedWord);
        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(letter)) {
                sb.setCharAt(i, word.charAt(i));
            }
        }
        return sb.toString();
    }
}
