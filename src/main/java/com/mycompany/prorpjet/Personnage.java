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
    private int coupCritique;
    private int kama;
    private boolean potion;

    public Personnage(String nomPersonnage,
            String classePersonnage,
            int pvActuel,
            int pvMax,
            int attaque,
            int defense,
            int coupCritique) 
    {
        this.nomPersonnage = nomPersonnage;
        this.classePersonnage = classePersonnage;
        
        this.pvMax = pvMax;
        this.attaque = attaque;
        this.defense = defense;
        this.coupCritique = coupCritique;
        this.kama = 150;
        this.potion = true;
        switch(this.classePersonnage)
        {
            case "Féca":
                this.defense += 2;
                this.attaque -= 2;
                break;
            case "Iop":
                this.attaque += 2;
                this.coupCritique -= 10;
                break;
            case "Cra":
                this.coupCritique += 10;
                this.defense -= 2;
                break;
            case "Sadida":
                this.attaque += 2;
                this.pvMax -= 10;
                break;
            case "Osamodas":
                this.pvMax += 10;
                this.attaque -= 2;
                break;
            case "Sacrieur":
                this.pvMax += 10;
                this.defense -= 2;
                break;
            case "Pandawa":
                this.pvMax += 10;
                this.coupCritique -= 10;
                break;
            case "Eniripsa":
                this.defense += 2;
                this.coupCritique -= 10;
                break;
            case "Sram":
                this.attaque += 2;
                this.defense -= 2;
                break;
            case "Xélor":
                this.defense += 2;
                this.pvMax -= 10;
                break;
            case "Enutrof":
                this.coupCritique += 10;
                this.attaque -= 2;
                break;
            case "Ecaflip":
                this.coupCritique += 10;
                this.pvMax -= 10;
                break;
            
                
        }
        this.pvActuel = this.pvMax;
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

    public void setCoupCritique(int coupCritique) {
        this.coupCritique = coupCritique;
    }

    public int getKama() {
        return kama;
    }

    public void setKama(int kama) {
        this.kama = kama;
    }

    public boolean isPotion() {
        return potion;
    }

    public void setPotion(boolean potion) {
        this.potion = potion;
    }

    
    public void affStats() {
        System.out.println("Ton nom est " + nomPersonnage + ".");
        System.out.println("Tu es un disciple " + classePersonnage + " !");
        System.out.println("Tu as actuellement " + pvActuel + "/" + pvMax + " PV.");
        System.out.println("Tu as une attaque de " + attaque + ".");
        System.out.println("Tu as une défense de " + defense + ".");
        System.out.println("Tu as " + coupCritique + "% de coup critique !");
        System.out.println("Enfin, tu as "+ kama + " kamas.");
    }
    
    public void gagneKama(int gainKama)
    {
        this.kama += gainKama;
    }
    
    public void pertePv(int degat)
    {
        this.pvActuel -= degat;
        if(this.pvActuel <= 0)
            this.pvActuel = 0;
    }
    public void utilisationPotion()
    {
        this.pvActuel = this.pvMax;
    }
    
   
 
}
