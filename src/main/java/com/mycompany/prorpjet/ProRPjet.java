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
        int randomNum;
        Scanner s = new Scanner(System.in);
        while (true)
        {
            randomNum = (int)(Math.random() * 101);  
            System.out.println(randomNum);
            s.next();
        }
    }
}
