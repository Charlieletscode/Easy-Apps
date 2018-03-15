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
        int userNum, count = 0, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Pls enter a number: ");
        userNum = s.nextInt();
        temp = userNum;
        while(userNum > 0){
        userNum = userNum / 10;
        count++;
        }
        System.out.println(temp + " is a " + count + " digit.");
    }  
}
