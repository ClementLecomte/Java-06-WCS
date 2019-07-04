package fr.java06;

public class Classroom {

    public static void main(String[] args) {
        Wilder clement = new Wilder("Clément" , true);
        Wilder alex = new Wilder("Alex" , false);

        System.out.println(clement.whoami());
        System.out.println(alex.whoami());
    }
}