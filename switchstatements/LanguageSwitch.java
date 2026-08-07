package switchstatements;

/*
 * Program: LanguageSwitch
 * Module: Switch Statements
 * Purpose: Uses a switch statement to display a greeting
 * based on a selected language.
 */

public class LanguageSwitch {

    public static void main(String[] args) {

        String language = "French";

        switch (language) {

            case "English":
                System.out.println("Hello!");
                break;

            case "French":
                System.out.println("Bonjour!");
                break;

            case "Spanish":
                System.out.println("Hola!");
                break;

            case "German":
                System.out.println("Hallo!");
                break;

            default:
                System.out.println("Language not available");
        }
    }
}