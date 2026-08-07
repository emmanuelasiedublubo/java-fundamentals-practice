package switchstatements;

/*
 * Program: NumberToWordSwitch
 * Module: Switch Statements
 * Purpose: Uses a switch statement to convert a number
 * from 1 to 5 into its word equivalent.
 */

public class NumberToWordSwitch {

    public static void main(String[] args) {

        int number = 3;

        switch (number) {

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;

            default:
                System.out.println("Number must be between 1 and 5");
        }
    }
}