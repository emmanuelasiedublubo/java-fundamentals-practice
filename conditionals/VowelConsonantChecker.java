package conditionals;

/*
 * Program: VowelConsonantChecker
 * Module: Conditionals
 * Purpose: Determines whether a character is a vowel or consonant.
 */

public class VowelConsonantChecker {

    public static void main(String[] args) {

        char letter = 'A';

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
                || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {

            System.out.println(letter + " is a Vowel.");

        } else {

            System.out.println(letter + " is a Consonant.");

        }

    }

}
