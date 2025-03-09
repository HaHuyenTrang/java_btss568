import java.util.Arrays;

public class bai8 {
    public static void main(String[] args) {
        String[] phoneNumbers = {
                "0987-654-321", "+84.987.654.321", "0978 654 321", "0123.456.789", "84987654321"
        };

        for (String phoneNumber : phoneNumbers) {
            // Loại bỏ tất cả các ký tự không phải số hoặc dấu + (ở đầu)
            String cleanedNumber = phoneNumber.replaceAll("[^\\d+]", "");
            //Phương thức replaceAll("[^\\d+]", "") được sử dụng để loại bỏ tất cả
            // các ký tự không phải là số (\d) hoặc dấu +.

            // Kiểm tra tính hợp lệ của số điện thoại
            if (cleanedNumber.matches("^0\\d{9}$")) {
                // Nếu bắt đầu bằng 0, chuyển thành +84
                String formattedNumber = "+84 " + cleanedNumber.substring(1, 4) + " " + cleanedNumber.substring(4, 7) + " " + cleanedNumber.substring(7);
                System.out.println(formattedNumber);

            //Phương thức .matches("^0\\d{9}$") được sử dụng để kiểm tra xem chuỗi cleanedNumber
            // có phải là một số điện thoại Việt Nam hợp lệ hay không.
            } else if (cleanedNumber.matches("^\\+84\\d{9}$")) {
                // Nếu đã có +84, chuẩn hóa cách hiển thị
                String formattedNumber = cleanedNumber.substring(0, 3) + " " + cleanedNumber.substring(3, 6) + " " + cleanedNumber.substring(6, 9) + " " + cleanedNumber.substring(9);
                System.out.println(formattedNumber);
            } else {
                System.out.println("Số điện thoại không hợp lệ");
            }
        }
    }
}