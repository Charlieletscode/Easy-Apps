/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_4;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class App_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userNum, temp, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Pls enter parking time (min): ");
        userNum = s.nextInt();
        
        int day = userNum / 1440;
        userNum %= 1440;
        int hr = userNum / 60;
        userNum %= 60;
        int min = userNum;
        
        System.out.println(day + " : " + hr + " : " + min);
    }
    
}
