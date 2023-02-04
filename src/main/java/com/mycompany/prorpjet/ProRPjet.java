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
    static fonctionDofus f = new fonctionDofus();
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int choixChoix = 0; 
        int choixZone = 0;
        int choixBoss = 0;
        int choixCoffre = 0;
        int choixTaverne = 0;
        int choixPlace = 0;
        int gainKama = 0;
        int nbAlea;
        int nbAleaCoffre;
        String affTaverne = "-----------------------------------------------------\n"
                + "Voulez-vous vous reposez (250 kames)?\n"
                + "1 - Oui\n"
                + "2 - Non\n"
                + "-----------------------------------------------------\n";
        String affCoffre = "-----------------------------------------------------\n" 
                + "Vous trouvez un coffre !\n"
                + "Voulez-vous l'ouvrir ?\n"
                + "1 - Oui\n"
                + "2 - Non\n"
                + "-----------------------------------------------------\n";
        String affPlace = "-----------------------------------------------------\n" 
                + "Que voulez-vous acheter (50 Kamas)?\n"
                + "1 - Parchemin PV (+5)\n"
                + "2 - Parchemin Critique (+2)\n"
                + "3 - Parchemin d'Attaque (+2)\n"
                + "4 - Parchemin de Défense (+2)\n"
                + "5 - Potion\n"
                + "6 - (retour)\n"
                + "-----------------------------------------------------\n";
        // Zone I
        Adversaire bouftou = new Adversaire("Bouftou affamé",
                10,
                10,
                3,
                5,
                20,
                false,
                1);
        Adversaire tofu = new Adversaire("Tofu immature",
                5,
                5,
                5,
                3,
                40,
                false,
                1);        
        // Zone II
        Adversaire sanglier = new Adversaire("Sanglier violent",
                20,
                20,
                6,
                10,
                25,
                false,
                2);
        Adversaire tournesol = new Adversaire("Tournesol fou",
                10,
                10,
                10,
                6,
                50,
                false,
                2);        
        // Zone III
        Adversaire craqueboule = new Adversaire("Craqueboule stupide",
                40,
                40,
                12,
                20,
                30,
                false,
                3);
        Adversaire bandit = new Adversaire("Bandit hargneux",
                20,
                20,
                20,
                12,
                60,
                false,
                3);        
        // Boss I
        Adversaire milimilou = new Adversaire("Milimilou fourbe",
                20,
                20,
                10,
                10,
                25,
                true,
                1);
        // Boss II
        Adversaire mobEponge = new Adversaire("Mob l'Eponge carré",
                40,
                40,
                20,
                20,
                30,
                true,
                2);
        // Boss III
        Adversaire bouftouRoyal = new Adversaire("Bouftou Royal",
                80,
                80,
                25,
                25,
                35,
                true,
                3);

        /*
         * Lance l'introduction.
         * Lance le menu de création du personnage.
         * Créer le personnage.
        */
        Personnage joueur = f.creationPerso();
        //joueur.affStats();
        while(true)
        {
            if(joueur.getPvActuel() == 0)
            {
                break;
            }
            choixChoix = f.affChoix();
            if(choixChoix == 1)
            { 
                System.out.println("Vous arrivez sur la place marchande");
                choixPlace = f.repet(6, affPlace);
                if(choixPlace == 1)
                {
                    // Parchemin PV
                    if(joueur.getKama() < 250)
                        System.out.println("Vous n'avez pas assez de Kamas...");
                    else
                    {
                        joueur.perdreKama(250);
                        joueur.augPV(5);
                        System.out.println("Vous avez acheté un parchemin de PV.");
                        joueur.affKama();
                    }
                }
                if(choixPlace == 2)
                {
                    // Parchemin Critique
                    if(joueur.getKama() < 250)
                        System.out.println("Vous n'avez pas assez de Kamas...");
                    else
                    {
                        joueur.perdreKama(250);
                        joueur.augCrit(2);
                        System.out.println("Vous avez acheté un parchemin Critique.");
                        joueur.affKama();
                    }
                }
                if(choixPlace == 3)
                {
                    // Parchemin Attaque
                    if(joueur.getKama() < 250)
                        System.out.println("Vous n'avez pas assez de Kamas...");
                    else
                    {
                        joueur.perdreKama(250);
                        joueur.augAttaque(2);
                        System.out.println("Vous avez acheté un parchemin de Attaque.");
                        joueur.affKama();
                    }
                }
                if(choixPlace == 4)
                {
                    // Parchemin Défense
                    if(joueur.getKama() < 250)
                        System.out.println("Vous n'avez pas assez de Kamas...");
                    else
                    {
                        joueur.perdreKama(250);
                        joueur.augDefense(2);
                        System.out.println("Vous avez acheté un parchemin de Défense.");
                        joueur.affKama();
                    }
                }
                if(choixPlace == 5)
                {
                    // Potion
                    if(joueur.getKama() < 250)
                        System.out.println("Vous n'avez pas assez de Kamas...");
                    else if(joueur.isPotion() == true)
                    {
                        System.out.println("Vous avez déjà une potion.");
                    }
                    else
                    {
                        joueur.perdreKama(250);
                        joueur.setPotion(true);
                        System.out.println("Vous avez acheté une potion.");
                        joueur.affKama();
                    }
                }
                System.out.println("Vous quittez la place marchande");
            }
            if(choixChoix == 2)
            {    
                choixZone = f.affZone();
                if(choixZone == 1)
                {
                    
                    System.out.println("Vous vous rendez dans la forêt");
                    nbAlea = f.alea();
                    if(nbAlea < 20)
                    {
                        // Coffre
                        choixCoffre = f.repet(2, affCoffre);
                        if(choixCoffre == 1)
                        {
                            nbAleaCoffre = f.alea();
                            if(nbAleaCoffre < 20)
                            {
                                // Coffre piégé
                                System.out.println("BOOOM !");
                                System.out.println("Les roublards ont piégé ce coffre");
                                System.out.println("Vous perdez 5 pv.");
                                joueur.pertePv(5);
                                if(joueur.getPvActuel() == 0)
                                {
                                    break;
                                }
                            }
                            else if(nbAleaCoffre < 90)
                            {
                                // Coffre récompense
                                System.out.println("Vous trouvez 250 kamas !");
                                joueur.gagneKama(250);
                            }
                            else
                            {
                                // Coffre vide
                                System.out.println("Le coffre semble avoir déjà été fouillé...");
                                System.out.println("Il est vide.");
                            }
                        }
                    }
                    else if(nbAlea < 85)
                    {
                        // Combat
                    }
                    else
                    {
                        // Trouver
                        gainKama = f.alea();
                        System.out.println("Vous avez trouvé " + gainKama + " kamas, quelle CHANCE !");
                        joueur.gagneKama(gainKama);
                    }
                }
                if(choixZone == 2)
                {
                    System.out.println("Vous vous dirigez vers les champs");
                    nbAlea = f.alea();
                    if(nbAlea < 20)
                    {
                        // Coffre
                        choixCoffre = f.repet(2, affCoffre);
                        nbAleaCoffre = f.alea();
                        if(choixCoffre == 1)
                        {
                            if(nbAleaCoffre < 20)
                            {
                                // Coffre piégé
                                System.out.println("BOOOM !");
                                System.out.println("Les roublards ont piégé ce coffre");
                                System.out.println("Vous perdez 15 pv.");
                                joueur.pertePv(15);
                                if(joueur.getPvActuel() == 0)
                                {
                                    break;
                                }
                            }
                            else if(nbAleaCoffre < 90)
                            {
                                // Coffre récompense
                                System.out.println("Vous trouvez 750 kamas !");
                                joueur.gagneKama(750);
                            }
                            else
                            {
                                // Coffre vide
                                System.out.println("Le coffre semble avoir déjà été fouillé...");
                                System.out.println("Il est vide.");
                            }
                        }
                    }
                    else if(nbAlea < 85)
                    {
                        // Combat
                    }
                    else
                    {
                        // Trouver
                        gainKama = f.alea()*5;
                        System.out.println("Vous avez trouvé " + gainKama + " kamas, quelle CHANCE !");
                        joueur.gagneKama(gainKama);
                    }
                }
                if(choixZone == 3)
                {
                    System.out.println("Vous atteignez la zone rocheuse");
                    nbAlea = f.alea();
                    if(nbAlea < 20)
                    {
                        // Coffre
                        choixCoffre = f.repet(2, affCoffre);
                        nbAleaCoffre = f.alea();
                        if(choixCoffre == 1)
                        {
                            if(nbAleaCoffre < 20)
                            {
                                // Coffre piégé
                                System.out.println("BOOOM !");
                                System.out.println("Les roublards ont piégé ce coffre");
                                System.out.println("Vous perdez 30 pv.");
                                joueur.pertePv(30);
                                if(joueur.getPvActuel() == 0)
                                {
                                    break;
                                }
                            }
                            else if(nbAleaCoffre < 90)
                            {
                                // Coffre récompense
                                System.out.println("Vous trouvez 1500 kamas !");
                                joueur.gagneKama(1500);
                            }
                            else
                            {
                                // Coffre vide
                                System.out.println("Le coffre semble avoir déjà été fouillé...");
                                System.out.println("Il est vide.");
                            }
                        }
                    }
                    else if(nbAlea < 85)
                    {
                        // Combat
                    }
                    else
                    {
                        // Trouver
                        gainKama = f.alea()*10;
                        System.out.println("Vous avez trouvé " + gainKama + " kamas, quelle CHANCE !");
                        joueur.gagneKama(gainKama);
                    }
                }   
            }
            if(choixChoix == 3)
            {
                choixBoss = f.affBoss();
                if(choixBoss == 1)
                {
                   System.out.println("Vous voici devant le terrible MILIMILOU");
                   // Combat contre Milimilou
                   
                   
                   
                   joueur.setKama(500);
                }
                if(choixBoss == 2)
                {
                   System.out.println("Vous vous attaquez au pitoyable MOB L'EPONGE");
                   // Combat contre Mob l'éponge
                   
                   
                   
                   joueur.setKama(1000);
                }
                if(choixBoss == 3)
                {
                    System.out.println("Vous foncez sur le colossal BOUFTOU ROYAL");
                    //Combat contre le Bouftou royal
                    
                    
                    
                    joueur.setKama(5000);
                }
            }
            if(choixChoix == 4)
            {
                System.out.println("Vous vous posez à la taverne, tranquille.");
                choixTaverne = f.repet(2, affTaverne);
                if(choixTaverne == 1)
                {
                    if( joueur.getKama() >= 250)
                    {
                        joueur.reposTaverne();
                        System.out.println("Un repos salutaire !");
                        joueur.perdreKama(250);
                        joueur.affKama();
                        joueur.affVie();
                    }
                    else
                    {
                        System.out.println("Vous n'avez pas assez de Kamas... Dehors !");
                    }
                }
                System.out.println("Vous quittez la taverne.");
            }
            if(choixChoix == 5)
            {
                joueur.affStats();
            }
            if(choixChoix == 6)
            {
                break;
            }
        }
        if(choixChoix != 6)
        {
            System.out.println("Vous êtes mort !");   
        }
        System.out.println("Vous quittez Dofus.");
    }
    

    /*
    public static void phaseAventure(int choixZone)
    {
                if(choixZone == 1)
                {
                   System.out.println("Vous vous rendez dans la forêt");
                   s.next();
                   nbAlea = f.alea();
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
    public static void phaseBoss(int choixBoss)
    {
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
    */
}
