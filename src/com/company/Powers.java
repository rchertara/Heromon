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

    public String getName() {
        return name;
    }

    public String toString() {

        return name + ": " + description;
    }

    Powers(Powers other){
        name = other.name;
        inflictDamage = other.inflictDamage;
        energyDepletion = other.energyDepletion;
        weakness = other.weakness;
        ifWeakness = other.ifWeakness;
        description = other.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInflictDamage() {
        return inflictDamage;
    }

    public void setInflictDamage(int inflictDamage) {
        this.inflictDamage = inflictDamage;
    }

    public int getEnergyDepletion() {
        return energyDepletion;
    }

    public void setEnergyDepletion(int energyDepletion) {
        this.energyDepletion = energyDepletion;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getIfWeakness() {
        return ifWeakness;
    }

    public void setIfWeakness(int ifWeakness) {
        this.ifWeakness = ifWeakness;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



