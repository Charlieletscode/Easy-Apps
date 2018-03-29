/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tell.me.the.frequencies;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class TellMeTheFrequencies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int newline = 0; // 為了控制換行所定的變數。

        while (sc.hasNextLine()) {
            if ((newline++) != 0) {
                System.out.println("");
            }
            String st = sc.nextLine();

            int arr[] = new int[127];
            int max = 0;
            for (int i = 0; i < st.length(); i++) {
                arr[st.charAt(i)]++; // 計算每個字元出現次數。
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i]; // 找出最多的次數。
                }
            }
            for (int i = 1; i <= max; i++) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (arr[j] == i) {
                        System.out.println(j + " " + arr[j]);
                    }
                }
            }
        }
    }
}
