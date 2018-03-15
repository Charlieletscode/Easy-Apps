/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class App_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int amount, total, pay, changes;
        int _500, _100, _50, _10, _5;
        System.out.println("Pen cost 17 dollar \npls enter the amount you want to buy:");
        Scanner s = new Scanner(System.in);
        amount = s.nextInt();
        total = amount*17;
        System.out.println("It costs " + total + "$NTD.\n pls enter money pay");
        pay = s.nextInt();
        changes = pay - total;
        System.out.println(changes);
        
        _500 = changes/500;
        changes %= 500;
        _100 = changes/100;
        changes %= 100;
        _50 = changes/50;
        changes %= 50;
        _10 = changes/10;
        changes %= 10;
        _5 = changes/5;
        changes %= 5;
        
        System.out.println("Changes: 500x" + _500);
        System.out.println("Changes: 100x" + _100);
        System.out.println("Changes: 50x" + _50);
        System.out.println("Changes: 10x" + _10);
        System.out.println("Changes: 5x" + _5);
        System.out.println("Changes: 1x" + changes);
        
        
       
        
        
         
    }
    
}
