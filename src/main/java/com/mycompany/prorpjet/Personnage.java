/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prorpjet;

/**
 *
 * @author erwan
 */
public class Personnage {
    private String nomPersonnage;
    private String classePersonnage;
    private int pvActuel;
    private int pvMax;
    private int attaque;
    private int defense;
    private double coupCritique;
    private int kama;

    public Personnage(String nomPersonnage, String classePersonnage, int pvActuel, int pvMax, int attaque, int defense, double coupCritique, int kama) {
        this.nomPersonnage = nomPersonnage;
        this.classePersonnage = classePersonnage;
        this.pvActuel = pvActuel;
        this.pvMax = pvMax;
        this.attaque = attaque;
        this.defense = defense;
        this.coupCritique = coupCritique;
        this.kama = kama;
    }

    public String getNomPersonnage() {
        return nomPersonnage;
    }

    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }

    public String getClassePersonnage() {
        return classePersonnage;
    }

    public void setClassePersonnage(String classePersonnage) {
        this.classePersonnage = classePersonnage;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public double getCoupCritique() {
        return coupCritique;
    }

    public void setCoupCritique(double coupCritique) {
        this.coupCritique = coupCritique;
    }

    public int getKama() {
        return kama;
    }

    public void setKama(int kama) {
        this.kama = kama;
    }


   
 
}
