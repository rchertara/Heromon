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