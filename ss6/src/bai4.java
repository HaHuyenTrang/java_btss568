import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 chuỗi ký tự: ");
        String chain = sc.nextLine();
        //toCharArray()chuyển đổi một chuỗi thành một mảng ký tự (char[]).
        // Tạo một mảng ký tự từ chuỗi
        char[] charArray = chain.toCharArray();

        // Duyệt qua từng ký tự, nếu là số (0-9) thì thay bằng '*'
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                charArray[i] = '*';
            }
        }

        // Chuyển mảng ký tự về chuỗi
        String result = new String(charArray);

        System.out.println("Chuỗi sau khi thay thế: " + result);
    }
}
