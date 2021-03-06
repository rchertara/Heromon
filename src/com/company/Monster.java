package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Monster {

    String name;
    Powers monsterPower;
    int energy;
    boolean monsterDefense;
    boolean hasFled;
    boolean deadMonster;
    //boolean powerOn;
   // String description;

    public Monster(String name, Powers monsterPower, int energy /*String description*/){
        this.name = name;
        this.monsterPower = monsterPower;
        this.energy = energy;
        this.hasFled = false;
        this.monsterDefense = false;
        this.deadMonster = false;
        //powerOn = false; // do we want this?
        //this.description = description;

    }

    public void healthStatusMonster(){
        System.out.println("The " + name + " currently has " + this.energy + " points of energy.");
    }

    public void aiMove(Character hero){

        if((this.energy <= 0) && (hero.getEnergy() > 0)){
            deadMonster = true;
            System.out.println("The monster has been defeated! You have won this battle!");
            return;
        }

        if(this.energy>0 && this.energy <=100){
            flee();
            System.out.println("You have won this battle!");
            return;
        }
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        if(randomNum==1){
            Defend();
        }
        else if(randomNum==2){
            powerOn(hero);
        }
        else{
            Attack(hero);
        }
    }

    public void powerOn(Character hero){ //always on? this indicates that the monster is using power AGAINST
        //powerOn = true;
        monsterDefense=false;
       if(hasWeakness(hero)){
           hero.setEnergy(hero.getEnergy()-(this.monsterPower.getInflictDamage()+hero.getYourPower().getIfWeakness()));
           System.out.println(this.name + " has used its super effective power against you, depleting " + (this.monsterPower.getInflictDamage()+hero.getYourPower().getIfWeakness()) + " points of your energy." );

           this.energy = this.energy - this.monsterPower.getEnergyDepletion();
           System.out.println("The enemy has expended " + this.monsterPower.getEnergyDepletion() + " points of energy by using its power.");

       }

       else {
           hero.setEnergy(hero.getEnergy() - this.monsterPower.getInflictDamage());
           System.out.println(this.name + " has used its power against you, depleting " + this.monsterPower.getInflictDamage() + " points of your energy.");

           this.energy = this.energy - this.monsterPower.getEnergyDepletion();
           System.out.println("The enemy has expended " + this.monsterPower.getEnergyDepletion() + " points of energy by using its power.");

       }
    }



    public boolean hasWeakness(Character hero){ //this has to be used within power
        if((this.monsterPower.getName()).equals(hero.getYourPower().getWeakness())){
            return true;
            //this.energy = (this.energy - this.yourPower.getIfWeakness());  //character has power, go into Power properties
            // System.out.println("You have expended " + this.yourPower.getIfWeakness() + "points of energy protecting against " + mon.name + "'s power.");

        }
        return false;
    }

    public void Attack(Character hero) {
        monsterDefense=false;
        //random damage on enemy; report levels]
        int randomNum = ThreadLocalRandom.current().nextInt(50, 100 + 1);

        if(hero.inDefense){
            randomNum=randomNum/2;//lower the attack damage done

        }
        hero.setEnergy(hero.getEnergy()-randomNum);
        if(!hero.inDefense) {
            System.out.println(name + " attacked, " + hero.getName() + " has taken " + randomNum + " points of damage!");
        }
        else{
            System.out.println(name + " attacked! However, " + hero.getName() + " defended, and received only " + randomNum + " points of damage!");
        }
    }

    public void Defend() {
        monsterDefense=true;
        System.out.println(name+ " is in defense mode.");

    }

    public void flee(){
        monsterDefense=false;
        hasFled = true;
        System.out.println(name+" has fled from the battle!");

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
    public void setEnergy(int energy){
        this.energy = energy;
    }
}
