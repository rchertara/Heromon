package com.company;

public class Powers {

    private String name;
    private int inflictDamage; //inflicts extra damage on enemy
    private int energyDepletion; //downside to using power, takes up extra energy
    private String weakness;
    private int ifWeakness; //depletes extra energy if enemy has the indicated power
    private String description;

    public Powers(String name, int inflictDamage, int energyDepletion, String weakness, int ifWeakness, String description) {

        this.name = name;
        this.inflictDamage = inflictDamage;
        this.energyDepletion = energyDepletion;
        this.weakness = weakness;
        this.ifWeakness = ifWeakness;
        this.description = description;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return name + ": " + description;
    }

   // public static String ChoosePower(/*array?*/){

    //}

}
