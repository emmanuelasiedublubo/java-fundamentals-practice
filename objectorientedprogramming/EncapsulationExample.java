package objectorientedprogramming;

/*
 * Program: EncapsulationExample
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates encapsulation using private fields
 * and public getter and setter methods.
 */

public class EncapsulationExample {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        EncapsulationExample student = new EncapsulationExample();

        student.setName("Micheal");
        student.setAge(35);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}