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
        
        Personnage joueur = f.creationPerso();
    }
}
