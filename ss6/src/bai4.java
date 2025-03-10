import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự: ");
        String chain = sc.nextLine();
        // Sử dụng regex để thay thế tất cả số (0-9) bằng '*'
        String result = chain.replaceAll("\\d", "*");

        System.out.println("Chuỗi sau khi thay thế: " + result);
    }
}
