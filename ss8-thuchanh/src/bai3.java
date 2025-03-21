import java.util.Scanner;
import java.util.regex.Pattern;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự email: ");
        String email = sc.nextLine();
        System.out.print("nhập vào 1 chuỗi ký tự mật khẩu: ");
        String password = sc.nextLine();
        // Biểu thức chính quy kiểm tra email hợp lệ
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);


 //       hasUpperCase: kiểm tra có ít nhất một chữ cái viết hoa.
        boolean hasUpperCase = false;
        String specialCharacters = "@#$!%";
//        hasLowerCase: kiểm tra có ít nhất một chữ cái viết thường.
        boolean hasLowerCase = false;
//        hasDigit: kiểm tra có ít nhất một chữ số.
        boolean hasDigit = false;
//        hasSpecialChar: kiểm tra có ít nhất một ký tự đặc biệt trong danh sách @#$!%.
        boolean hasSpecialChar = false;
        if (password.length() >= 8) {
            for (char c : password.toCharArray()) {
//                password.toCharArray() chuyển chuỗi thành mảng ký tự để duyệt từng ký tự một.
                if (Character.isUpperCase(c)) {
//                    Character.isUpperCase(c): kiểm tra nếu c là chữ cái viết hoa.
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    //Character.isLowerCase(c): kiểm tra nếu c là chữ cái viết thường.
                    hasLowerCase = true;
                } else if (Character.isDigit(c)) {
                    //Character.isDigit(c): kiểm tra nếu c là chữ số.
                    hasDigit = true;
                } else if (specialCharacters.contains(String.valueOf(c))) {
                    //specialCharacters.contains(String.valueOf(c)):
                    // kiểm tra nếu c nằm trong danh sách ký tự đặc biệt @#$!%.
                    hasSpecialChar = true;
                }
            }
        }

        if (pattern.matcher(email).matches() && hasUpperCase && hasDigit && hasSpecialChar) {
            System.out.println("Email và mật khẩu hợp lệ");
        } else {
            System.out.println("Email và mật khẩu không hợp lệ");
        }
    }
}
