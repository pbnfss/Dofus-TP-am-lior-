/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prorpjet;

/**
 *
 * @author erwan
 */
public class Adversaire {
    private String nomAdversaire;
    private int pvActuel;
    private int pvMax;
    private int attaque;
    private int defense;
    private int coupCritique;
    private boolean boss;
    private int zone;
    public Adversaire(String unNom,
            int unNbPvActuel,
            int unNbPvMax,
            int uneAtk,
            int uneDef,
            int unCC,
            boolean estBoss,
            int dansZone)
    {        
        this.nomAdversaire = unNom;
        this.attaque = uneAtk;
        this.defense = uneDef;
        this.coupCritique = unCC;
        this.pvActuel = unNbPvActuel;
        this.pvMax = unNbPvMax;
        this.boss = estBoss;
        this.zone = dansZone;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getNomAdversaire() {
        return nomAdversaire;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public double getCoupCritique() {
        return coupCritique;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setNomAdversaire(String nomAdversaire) {
        this.nomAdversaire = nomAdversaire;
    }

    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setCoupCritique(int coupCritique) {
        this.coupCritique = coupCritique;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }
    public void affStatsCombat() {
        System.out.println(this.nomAdversaire + " :");
        System.out.println("Il a actuellement " + this.pvActuel + "/" + this.pvMax + " PV.");
        System.out.println("Il a une attaque de " + this.attaque + ".");
        System.out.println("Il a une défense de " + this.defense + ".");
        System.out.println("Enfin, il a " + this.coupCritique + "% de coup critique.");
        System.out.println("-----------------------------------------------------");
    }
    public void subirDegat(int attaquePersonnage, boolean critiquePersonnage)
    {
        int degatPersonnage = attaquePersonnage;
        if(critiquePersonnage)
            degatPersonnage += attaquePersonnage;
        degatPersonnage -= this.defense;
        if(degatPersonnage < 0)
            degatPersonnage = 0;
        System.out.println(this.nomAdversaire + " perd "+degatPersonnage+" pv.");
        this.pvActuel = this.pvActuel - degatPersonnage;
    }
}
