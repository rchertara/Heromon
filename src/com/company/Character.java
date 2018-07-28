package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Character {

    private String name;
    private Powers yourPower;
    boolean inDefense;
    private int energy;
    private int lives;
    ArrayList<Items> Inventory;

    public Character(String name, Powers yourPower) {

        this.name = name;
        this.yourPower = yourPower; //?
        this.energy = 1000;
        this.lives = 3;
        this.Inventory = new ArrayList<Items>();
    }

    public String toString() {
        return name + " has the power of " + yourPower.getName() + ".";
    }

    public void Attack(Monster mon) {
        inDefense=false;
        //random damage on enemy; report levels]
        int randomDam= (int) Math.random(); //confirm what damage range
        mon.energy=mon.energy-randomDam;
        System.out.println(name+ " attacked, "+ mon.name+ " has taken"+ randomDam+" points of damage!");
        }

    public void Defend() {
        inDefense=true;
        System.out.println(name+ " is in defense mode ");

    }

    public void useItem(Monster mon){
        inDefense=false;
        //first show user all items
        if(getInventory().size()==0){
            System.out.println("You have no items");
            return;
        }
        else{

            for(int i=0;i<getInventory().size();i++){
                System.out.println(i+" " + getInventory().get(i).getName());
            }
            Scanner scan= new Scanner(System.in);
            int choice= scan.nextInt();

            while (choice>=getInventory().size()||choice<0){
                System.out.println("not a valid selection pick again");
                choice=scan.nextInt();
            }

            Items item=getInventory().get(choice);

            if(item.getInflictDamage()==0){
                this.energy=this.energy+item.getHealing();
                System.out.println(name+"used"+item.getName()+",healed up by"+item.getHealing());
                getInventory().remove(choice);

            }
            else{
                mon.energy=mon.energy-item.getInflictDamage();
                System.out.println(name+"used"+item.getName()+",inflicted"+item.getInflictDamage() +"points of damage ");
                getInventory().remove(choice);

            }


        }

    }


    public void Flee(/*monster? or takes in energy int?*/) {
        //if energy is too low, provide flee option;
        //also needs to remove one item
        inDefense=false;

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



   // }
        //public int ifWeakness(String weakness){
        //if monster has weakness power, automatic deduction of 20 energy points in combat
        //  return energy;
        //}


}