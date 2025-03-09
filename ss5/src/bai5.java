import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài n mảng arr: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("nhập giá trị các phần tử trong mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int numberOdd = 0;
        int minOdd = -1;
        int maxOdd = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) { // Nếu là số lẻ
                minOdd = arr[i]; // Gán số lẻ
                maxOdd = arr[i];
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                numberOdd++;
                if (arr[i] < minOdd) {
                    minOdd = arr[i]; // Cập nhật số lẻ nhỏ nhất
                }
                if (arr[i] > maxOdd) {
                    maxOdd = arr[i]; // Cập nhật số lẻ lớn nhất
                }
            }
        }
        if (numberOdd == 0) {
            System.out.println("Không có phần tử lẻ trong mảng");
        } else {
            System.out.println("Số lượng số lẻ trong mảng: " + numberOdd);
            System.out.println("Số lẻ nhỏ nhất: " + minOdd);
            System.out.println("Số lẻ lớn nhất: " + maxOdd);
        }
    }
}
