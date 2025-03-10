import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng email: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập danh sách email:");

        // Biểu thức chính quy kiểm tra email hợp lệ
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);

        for (int i = 0; i < n; i++) {
            String email = sc.nextLine().trim();
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                // Tách username và domain từ email
                String[] parts = email.split("@");
                String username = parts[0];
                String domain = parts[1];

                System.out.println("Tên người dùng: " + username + ", Tên miền: " + domain);
            } else {
                System.out.println("Email không hợp lệ: " + email);
            }
        }
    }
}
