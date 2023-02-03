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
                if(choixZone == 1)
                {
                   System.out.println("Vous vous rendez dans la forêt");
                   s.next(); 
                }
                if(choixZone == 2)
                {
                   System.out.println("Vous vous dirigez vers les champs");
                   s.next(); 
                }
                if(choixZone == 3)
                {
                    System.out.println("Vous vous atteignez la zone rocheuse");
                    s.next();
                }
            }
            if(choixChoix == 3)
            {
                choixBoss = f.affBoss();
                               
                if(choixBoss == 1)
                {
                   System.out.println("Vous voici devant le terrible MILIMILOU");
                   s.next(); 
                }
                if(choixBoss == 2)
                {
                   System.out.println("Vous vous attaquez au pitoyable MOB L'EPONGE");
                   s.next(); 
                }
                if(choixBoss == 3)
                {
                    System.out.println("Vous foncez sur le colossal BOUFTOU ROYAL");
                    s.next();
                }
            }
            if(choixChoix == 4)
            {
                System.out.println("Vous vous posez à l'auberge, tranquille");
                s.next();
            }
        }

    }
}
