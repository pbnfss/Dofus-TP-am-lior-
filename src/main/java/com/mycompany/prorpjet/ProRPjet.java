/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prorpjet;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class ProRPjet {
    
    public static void main(String[] args) {
        fonctionDofus f = new fonctionDofus();
        Scanner s = new Scanner(System.in);
        int choixChoix = 0; 
        int choixZone = 0;
        int choixBoss = 0;
        /*
         * Lance l'introduction.
         * Lance le menu de création du personnage.
         * Créer le personnage.
        */
        Personnage joueur = f.creationPerso();
        //joueur.affStats();
        while (joueur.getPvActuel() > 0)
        {
            choixChoix = f.affChoix();
            if(choixChoix == 1)
            {
                System.out.println("Vous arrivez sur la place marchande");
                s.next();
                System.out.println("Vous quittez la place marchande");
            }
            if(choixChoix == 2)
            {    
                choixZone = f.affZone();
            }
            if(choixChoix == 3)
            {
                choixBoss = f.affBoss();
            } 
        }

    }
}
