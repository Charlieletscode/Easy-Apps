/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_3;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class App_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userNum, temp, count = 0;
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Pls enter a number: ");
        userNum = s.nextInt();
        
        temp = userNum;
        while(userNum > 0){
        userNum = userNum / 2;
        count++;
        }
        int[] arr = new int[count];     
        
        for(int i = arr.length-1; i >= 0; i--){
        arr[i] = temp%2;
        temp /= 2;
        }
        System.out.print("Binary: ");
        for(int a : arr)
            System.out.print(a + " ");
    }
    
}
