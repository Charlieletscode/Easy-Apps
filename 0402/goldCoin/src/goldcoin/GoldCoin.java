/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goldcoin;

import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class GoldCoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int change = 0, count = 0;

        A:
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                change += i;
                count++;
                if (count == num) {
                    break A;
                }
            }
        }
        System.out.println(change);
    }

}
