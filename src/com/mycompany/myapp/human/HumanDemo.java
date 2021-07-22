package com.mycompany.myapp.human;

public class HumanDemo {
    public static void main(String[] args) {
        Human person1 = new Human("Klopenko", "Serhii");
        Human person2 = new Human("Petrenko", "Oleksandr", "Igorovych");

        person1.getFullName();
        person1.getShortName();
        System.out.println();
        person2.getFullName();
        person2.getShortName();
    }
}
