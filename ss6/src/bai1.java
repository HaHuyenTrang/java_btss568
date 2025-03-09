import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự: ");
        String chain = sc.nextLine().trim();
        String[] chainwords = chain.split("\\s+");
        int chainCount = chainwords.length; // Số lượng từ là số phần tử trong mảng
        System.out.println("chuỗi bạn nhập: " + chain);
        System.out.println("Số từ trong chuỗi: " + chainCount);
    }
}
