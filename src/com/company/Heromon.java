package com.company;

import java.util.Scanner;
import java.util.ArrayList;


public class Heromon {

   /* public static boolean roundOver(int heroEnergy, int monsterEnergy){
        if(hero.getEnergy() == 0 || currentMonster.getEnergy() == 0) {
            return true;
        }
        return false;
    } */

    public static void main(String[] args) {

        ArrayList<Powers>Powers = new ArrayList<Powers>();
        ArrayList<Monster>Monsters = new ArrayList<Monster>();
        ArrayList<Items>Items = new ArrayList<Items>();

       //ArrayList<Items>Inventory = new ArrayList<Items>();

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

        //Monsters
        Monster shadowMonster = new Monster("Shadow Monster", mindControl, 500/*, "Beware of dark corners, home to the Shadow Monster. Manipulative and highly dangerous, it takes no prisoners!"*/);
        Monsters.add(shadowMonster);

        Monster seaMonster = new Monster("Sea Monster", morph, 500/*, "The Reptilian Monster lurks in the slimy bogs of the south. Just when you think you're about to defeat it, the Monster multiplies!"*/);
        Monsters.add(seaMonster);

        Monster lavaMonster = new Monster("Lava Monster", heatVision, 500/*, "Take care, or you'll find yourself in the fiery clutches of the Lava Monster, hungry for its next meal."*/);
        Monsters.add(lavaMonster);

        Monster windMonster = new Monster("Wind Monster", teleportation, 500);
        Monsters.add(windMonster);

        Monster spiritMonster = new Monster("Spirit Monster", invisibility, 500);
        Monsters.add(spiritMonster);

        Monster stoneMonster = new Monster("Stone Monster", foresight, 500);
        Monsters.add(stoneMonster);

        Monster iceMonster = new Monster("Ice Monster", freezeTime, 500);
        Monsters.add(iceMonster);

        Monster electricMonster = new Monster ("Electric Monster", telekinesis, 500);
        Monsters.add(electricMonster);

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

        //ACTUAL GAMEPLAY

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
            hero = new Character(yourName, yourPower);
           // System.out.println(hero);

        }
        else {
            while(!choice.equals("0") && !choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5") && !choice.equals("6") && !choice.equals("7")) {

                System.out.println("Invalid selection. Please choose between 0 and 7.");
                choice = scanner1.nextLine();
            //} check if this is better for loop
                int choice1 = Integer.parseInt(choice);
                System.out.print("You have chosen " + (Powers.get(choice1)).getName());
                System.out.println("!");
                yourPower = (Powers.get(choice1));
                hero = new Character(yourName, yourPower);
            }
        }

       // System.out.println(hero);
        System.out.println();
        System.out.println("Brave traveler, be on the look-out for monsters!");
        System.out.println("There's rustling in those bushes...");
        Monster currentMonster = Monster.Generate(Monsters);//to call methods from other classes, use class name dot method and then input
        System.out.println(currentMonster);
        System.out.println();


     //   while(hero.energy > 0 ) //generate getters and setters

        //*****BATTLE START*****

        ArrayList<String>battleOptions = new ArrayList<String>();
        battleOptions.add("Attack");
        battleOptions.add("Defend");
        battleOptions.add("Flee");
        battleOptions.add("Power On");
        battleOptions.add("Use an item");

        while(hero.getEnergy() > 0 ){ // Check this error with the static/non-static stuff*******

            Character.ifWeakness();

            System.out.println("Please select the number of your desired course of action."); //function? if item is granted call function and print out, add to inventory
            for(int j = 0; j< battleOptions.size(); j++) {
                System.out.print(j + ") ");
                System.out.println(battleOptions.get(j));
                System.out.println();
                Scanner scanner2 = new Scanner(System.in);
                String option = scanner.nextLine();

                if (option.equals("0") || option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4")) {
                    int option1 = Integer.parseInt(option);
                    System.out.println("You have chosen to " + battleOptions.get(option1));

                    if(option1 == 0){
                        Character.Attack(currentMonster);

                    }
                    else if(option1 == 1){
                        Character.Defend(currentMonster);
                    }
                    else if(option1 == 2){
                        Character.Flee(currentMonster);

                    }
                    else if(option1 == 3){
                        //Character.powerOn = true;
                        Character.PowerOn(currentMonster);
                    }
                    else{
                        Character.useItem(currentMonster);

                    }
                }
                else{
                    while(!option.equals("0") && !option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")) {
                        System.out.println("Not valid selection. Please choose between 0 and 4.");
                        option = scanner.nextLine();
                    }
                        int option1 = Integer.parseInt(option);
                        System.out.println("You have chosen to " + battleOptions.get(option1));

                    if(option1 == 0){
                        Character.Attack(currentMonster);
                    }
                    else if(option1 == 1){
                        Character.Defend(currentMonster);

                    }
                    else if(option1 == 2){
                        Character.Flee(currentMonster);

                    }
                    else if(option1 == 3){
                        //Character.powerOn = true;
                        Character.PowerOn(currentMonster);
                    }
                    else{
                        Character.useItem(currentMonster);
                    }

                    //now wait for monster to attack!!

                }
            }

            //at the start of each turn, prompt user to turn power on or off and to use any items
            //print updated damage to





        }






    }
}
