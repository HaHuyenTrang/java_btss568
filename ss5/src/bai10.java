import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] = ", i);
            numbers[i] = sc.nextInt();
        }

        System.out.println("Các phần tử trong mảng là:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
        }

        int maxSum = numbers[0];
        int currentSum = 0;

        for (int num : numbers) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Tổng lớn nhất của dãy con liên tiếp: " + maxSum);
    }
}
