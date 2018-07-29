package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Character {

    private String name;
    private Powers yourPower;
    boolean inDefense;
    private int energy;
    private int lives;
    boolean powerOn;

    ArrayList<Items> Inventory;

    public Character(String name, Powers yourPower) {

        this.name = name;
        this.yourPower = yourPower; //?
        this.energy = 1000;
        this.lives = 3;
        this.Inventory = new ArrayList<Items>();
        this.inDefense = false;
        //this.powerOn = false;
    }

    public void healthStatusHero(){
        System.out.println(name + " currently has " + this.energy + " points of energy.");
    }

    public String toString() {
        return name + " has the power of " + yourPower.getName() + ".";
    }

    public void Attack(Monster mon) {
        inDefense=false;

        //random damage on enemy; report levels]
        int randomNum = ThreadLocalRandom.current().nextInt(50, 100 + 1);
        if(mon.monsterDefense==true){
            randomNum=randomNum/2;
            mon.energy = mon.energy - randomNum;
            System.out.println(name + " attacked, but monster has defended so " + mon.name + " only lost " + randomNum + " points of energy");
        }

        else {
            mon.energy = mon.energy - randomNum;
            System.out.println(name + " attacked, " + mon.name + " has lost " + randomNum + " points of energy!");

        }
        }

    public void Defend() {
        inDefense=true;
        System.out.println(name+ " is in defense mode.");

    }

    public void useItem(Monster mon){
        inDefense=false;
        //first show user all items
        if(getInventory().size()==0){
            System.out.println("You have no items. Please select a different option.");
            return;
        }
        else{

            for(int i=0;i<getInventory().size();i++){
                System.out.println(i+" " + getInventory().get(i).getName());
            }
            Scanner scan= new Scanner(System.in);
            int choice= scan.nextInt();

            while (choice>=getInventory().size()||choice<0){
                System.out.println("Not a valid selection. Pick again.");
                choice=scan.nextInt();
            }

            Items item=getInventory().get(choice);

            if(item.getInflictDamage()==0){
                this.energy=this.energy+item.getHealing();
                System.out.println(name+"used"+item.getName()+", and healed "+item.getHealing() + " points of energy.");
                getInventory().remove(choice);
            }
            else{
                mon.energy=mon.energy-item.getInflictDamage();
                System.out.println(name+" used"+item.getName()+", inflicted"+item.getInflictDamage() +" points of damage ");
                getInventory().remove(choice);

            }
        }
    }

    public void Flee(Monster mon) {
        //if energy is too low, provide flee option;
        //also needs to remove one item
        inDefense=false;
        System.out.println(name+" has fled from "+ mon.name);
        if(getInventory().size()!=0) {
            System.out.println(name + " has dropped" + Inventory.get(getInventory().size() - 1).getName());
            Inventory.remove(getInventory().size()-1);

        }
    }


    public void PowerOn(Monster mon){ //ask to turn power on, type yes
        //powerOn = true;
        inDefense=false;
        if(hasWeakness(mon)){
            mon.energy = mon.energy - (this.yourPower.getInflictDamage()+mon.monsterPower.getIfWeakness());
            System.out.println("You have used your super effective power against " + mon.name + " and have depleted " + (this.yourPower.getInflictDamage()+mon.monsterPower.getIfWeakness()) + " points of its energy." );

            this.energy = this.energy - this.yourPower.getEnergyDepletion();
            System.out.println("You have expended " + this.yourPower.getEnergyDepletion() + " points of your own energy by using your power.");

        }
        else {
            mon.energy = mon.energy - this.yourPower.getInflictDamage();
            System.out.println("You have used your power against " + mon.name + " and have depleted " + this.yourPower.getInflictDamage() + " points of its energy.");

            this.energy = this.energy - this.yourPower.getEnergyDepletion();
            System.out.println("You have expended " + this.yourPower.getEnergyDepletion() + " points of your own energy by using your power.");
        }
        //Krisztina do this lol
    }

    public boolean hasWeakness(Monster mon){ //this has to be used within power
        if((mon.monsterPower.getWeakness()).equals(this.yourPower.getName())){
            return true;
           //this.energy = (this.energy - this.yourPower.getIfWeakness());  //character has power, go into Power properties
           // System.out.println("You have expended " + this.yourPower.getIfWeakness() + "points of energy protecting against " + mon.name + "'s power.");

        }
        return false;
    }

    public Powers getYourPower() {
        return yourPower;
    }

    public void setYourPower(Powers yourPower) {
        this.yourPower = yourPower;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public ArrayList<Items> getInventory() {
        return Inventory;
    }

    public void setInventory(ArrayList<Items> inventory) {
        Inventory = inventory;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}