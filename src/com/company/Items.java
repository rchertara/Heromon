package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Items {

    private String name;
    private int inflictDamage;
    private String description;
    private int healing;

    public Items(String name, int inflictDamage, String description, int healing){

        this.name = name;
        this.inflictDamage = inflictDamage;
        this.description = description;
        this.healing = healing;

    }
    public String toString(){
        return name + ": " + description;
    }

   public static String GrantItem(ArrayList<Items> Items){
       //if wins battle
        Random random = new Random();
       return "You have been granted the " + Items.get(random.nextInt(Items.size()));
    }

}
