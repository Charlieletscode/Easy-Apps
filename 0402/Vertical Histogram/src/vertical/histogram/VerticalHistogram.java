/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vertical.histogram;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class VerticalHistogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("pls input ur lines....");
        Scanner s = new Scanner(System.in);
        String input = "", total = "", alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] vect = new int[26];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            input = s.nextLine();
            total = total.concat(input);
        }

        for (int i = 0; i < total.length(); i++) {
            for (int j = 0; j < alpha.length(); j++) {
                if (total.charAt(i) == alpha.charAt(j)) {
                    vect[j]++;
                }
            }
        }
        for (int i = 0; i < vect.length; i++) {
            if(max < vect[i]){
                max = vect[i];
            }
        }
        for(int i = max; i >= 0; i--){
            for(int j = 0; j < alpha.length(); j++){
                if(vect[j] > i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }System.out.println();
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.print(alpha.charAt(i)+" ");
        }
        
    }

}
