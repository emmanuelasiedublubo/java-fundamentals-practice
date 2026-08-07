package switchstatements;

/*
 * Program: GradeSwitch
 * Module: Switch Statements
 * Purpose: Uses a switch statement to display a message
 * based on a letter grade.
 */

public class GradeSwitch {

    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Pass");
                break;

            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade");
        }
    }
}