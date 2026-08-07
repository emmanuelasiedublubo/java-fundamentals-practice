package conditionals;

/*
 * Program: TemperatureCategoryChecker
 * Module: Conditionals
 * Purpose: Classifies temperature as cold, warm, or hot.
 */

public class TemperatureCategoryChecker {

    public static void main(String[] args) {

        int temperature = 28;

        if (temperature < 20) {
            System.out.println("Cold");
        } else if (temperature <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }

    }

}