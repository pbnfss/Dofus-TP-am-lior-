/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prorpjet;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class fonctionDofus {
    Scanner s = new Scanner(System.in);

    public fonctionDofus() {
    }
    
    public String introduction()
    {   
        System.out.println("Bienvenue jeune âme ! Bienvenue dans le monde des Douze.");
        System.out.println("Un  monde paisible sous la protection des douze Dieux, une terre de légende où règne la magie des Dofus, six oeufs de dragon, symboles de puissance et porteurs d'espoir.");
        System.out.println("Jusqu'à ce jour terrible, où ils furent dérobés !");
        System.out.println("Depuis, l'harmonie est perturbée, éléments et monstres se déchaînent.");
        System.out.println("Le temps est venue ! Ta destinée te mène à Incarnam.");
        System.out.println("Découvre le monde, trouve de précieux alliés, retrouve les Dofus, deviens un héros et entre dans la légende !");
              
        int choix = 0;
        while(choix < 1 | choix > 12)
        {
            System.out.println("A quelle classe appartenez-vous ? (1-12)");
            System.out.println("1 - Féca (+Def / -Atk)");
            System.out.println("2 - Iop (+Atk / -Crit)");
            System.out.println("3 - Cra (+Crit / -Def)");
            System.out.println("4 - Sadida (+Atk / -PV)");
            System.out.println("5 - Osamodas (+PV / -Atk)");
            System.out.println("6 - Sacrieur (+PV / -Def)");
            System.out.println("7 - Pandawa (+PV / -Crit)");
            System.out.println("8 - Eniripsa (+Def / -Crit)");
            System.out.println("9 - Sram (+Atk / -Def)");
            System.out.println("10 - Xélor (+Def / -PV)");
            System.out.println("11 - Enutrof (+Crit / -Atk)");
            System.out.println("12 - Ecaflip (+Crit / -PV)");           
            
            try
            {
                choix = Integer.parseInt(s.next());
            }
            catch (Exception e)
            {
                System.out.println("Choix invalide");
            }
        }
        String classe;
        switch(choix)
        {
            case 1:
                classe = "Féca";
                break;
            case 2:
                classe = "Iop";
                break;
            case 3:
                classe = "Cra";
                break;
            case 4:
                classe = "Sadida";
                break;
            case 5:
                classe = "Osamodas";
                break;
            case 6:
                classe = "Sacrieur";
                break;
            case 7:
                classe = "Pandawa";
                break;
            case 8:
                classe = "Eniripsa";
                break;
            case 9:
                classe = "Sram";
                break;
            case 10:
                classe = "Xélor";
                break;
            case 11:
                classe = "Enutrof";
                break;
            case 12:
                classe = "Ecaflip";
                break;
            default:
                classe = "BUG";
        }
        return classe;
    }
    
    public Personnage creationPerso()
    {

        
        
        Personnage p = new Personnage("", introduction(),
                55, 55, 5, 5, 20, 150);
        
        System.out.println("Quel est votre nom disciple " + p.getClassePersonnage()
                + " ?");
        
        String nomDuJoueur = s.next();
        p.setNomPersonnage(nomDuJoueur);
        System.out.println("Très bien " + p.getNomPersonnage() + ", disciple " 
                + p.getClassePersonnage() + ", l'aventure peut commencer !");
        
        return p;
    }
    public int affChoix()
    {
        System.out.println("Que veux-tu faire aventurier ?");
        System.out.println("1 - Aller sur la place marchande."); 
        System.out.println("2 - Partir à l'aventure.");
        System.out.println("3 - Affronter les gardiens de donjon.");
        System.out.println("4 - Se reposer à l'auberge.");
        return Integer.parseInt(s.next());
    }
    public int affZone()
    {
        System.out.println("1 - Partir dans la forêt d'Incarnam. (zone I)");
        System.out.println("2 - Partir vers les champs d'Astrub. (zone II)");
        System.out.println("3 - Partir vers le coin des craqueboules. (zone III)");
        return Integer.parseInt(s.next());
    }
    public int affBoss()
    {
        System.out.println("1 - Affronter le Milimilou. (boss I)");
        System.out.println("2 - Affronter Mob l'Eponge. (boss II)");
        System.out.println("3 - Affronter le Bouftou Royal. (boss III)");  
        return Integer.parseInt(s.next());
    }
    /*
    public int alea()
    {
        int randomNum = 0;
        Scanner s = new Scanner(System.in);
        while (true)
        {
            randomNum = (int)(Math.random() * 101);  
            System.out.println(randomNum);
            s.next();
        }
        return randomNum;
    }
    */
}
