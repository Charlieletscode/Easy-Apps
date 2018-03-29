/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jolly.jumpers;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class JollyJumpers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        //System.out.println("pls input a number");
        int number = s.nextInt();
        int[] arr = new int[number];
        String a  = "jolly";
        //System.out.println("pls input numbers");
        for(int i = 0; i<number; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0; i<arr.length-1; i++){
            if((Math.abs(arr[i]-arr[i+1])) > (number-1)){
                a = "not jolly";
            }
        }
        System.out.println(a);
    }
}
