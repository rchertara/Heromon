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

    public void aiMove(Character hero){
        if(this.energy<=100){
            flee();
        }
        else{
            Attack(hero);
        }
    }

    public void Attack(Character hero) {

        //random damage on enemy; report levels]
        int randomDam= (int) Math.random(); //confirm what damage range
        if(hero.inDefense){
            randomDam=randomDam/2;//lower the attack damage done

        }
        hero.setEnergy(hero.getEnergy()-randomDam);
        if(!hero.inDefense) {
            System.out.println(name + " attacked, " + hero.getName() + " has taken" + randomDam + " points of damage!");
        }
        else{
            System.out.println(name + " attacked however, " + hero.getName() + "defended, received only" + randomDam + " points of damage!");
        }
    }

    public void flee(){
        System.out.println(name+"has fled from the battle");

    }

    public String toString(){
        return "The " + name +" has appeared! It possesses the power of " + monsterPower.getName() + ". Prepare for battle!";
    }

    public static Monster Generate(ArrayList<Monster>Monsters){
        //if battle is over, or from start keep generating
        Random randomMonster = new Random();
        return Monsters.get(randomMonster.nextInt(Monsters.size()));

    }

    public int getEnergy() {
        return energy;
    }
}
