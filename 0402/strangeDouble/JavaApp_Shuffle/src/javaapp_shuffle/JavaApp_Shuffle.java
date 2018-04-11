/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_shuffle;

import java.util.Random;

/**
 *
 * @author Charlie Chung
 */
public class JavaApp_Shuffle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rand, temp;
        int[] arr = {1,2,3,4,5,6};
        Random ran = new Random();
        for(int i = 0; i < 6; i++){
            rand = ran.nextInt(6);
            temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
