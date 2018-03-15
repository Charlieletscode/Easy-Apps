/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credit.card;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class CreditCard {

    /**
     * @param args the command line arguments
     */
    static int even, evensp, odd = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        int arr[][] = new int[4][4];
        String carddigit = "5181 2710 9900 0017";
        Scanner s = new Scanner(System.in);
        System.out.println("pls enter ur creditcard number");
        carddigit = s.nextLine();    
        carddigit = carddigit.replace(" ",""); // better way?
        // input string -> int
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++) {
                temp = i * 4 + j;
        arr[i][j] = carddigit.charAt(temp) - '0'; // better way!!!
//                System.out.println(arr[i][j]);
//                System.out.println(evendigit(arr,i,j));
//                System.out.println(odddigit(arr,i,j));
                evendigit(arr,i,j);
    }
    }
                check(even, odd);
    }
    public static void check(int evendigit, int odddigit){
        if((evendigit + odddigit) % 10 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static int evendigit(int[][] arr, int i, int j){
        if(j%2 == 0){
           evensp = arr[i][j];
           evensp = evensp * 2;
        if(evensp / 10 >= 1){
            even += (evensp % 10 + evensp / 10);
        }else{
            even += evensp;
        }
        return even;
        }
        odd += arr[i][j];
        return odd;}
}
