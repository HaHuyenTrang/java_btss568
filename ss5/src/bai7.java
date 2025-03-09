import java.util.Scanner;

public class bai7 {
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
            System.out.println("mảng không có phần tử");
        }

        int[] sortedArr = new int[n];
        int index = 0;

        //  Đưa số chẵn vào mảng mới
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sortedArr[index] = arr[i];
                index++;
            }
        }

        // Đưa số lẻ vào mảng mới
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sortedArr[index] = arr[i];
                index++;
            }
        }

        //  Gán lại kết quả từ mảng mới về mảng cũ
        for (int i = 0; i < n; i++) {
            arr[i] = sortedArr[i];
        }

        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
