package conditionals;

/*
 * Program: LeapYearChecker
 * Module: Conditionals
 * Purpose: Determines whether a given year is a leap year.
 */

public class LeapYearChecker {

    public static void main(String[] args) {

        int year = 2024;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

    }

}