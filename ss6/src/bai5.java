import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự: ");
        String text = sc.nextLine();
        // phân chia chuỗi text dựa trên dấu cách " ".
        String[] words = text.split(" ");
        int count = 0;
        System.out.println("Các từ chứa ký tự đặc biệt:");

        for (String word : words) {
            boolean hasSpecialChar = false;
            // word.toCharArray() chuyển từ (word) thành một mảng ký tự (char[]),
            // giúp duyệt từng ký tự riêng lẻ.
            for (char c : word.toCharArray()) {
                //Character.isLetterOrDigit(c) kiểm tra xem ký tự c có phải
                // là chữ cái (A-Z, a-z) hoặc chữ số (0-9) không.
                if (!Character.isLetterOrDigit(c)) {
                    hasSpecialChar = true;
                    break;
                }
            }

            if (hasSpecialChar) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Số lượng từ chứa ký tự đặc biệt: " + count);
    }
}
