/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_stringcompress;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class App_StringCompress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String k = s.nextLine();
        int i, count = 1, change = 0;
        for (i = 0; i < k.length() - 1; i++) {
            if (k.charAt(i) != k.charAt(i + 1)) {
                System.out.print(count + "" + k.charAt(i));
                change += 2;
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println(count + "" + k.charAt(i));
        System.out.println(change);
        System.out.println((int)((change+2)*100/k.length())+" %");
    }

}
