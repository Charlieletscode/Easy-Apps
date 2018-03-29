/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lumberjack.sequencing;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class LumberjackSequencing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("pls enter ur total amount of sets: ");
        Scanner s = new Scanner(System.in);
        int count = 0, number = s.nextInt();
        System.out.println("input your data:");
        int[] arr = new int[10];
        System.out.println("Lumberjacks:");
        for(int j = 0; j<number; j++){
            count = 0;
        for(int i = 0; i<10; i++){
            arr[i] = s.nextInt();
            if(arr[i] >= 100)
                System.out.println("input error");
        } // after input numbers || 輸入完之後
        
        
        for(int i = 0; i<8; i++){
            if(arr[i] > arr[i+1]){
                if(arr[i+1] < arr[i+2]){
                    count++;}
                }
            if(arr[i] < arr[i+1]){
                if(arr[i+1] > arr[i+2]){
                    count++;}
                }
//            System.out.println(count);
        }// time to check the order || 檢查順序
        if(count == 0)
                System.out.println("ordered");
        else
                System.out.println("unordered");
        }
        
        
        
    }
    
}
