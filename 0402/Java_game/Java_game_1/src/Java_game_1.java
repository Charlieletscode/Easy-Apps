import java.util.Random;
import java.util.Scanner;

public class Java_game_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, size = 6;
        int x1, y1, x2, y2;
        int[][] m = {{0, 4, 2, 2, 3, 0}, {4, 0, 17, 5, 6, 3}, {4, 0, 8, 11, 9, 9}, {12, 10, 8, 11, 10, 12}, {13, 13, 14, 14, 15, 15}, {0, 13, 17, 5, 15, 0}};
        // 測試用
        /*
        int[][] m = {{1, 1, 2, 2, 3, 3}, {4, 4, 5, 5, 6, 6}, {7, 7, 8, 8, 9, 9}, {10, 10, 11, 11, 12, 12}, {13, 13, 14, 14, 15, 15}, {16, 16, 17, 17, 18, 18}};
        Random ran = new Random();
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                int n1 = ran.nextInt(size);
                int n2 = ran.nextInt(size);
                int tmp = m[i][j];
                m[i][j] = m[n1][n2];
                m[n1][n2] = tmp;
            }
        }
        */
        show(m);

        while (true) {
            System.out.println("請輸入要刪除的點座標：");
            x1 = sc.nextInt();  y1 = sc.nextInt();
            x2 = sc.nextInt();  y2 = sc.nextInt();

            if (m[x1 - 1][y1 - 1] == m[x2 - 1][y2 - 1] && Math.abs(x1 - x2) + Math.abs(y1 - y2) == 1) {  // 若值相同且相鄰 
                m[x1 - 1][y1 - 1] = 0;
                m[x2 - 1][y2 - 1] = 0;
                System.out.println("ok");
                show(m);
            }
            
            else if(m[x1 - 1][y1 - 1] == m[x2 - 1][y2 - 1] && m[x1 - 1][y2 - 1] == 0 || m[x2 - 1][y1 - 1] == 0){  // 判斷斜邊值是否=0(對角只要有一個是0)
                m[x1 - 1][y1 - 1] = 0;
                m[x2 - 1][y2 - 1] = 0;
                System.out.println("ok");
                show(m);
            }            
            
            else if (m[x1 - 1][y1 - 1] == m[x2 - 1][y2 - 1] && Math.abs(x1 - x2) + Math.abs(y1 - y2) != 1) {
                int sum = 0;
                if (x1 == x2) {
                    for (i = y1; i < y2 - 1; i++) {
                        sum += m[x1 - 1][i];
                    }
                    if (sum == 0) {
                        m[x1 - 1][y1 - 1] = 0;
                        m[x2 - 1][y2 - 1] = 0;
                        show(m);
                    }
                    else {
                        System.out.println("不相鄰，無法刪除!!");
                    }
                }
                if (y1 == y2) {
                    for (i = x1; i < x2 - 1; i++) {
                        sum += m[i][y1 - 1];
                    }
                    if (sum == 0) {
                        m[x1 - 1][y1 - 1] = 0;
                        m[x2 - 1][y2 - 1] = 0;
                        show(m);
                    }
                    else {
                        System.out.println("不相鄰，無法刪除!!");
                    }
                }
            }
            else if(m[x1 - 1][y1 - 1] != m[x2 - 1][y2 - 1]) {
                System.out.println("值不同，無法刪除!!");
            }
        }
    }

    public static void show(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
