import java.util.Scanner;
import java.util.regex.Pattern;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự email: ");
        String email = sc.nextLine();
        // Biểu thức chính quy kiểm tra email hợp lệ
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);

        if (pattern.matcher(email).matches()) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    }
}
