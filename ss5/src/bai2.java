import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài n mảng arr: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("nhập giá trị các phần tử trong mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("tổng các số trong mảng = " + sum);

    }
}
