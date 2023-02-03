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
        
        // Zone I
        Adversaire bouftou = new Adversaire("Bouftou affamé",
                10,
                10,
                3,
                5,
                20,
                false);
        Adversaire tofu = new Adversaire("Tofu immature",
                5,
                5,
                5,
                3,
                40,
                false);
        // Zone II
        Adversaire sanglier = new Adversaire("Sanglier violent",
                20,
                20,
                6,
                10,
                25,
                false);
        Adversaire tournesol = new Adversaire("Tournesol fou",
                10,
                10,
                10,
                6,
                50,
                false);
        // Zone III
        Adversaire craqueboule = new Adversaire("Craqueboule stupide",
                40,
                40,
                12,
                20,
                30,
                false);
        Adversaire bandit = new Adversaire("Bandit hargneux",
                20,
                20,
                20,
                12,
                60,
                false);
        
        // Boss I
        Adversaire milimilou = new Adversaire("Milimilou fourbe",
                20,
                20,
                10,
                10,
                25,
                true);

        // Boss II
        Adversaire mobEponge = new Adversaire("Mob l'Eponge carré",
                40,
                40,
                20,
                20,
                30,
                true);

        // Boss III
        Adversaire bouftouRoyal = new Adversaire("Bouftou Royal",
                80,
                80,
                25,
                25,
                35,
                true);

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
