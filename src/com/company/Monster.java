package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Monster {

    String name;
    Powers monsterPower;
    int energy;
   // String description;

    public Monster(String name, Powers monsterPower, int energy /*String description*/){
        this.name = name;
        this.monsterPower = monsterPower;
        this.energy = energy;
        //this.description = description;

    }

    public String toString(){
        return "The " + name +" has appeared! It possesses the power of " + monsterPower.getName() + ". Prepare for battle!";
    }

    public static Monster Generate(ArrayList<Monster>Monsters){
        //if battle is over, or from start keep generating
        Random randomMonster = new Random();
        return Monsters.get(randomMonster.nextInt(Monsters.size()));

    }

}
