import java.util.Random;
import java.util.Scanner;

public class Java_game_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k = 1, size;
        int x1, y1, x2, y2;
        System.out.println("請輸入陣列大小(偶數)：");
        size = sc.nextInt();
        int[][] m = new int[size][size];
        
        for(i = 0; i< size; i++){
            for(j = 0; j < size; j+=2){
                m[i][j] = m[i][j+1] = k;
                k++;
            }
        }        
        Random ran = new Random();
        for (i = 0; i < size; i++) {  // 打亂陣列
            for (j = 0; j < size; j++) {
                int n1 = ran.nextInt(size);
                int n2 = ran.nextInt(size);
                int tmp = m[i][j];
                m[i][j] = m[n1][n2];
                m[n1][n2] = tmp;
            }
        }
        show(m);

        while (true) {
            System.out.println("請輸入要刪除的點座標：");
            x1 = sc.nextInt();   y1 = sc.nextInt();
            x2 = sc.nextInt();   y2 = sc.nextInt();

            if (m[x1 - 1][y1 - 1] == m[x2 - 1][y2 - 1] && Math.abs(x1 - x2) + Math.abs(y1 - y2) == 1) {  // 若值相同且相鄰 
                m[x1 - 1][y1 - 1] = 0;
                m[x2 - 1][y2 - 1] = 0;
                System.out.println("ok");
                show(m);
            }
            
            else if(m[x1 - 1][y1 - 1] == m[x2 - 1][y2 - 1] && m[x1 - 1][y2 - 1] == 0 || m[x2 - 1][y1 - 1] == 0){ // 斜邊判斷
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
