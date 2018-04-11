/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Charlie Chung
 */
public class JavaGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp, rand1, rand2, x1, x2, y1, y2, absx, absy, midNum = 0;
        boolean react = true;
        Scanner s = new Scanner(System.in);
        int[][] arr = {{0, 4, 2, 2, 3, 0}, {4, 0, 17, 5, 6, 3}, {4, 0, 8, 11, 9, 9}, {12, 10, 8, 11, 10, 12}, {13, 13, 14, 14, 15, 15}, {0, 13, 17, 5, 15, 0}};
//        int[][] arr = {{1, 1, 2, 2, 3, 3}, {4, 4, 5, 5, 6, 6}, {7, 7, 8, 8, 9, 9}, {10, 10, 11, 11, 12, 12}, {13, 13, 14, 14, 15, 15}, {16, 16, 17, 17, 18, 18}};
//        Random ran = new Random();
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                rand1 = ran.nextInt(6);
//                rand2 = ran.nextInt(6);
//                temp = arr[i][j];
//                arr[i][j] = arr[rand1][rand2];
//                arr[rand1][rand2] = temp;
//            }
//        }
        show(arr);
        System.out.println("pls input coordinate\n(numbers have to the same && have to be beside)\ntype 0 0 to quit");

        while (react) {
            x1 = s.nextInt() - 1;
            y1 = s.nextInt() - 1;
            if (x1 == -1 || y1 == -1) {
                react = false;
            } else {
                x2 = s.nextInt() - 1;
                y2 = s.nextInt() - 1;
                absx = Math.abs(x1 - x2);
                absy = Math.abs(y1 - y2);
                
                if(arr[x1][y1] == arr[x2][y2] && (arr[x1][y2] == 0 || arr[x2][y1] == 0)){
                
                }
                
                if (arr[x1][y1] == arr[x2][y2] && absx + absy == 1) {  // numbers that are aside
                    System.out.println("u find it!");
                    arr[x1][y1] = arr[x2][y2] = 0;
                    show(arr);
                } else {
                    midNum = 0;

                    if (absx == 0) {
                        for (int i = 1; i < absy; i++) {
                            midNum += arr[x1][y1 + i];
                        }
                    }
                    if (absy == 0) {
                        for (int i = 1; i < absx; i++) {
                            midNum += arr[x1 + i][y1];
                        }
                    }
                    if (midNum == 0) {
                        System.out.println("u find it!");
                        arr[x1][y1] = arr[x2][y2] = 0;
                        show(arr);
                    } else {
                        react = false;
                        System.out.println("error game shut down");
                    }

                }
            }
        }
        System.out.println("The end~");
    }

    public static void show(int arr[][]) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
