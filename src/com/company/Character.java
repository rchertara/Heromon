package com.company;

import java.util.ArrayList;

public class Character {

    private String name;
    private Powers yourPower;
    private int energy;
    ArrayList<Items> Inventory;

    public Character(String name, Powers yourPower, int energy, ArrayList<Items> Inventory) {

        this.name = name;
        this.yourPower = yourPower; //?
        this.energy = energy;
        this.Inventory = Inventory;
    }

    public String toString() {
        return name + " has the power of " + yourPower.getName() + ".";
    }

    public static int Attack(/*monster?*/) {
        //random damage on enemy; report levels
        return 0;
    }

    public String Flee(/*monster? or takes in energy int?*/) {
        //if energy is too low, provide flee option;
        //also needs to remove one item
        return null;
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
    //public static boolean Win() {
       // if (/*enemy energy level == 0*/) {
           // return true;
       // }

   // }
        //public int ifWeakness(String weakness){
        //if monster has weakness power, automatic deduction of 20 energy points in combat
        //  return energy;
        //}


}