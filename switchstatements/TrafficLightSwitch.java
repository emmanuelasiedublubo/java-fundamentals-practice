package switchstatements;

/*
 * Program: TrafficLightSwitch
 * Module: Switch Statements
 * Purpose: Uses a switch statement to display an action
 * based on a traffic light color.
 */

public class TrafficLightSwitch {

    public static void main(String[] args) {

        String light = "Green";

        switch (light) {

            case "Red":
                System.out.println("Stop");
                break;

            case "Yellow":
                System.out.println("Get Ready");
                break;

            case "Green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid traffic light color");
        }
    }
}