import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự: ");
        String chain = sc.nextLine();
        System.out.println("nhập vào ký tự x cần tìm: ");
        String x = sc.nextLine().trim();
        // Sử dụng regex để tìm vị trí đầu tiên
        Pattern pattern = Pattern.compile(Pattern.quote(x)); // Chuyển chuỗi x thành biểu thức chính quy an toàn
        Matcher matcher = pattern.matcher(chain);

        if (matcher.find()) {
            System.out.println("Vị trí đầu tiên của từ trong chuỗi: " + matcher.start());
        } else {
            System.out.println("Từ không xuất hiện trong chuỗi.");
        }
    }
}
