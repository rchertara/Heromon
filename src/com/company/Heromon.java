package com.company;

import java.util.Scanner;
import java.util.ArrayList;


public class Heromon {

    public static void main(String[] args) {

        ArrayList<Powers>Powers = new ArrayList<Powers>();
        ArrayList<Items>Items = new ArrayList<Items>();

        ArrayList<Items>Inventory = new ArrayList<Items>();

       //Powers
        Powers telekinesis = new Powers("Telekinesis",200, 80, "Mind Control", 30,"Move and manipulate objects with your mind. Increases attack by 200 energy points, but depletes your own energy by 80 points. If faced with an enemy bearing Mind Control, an extra 30 points of energy are expended in defense.");
        Powers.add(telekinesis);

        Powers freezeTime = new Powers("Freeze Time",130, 70,"Invisibility", 20, "Reduce the impact of enemy attacks by stopping time. Increases attack by 130 energy points, but depletes your own energy by 70 points. If faced with an enemy bearing Invisibility, an extra 20 points of energy are expended in defense.");
        Powers.add(freezeTime);

        Powers foresight = new Powers("Foresight",90, 30, "Teleportation", 20, "See into the future. Increases attack by 90 energy points, but depletes your own energy by 30 points. If faced with an enemy bearing Teleportation, an extra 20 points of energy are expended in defense." );
        Powers.add(foresight);

        Powers invisibility = new Powers("Invisibility",100, 40, "Heat Vision", 20, "Remove yourself from sight. Increases attack by 100 energy points, but depletes your own energy by 40 points. If faced with an enemy bearing Heat Vision, an extra 50 points of energy are expended in defense.");
        Powers. add(invisibility);

        Powers teleportation = new Powers("Teleportation",140, 70, "Freeze Time", 20, "Transport your own body from one location to another instantly. Increases attack by 140 energy points, but depletes your own energy by 70 points. If faced with an enemy bearing Freeze Time, an extra 20 points of energy are expended in defense.");
        Powers.add(teleportation);

        Powers heatVision = new Powers("Heat Vision",180,75, "Morph", 30, "Detect the presence of living organisms by tracking heat. Added bonus of laser beams shot from the eyes. Increases attack by 180 points, but depletes your own energy by 75 points. If faced with an enemy bearing Morph, an extra 30 points of energy are expended in defense.");
        Powers.add(heatVision);

        Powers morph = new Powers("Morph", 150,75,"Telekinesis",20, "Temporarily transform yourself into any animate object, or duplicate your own body. Increases attack by 150 points of energy but depletes your own energy by 75 points. If faced with an enem bearing Telekinesis, an extra 20 points of energy are expended in defense.");
        Powers.add(morph);

        Powers mindControl = new Powers ("Mind Control", 350, 310, "",0,"The most feared of powers. Control your enemy's thoughts and actions. Increases attack by 350 points, but depletes your own energy by 310 points. No weaknesses." );
        Powers.add(mindControl);



        //Items
        Items fireball = new Items("Fireball", 80, "With fire at your fingertips, you can incinerate your enemies! Does 80 points of damage.", 0);
        Items.add(fireball);

        Items elixirOfLife = new Items("Elixir of Life", 0, "If you have incurred any damage, the elixir of life will restore 200 points of health.", 200);
        Items.add(elixirOfLife);

        Items chocolatePudding = new Items("Chocolate Pudding",0, "Refuel with a quick snack. Chocolate Pudding grants 50 points of energy.", 50);
        Items.add(chocolatePudding);

        Items magicWand = new Items ("Magic Wand", 100, "Cast a spell and send your enemy to his fate! 100 points of damage.", 0);
        Items.add(magicWand);

        Items ancientSword = new Items ("Ancient Sword", 50, "Harness the power of knights before you. Takes 50 points of energy from your enemy.", 0);
        Items.add(ancientSword);

        Items tallGlassOfWater = new Items ("Tall Glass of Water", 0, "Take a drink and replenish 30 points of energy.", 30);
        Items.add(tallGlassOfWater);

        Items cursedRing = new Items("Cursed Ring", 65, "Temporarily turns your enemy into gold. Does 65 points of damage.", 0);
        Items.add(cursedRing);

        Items ancientScrolls = new Items("Ancient Scrolls", 45, "Your victory is written in the stars. Consult the scrolls and lower enemy energy by 45 points.", 0);
        Items.add(ancientScrolls);

        Items philosophersStone = new Items ("Philosopher's Stone", 200, "The most revered of magical items. Defeat your enemies up to 200 energy points at at time.", 0);
        Items.add(philosophersStone);

        Items sliceOfPizza = new Items("Slice of Pizza", 0, "Low on energy? Stock up 80 points of energy with a good ol' slice of pizza!", 80);
        Items.add(sliceOfPizza);

        System.out.println("Your heroic quest begins now. Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();
        System.out.println();

       System.out.println(yourName + ", please select the number of your chosen power from the list below.");
        for(int i = 0; i < Powers.size(); i++){
            System.out.print(i + ") ");
            System.out.println((Powers.get((i))));
            System.out.println();
        }


        Scanner scanner1 = new Scanner (System.in);
        String choice = scanner1.nextLine();
        Powers yourPower = null;
        Character hero = null;
        if (choice.equals("0") || choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5") || choice.equals("6") || choice.equals("7")){
            int choice1 = Integer.parseInt(choice);
            System.out.print("You have chosen " + (Powers.get(choice1)).getName());
            System.out.println("!");
            yourPower = new Powers(Powers.get(choice1));
            hero = new Character(yourName, yourPower,1000, Inventory);
           // System.out.println(hero);

        }
        else {
            while(!choice.equals("0") && !choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5") && !choice.equals("6") && !choice.equals("7")){

                System.out.println("Invalid selection. Please choose between 0 and 7.");
                choice = scanner1.nextLine();
                int choice1 = Integer.parseInt(choice);
                System.out.print("You have chosen " + (Powers.get(choice1)).getName());
                System.out.println("!");
                yourPower = (Powers.get(choice1));
                hero = new Character(yourName, yourPower,1000, Inventory);
            }
        }
       // System.out.println(hero);
        System.out.println();
        System.out.println("Brave traveler, be on the look-out for monsters!");






    }
}
