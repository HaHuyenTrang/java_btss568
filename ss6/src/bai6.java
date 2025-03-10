import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự mật khẩu: ");
        String password = sc.nextLine();
        // Biểu thức chính quy kiểm tra mật khẩu hợp lệ
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";

        if (password.matches(regex)) {
            System.out.println("Mật khẩu hợp lệ.");
        } else {
            System.out.println("Mật khẩu không hợp lệ.");
        }
    }
}
