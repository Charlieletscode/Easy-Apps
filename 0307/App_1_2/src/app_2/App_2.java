/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_2;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class App_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int amount, total, pay, changes;
        int[] m = {500, 100, 50, 10, 5, 1}; // to create a new array there is two ways
        int[] c = new int[6];
        System.out.println("Pen cost 17 dollar \npls enter the amount you want to buy:");
        Scanner s = new Scanner(System.in);
        amount = s.nextInt();
        total = amount * 17;
        
        do {
            System.out.println("You have to pay" + total + "$NTD.\n pls enter money to pay");
            pay = s.nextInt();
            changes = pay - total;
            } while (changes < 0);

        for (int i = 0; i < m.length; i++) {
            c[i] = changes / m[i];
            changes %= m[i];
            if (c[i] > 0) {
                System.out.println("Changes: " + m[i] + "x" + c[i]);
            }
        }
    }

}
