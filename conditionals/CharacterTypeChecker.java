package conditionals;

/*
 * Program: CharacterTypeChecker
 * Module: Conditionals
 * Purpose: Determines whether a character is a letter, digit, or special character.
 */

public class CharacterTypeChecker {

    public static void main(String[] args) {

        char character = 'A';

        if ((character >= 'A' && character <= 'Z') ||
            (character >= 'a' && character <= 'z')) {

            System.out.println(character + " is a Letter.");

        } else if (character >= '0' && character <= '9') {

            System.out.println(character + " is a Digit.");

        } else {

            System.out.println(character + " is a Special Character.");

        }

    }

}