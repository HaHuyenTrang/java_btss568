import java.util.ArrayList;
import java.util.List;

public class bai10 {
    public static void main(String[] args) {
        String inputText = "   ha 2005 @@#$ huyentrang  " ;

        // Xóa các ký tự đặc biệt, chỉ giữ lại chữ cái, số và khoảng trắng
        String cleanedText = inputText.replaceAll("[^a-zA-Z0-9 ]", "");

        // Chuyển sang chữ thường
        cleanedText = cleanedText.toLowerCase();

        // Xóa khoảng trắng dư thừa
        cleanedText = cleanedText.trim().replaceAll("\s+", " ");

        // Trích xuất các số trong chuỗi
        List<String> numbers = new ArrayList<>();
        String[] words = cleanedText.split(" ");
        for (String word : words) {
            if (word.matches("\\d+")) {
                numbers.add(word);
            }
        }

        // In kết quả
        System.out.println("Văn bản đã chuẩn hóa: " + cleanedText);
        System.out.println("Các số trích xuất: " + (numbers.isEmpty() ? "Không có số nào" : numbers));
    }
}
