import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự: ");
        String chain = sc.nextLine();
        System.out.println("nhập vào ký tự x cần tìm: ");
        String x = sc.nextLine().trim();
        //isEmpty() là một phương thức của lớp String trong Java.
        //Kiểm tra xem chuỗi có rỗng hay không.
        //Trả về true nếu chuỗi có độ dài bằng 0, ngược lại trả về false.
        if (x.isEmpty() || x.length() > chain.length()) {
            System.out.println("Từ cần tìm không hợp lệ hoặc quá dài.");
            return;
        }

        int position = -1;
        for (int i = 0; i <= chain.length() - x.length(); i++) {
            boolean found = true;
            for (int j = 0; j < x.length(); j++) {
                if (chain.charAt(i + j) != x.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Vị trí đầu tiên của từ trong chuỗi: " + position);
        } else {
            System.out.println("Từ không xuất hiện trong chuỗi.");
        }
    }
}
