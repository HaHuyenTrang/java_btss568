import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài n mảng arr: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int []markingArray = new int[1000];
        System.out.println("nhập giá trị các phần tử trong mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        if(n == 0){
            System.out.println("mảng không hợp lệ");
        }

        // Xác định tần suất xuất hiện của từng phần tử
        for (int i = 0; i < n; i++) {
            markingArray[arr[i]]++;
        }

        // Kiểm tra và loại bỏ các phần tử trùng lặp
        int countUnique = 0;
        for (int i = 0; i < n; i++) {
            if (markingArray[arr[i]] == 1) {
                countUnique++;
            }
        }

        if (countUnique == 0) {
            System.out.println("Không có phần tử nào duy nhất trong mảng");
        } else {
            System.out.println("Mảng sau khi loại bỏ các phần tử trùng lặp: ");
            for (int i = 0; i < n; i++) {
                if (markingArray[arr[i]] == 1) {
                    System.out.print(arr[i] + " ");
                }
            }
        }


    }
}
