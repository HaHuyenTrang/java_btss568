import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự: ");
        String text = sc.nextLine();
        // Phân chia chuỗi thành các từ dựa trên khoảng trắng
        String[] words = text.split("\\s+");

        int count = 0;
        System.out.println("Các từ chứa ký tự đặc biệt:");

        // Kiểm tra từng từ xem có ký tự đặc biệt không
        for (String word : words) {
            if (word.matches(".*[^a-zA-Z0-9].*")) { // Regex kiểm tra ký tự đặc biệt
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Số lượng từ chứa ký tự đặc biệt: " + count);
    }
}
