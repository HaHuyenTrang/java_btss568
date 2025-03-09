import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Sử dụng do-while để đảm bảo nhập đúng số nguyên dương
        do {
            System.out.print("Nhập kích thước n của  mảng: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Kích thước không hợp lệ, vui lòng nhập lại.");
            }
        } while (n <= 0);

        int[] array = new int[n];

        // Nhập các phần tử mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Tìm giá trị lớn nhất và nhỏ nhất
        int min = array[0], max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        // In kết quả
        System.out.println("Giá trị nhỏ nhất: " + min);
        System.out.println("Giá trị lớn nhất: " + max);
    }
}
