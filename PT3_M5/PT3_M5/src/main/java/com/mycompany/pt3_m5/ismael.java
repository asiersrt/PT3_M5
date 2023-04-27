/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pt3_m5;

public class ismael {
    public static boolean esPalindrome(String cadena) {
        String invertida = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(invertida);
    }

    public static String formatejarNom(String nom) {
        String[] noms = nom.split("\\s+");
        String primerNom = noms[0];
        String cognom = noms[noms.length - 1];
        return cognom + ", " + primerNom;
    }
}



