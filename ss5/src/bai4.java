import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài n mảng arr: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("nhập giá trị các phần tử trong mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        if(n == 0){
            System.out.println("mảng có kích thước rỗng");
        }

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        // đảo ngược mảng
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Hiển thị mảng sau khi đảo ngược
        System.out.print("\nMảng sau khi đảo ngược: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
}
