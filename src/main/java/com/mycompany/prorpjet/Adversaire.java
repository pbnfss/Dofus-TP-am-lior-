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
    private double coupCritique;
    private boolean boss;
    public Adversaire(String unNom, int unNbPvActuel, int unNbPvMax, int uneAtk, int uneDef, double unCC, boolean estBoss)
    {        
        this.nomAdversaire = unNom;
        this.attaque = uneAtk;
        this.defense = uneDef;
        this.coupCritique = unCC;
        this.pvActuel = unNbPvActuel;
        this.pvMax = unNbPvMax;
        this.boss = estBoss;
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

    public void setCoupCritique(double coupCritique) {
        this.coupCritique = coupCritique;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

}
