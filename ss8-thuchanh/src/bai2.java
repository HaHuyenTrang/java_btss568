import java.util.Scanner;

public class bai2 {
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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] % 3 ==0){
                sum += array[i];
            }

        }
        if(sum==0){
            System.out.println("không có số chia hết cho 3");
        }else {
            System.out.println("Tổng các số chia hết cho 3: " + sum);
        }
    }
}
