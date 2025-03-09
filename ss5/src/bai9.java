import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số dòng");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Ma trận không hợp lệ");
            return;
        }

        System.out.println("Nhâp vào số cột");
        int m = sc.nextInt();
        int[][] numbers = new int[n][m];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("number[%d][%d] = ", i, j);
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma trận ban đầu:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%5d", numbers[i][j]);
            }
            System.out.printf("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = numbers[i][j];
                numbers[i][j] = numbers[j][i];
                numbers[j][i] = temp;
            }
        }

        // Bước 2: Đảo ngược thứ tự các cột
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = numbers[i][j];
                numbers[i][j] = numbers[i][k];
                numbers[i][k] = temp;
            }
        }

        // Hiển thị ma trận sau khi xoay
        System.out.println("Ma trận sau khi xoay 90 độ:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", numbers[i][j]);
            }
            System.out.println();
        }
    }
}
