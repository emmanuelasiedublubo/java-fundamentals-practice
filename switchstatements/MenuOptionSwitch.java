package switchstatements;

/*
 * Program: MenuOptionSwitch
 * Module: Switch Statements
 * Purpose: Uses a switch statement to perform an action
 * based on a selected menu option.
 */

public class MenuOptionSwitch {

    public static void main(String[] args) {

        int option = 2;

        switch (option) {

            case 1:
                System.out.println("View Profile");
                break;

            case 2:
                System.out.println("Edit Profile");
                break;

            case 3:
                System.out.println("Settings");
                break;

            case 4:
                System.out.println("Logout");
                break;

            default:
                System.out.println("Invalid menu option");
        }
    }
}