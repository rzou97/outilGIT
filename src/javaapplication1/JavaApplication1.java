/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author MSI
 */
public class JavaApplication1 {
 public static boolean estPair(int nombre) {
        
        return nombre % 2 == 0;
 }
  
        
          public static double calculerPuissance(double base, int exposant) {
        
        return Math.pow(base, exposant);
    }
    
    
    public static void main(String[] args) {
        int nombre = 6; // Vous pouvez changer ce nombre pour le tester
        if (estPair(nombre)) {
            System.out.println(nombre + " est pair.");
        } else {
            System.out.println(nombre + " est impair.");
        }
        
        double base = 2;
        int exposant = 3;
        double resultat = calculerPuissance(base, exposant);
        System.out.println("La puissance de " + base + " à la puissance " + exposant + " est : " + resultat);
    }
}


