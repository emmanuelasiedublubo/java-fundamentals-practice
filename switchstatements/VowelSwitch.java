package switchstatements;

/*
 * Program: VowelSwitch
 * Module: Switch Statements
 * Purpose: Uses a switch statement to determine whether
 * a character is a vowel or consonant.
 */

public class VowelSwitch {

    public static void main(String[] args) {

        char letter = 'E';

        switch (letter) {

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a vowel.");
                break;

            default:
                System.out.println(letter + " is a consonant.");
        }
    }
}