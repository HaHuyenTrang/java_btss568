import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai9 {
    public static void main(String[] args) {
        String[] phoneNumbers = {
                "0987-654-321", "+84.987.654.321", "0978 654 321", "0123.456.789", "84987654321"
        };

        // Biểu thức chính quy để nhận diện số điện thoại hợp lệ
        String phoneRegex = "^(?:\\+84|0)?(\\d{9})$";
        Pattern pattern = Pattern.compile(phoneRegex);

        for (String phoneNumber : phoneNumbers) {
            // Loại bỏ tất cả các ký tự không phải số
            String cleanedNumber = phoneNumber.replaceAll("\\D", "");

            Matcher matcher = pattern.matcher(cleanedNumber);

            if (matcher.matches()) {
                // Chuẩn hóa số điện thoại về dạng +84 XXX XXX XXX
                String formattedNumber = "+84 " + matcher.group(1).substring(0, 3) + " " +
                        matcher.group(1).substring(3, 6) + " " + matcher.group(1).substring(6);
                System.out.println(formattedNumber);
            } else {
                System.out.println("Số điện thoại không hợp lệ: " + phoneNumber);
            }
        }
    }
}
