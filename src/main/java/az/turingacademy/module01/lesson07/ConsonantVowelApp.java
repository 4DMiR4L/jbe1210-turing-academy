package az.turingacademy.module01.lesson07;

import java.util.Scanner;

public class ConsonantVowelApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scanner.nextLine();

        char lastLetter = word.charAt(word.length() - 1);
        char[] vowels = {'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü','A', 'I', 'O', 'U', 'E', 'Ə', 'İ', 'Ö', 'Ü'};

        for (int i = 0; i < word.length()-1; i++) {
            if (lastLetter == vowels[i]) {
                System.out.print("vowel");
                break;
            }else {
                System.out.print("consonant");
                break;
            }
        }
    }
}
