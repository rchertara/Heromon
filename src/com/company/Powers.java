package com.company;

public class Powers {

    private int inflictDamage; //inflicts extra damage on enemy
    private int energyDepletion; //downside to using power, takes up extra energy
    private String weakness;
    private int ifWeakness; //depletes extra energy if enemy has the indicated power

    public Powers(int inflictDamage, int energyDepletion, String weakness, int ifWeakness) {

        this.inflictDamage = inflictDamage;
        this.energyDepletion = energyDepletion;
        this.weakness = weakness;
        this.ifWeakness = ifWeakness;
    }
}
