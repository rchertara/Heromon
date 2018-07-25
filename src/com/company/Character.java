package com.company;

import java.util.ArrayList;

public class Character {

    private String name;
    private String powers;
    private int energy;
    ArrayList<Items>Inventory;

    public Character(String name, String powers, int energy, ArrayList<Items> Inventory) {

        this.name = name;
        this.powers = powers; //?
        this.energy = energy;
        this.Inventory = Inventory;
    }


    //public int ifWeakness(String weakness){
        //if monster has weakness power, automatic deduction of 20 energy points in combat
      //  return energy;
    //}
}
