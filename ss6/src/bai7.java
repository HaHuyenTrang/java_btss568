import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng email: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập danh sách email:");

        for (int i = 0; i < n; i++) {
            String email = sc.nextLine().trim();


//contains(String s): Kiểm tra xem chuỗi có chứa một chuỗi con nhất định không.
//indexOf(String s): Trả về vị trí xuất hiện đầu tiên của một chuỗi con trong chuỗi.
//lastIndexOf(String s): Trả về vị trí xuất hiện cuối cùng của một chuỗi con trong chuỗi.
//substring(int beginIndex, int endIndex): Cắt chuỗi con từ beginIndex đến endIndex.
//substring(int beginIndex): Cắt chuỗi con từ beginIndex đến hết chuỗi.
//isEmpty(): Kiểm tra xem chuỗi có rỗng không.
//trim(): Loại bỏ khoảng trắng ở đầu và cuối chuỗi.
//nextLine(): Đọc toàn bộ dòng nhập từ bàn phím.
//Integer.parseInt(String s): Chuyển đổi chuỗi thành số nguyên.

            // Kiểm tra xem email có chứa ký tự '@' và dấu '.' hay không
            if (email.contains("@") && email.contains(".")) {
                int atIndex = email.indexOf("@");
                int dotIndex = email.lastIndexOf(".");

                // Đảm bảo dấu '@' xuất hiện trước dấu '.' và không ở đầu/cuối
                if (atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) {
                    String username = email.substring(0, atIndex);
                    String domain = email.substring(atIndex + 1);

                    // Kiểm tra username và domain không rỗng
                    if (!username.isEmpty() && !domain.isEmpty()) {
                        System.out.println("Tên người dùng: " + username + ", Tên miền: " + domain);
                    } else {
                        System.out.println("Email không hợp lệ: " + email);
                    }
                } else {
                    System.out.println("Email không hợp lệ: " + email);
                }
            } else {
                System.out.println("Email không hợp lệ: " + email);
            }
        }
    }
}
