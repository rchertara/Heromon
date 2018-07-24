package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Powers telekinesis = new Powers("Telekinesis",200, 80, "Mind Control", 20,"");
        Powers freezeTime = new Powers("Freeze Time",130, 70,"Invisibility", 20, "");
        Powers foresight = new Powers("Foresight",90, 30, "Teleportation", 20, "" );
        Powers invisibility = new Powers("Invisibility",100, 50, "Heat Vision", 20, "");
        Powers teleportation = new Powers("Teleportation",140, 70, "Freeze Time", 20, "");
        Powers heatVision = new Powers("Heat Vision",180,75, "Morph", 20, "");
        Powers morph = new Powers("Morph", 150,75,"Telekinesis",20, "");
        Powers mindControl = new Powers ("Mind Control", 350, 300, "",0,"" );

        Items fireball = new Items("Fireball")

        System.out.println("Your heroic quest begins now. Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();

        System.out.println("Please select your power.");
        Scanner scanner1 = new Scanner (System.in);
        String yourPower = scanner.next();


        Character hero = new Character(yourName, yourPower, 1000);
        //Character shadowMonster = new Character("Shadow Monster", "telekinesis", 800)
        //Character iceMonster = newChar
    }
}
