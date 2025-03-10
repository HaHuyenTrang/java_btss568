import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU CHÍNH =====");
            System.out.println("1. Xử lý chuỗi");
            System.out.println("2. Xử lý số nguyên");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn chức năng (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int stringChoice;
                    String inputString = "";

                    do {
                        System.out.println("\n===== MENU XỬ LÝ CHUỖI =====");
                        System.out.println("1. Nhập chuỗi");
                        System.out.println("2. Loại bỏ khoảng trắng thừa");
                        System.out.println("3. Đếm số lần xuất hiện của từng ký tự");
                        System.out.println("4. Chuyển đổi chuỗi thành dạng chuẩn");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Chọn chức năng (1-5): ");
                        stringChoice = scanner.nextInt();

                        switch (stringChoice) {
                            case 1:
                                System.out.print("Nhập vào chuỗi: ");
                                inputString = scanner.nextLine();
                                break;
                            case 2:
                                inputString = inputString.replaceAll("\\s+", " ").trim();
                                System.out.println("Chuỗi sau khi loại bỏ khoảng trắng: " + inputString);
                                break;
                            case 3:
                                String processedString = inputString; // Chuỗi dùng để xử lý

                                System.out.println("Số lần xuất hiện của từng ký tự:");
                                while (!processedString.isEmpty()) {
                                    char c = processedString.charAt(0); // Lấy ký tự đầu tiên
                                    int count = processedString.length() - processedString.replaceAll(Pattern.quote(String.valueOf(c)), "").length();

                                    System.out.println("'" + c + "' xuất hiện " + count + " lần");

                                    // Loại bỏ tất cả các lần xuất hiện của ký tự đã đếm
                                    processedString = processedString.replaceAll(Pattern.quote(String.valueOf(c)), "");
                                }

                                break;
                            case 4:
                                // Dùng regex để viết hoa chữ cái đầu mỗi từ
                                Pattern pattern = Pattern.compile("\\b[a-z]");
                                Matcher matcher = pattern.matcher(inputString);
                                StringBuffer converted = new StringBuffer();

                                while (matcher.find()) {
                                    matcher.appendReplacement(converted, matcher.group().toUpperCase());
                                }
                                matcher.appendTail(converted);

                                System.out.println("Chuỗi sau khi chuyển đổi: " + converted.toString());
                                break;

                        }

                    } while (stringChoice != 5);
                    break;

                case 2:
                    int numberChoice;
                    int[] numbers = new int[0];

                    do {
                        System.out.println("\n===== MENU XỬ LÝ MẢNG SỐ NGUYÊN =====");
                        System.out.println("1. Nhập mảng số nguyên");
                        System.out.println("2. Tìm số lớn nhất");
                        System.out.println("3. Kiểm tra số phần tử có chữ số đầu tiên là số lẻ");
                        System.out.println("4. Kiểm tra mảng có đối xứng không");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Chọn chức năng (1-5): ");
                        numberChoice = scanner.nextInt();

                        switch (numberChoice) {
                            case 1:
                                System.out.print("Nhập số phần tử: ");
                                int n = scanner.nextInt();
                                numbers = new int[n];

                                for (int i = 0; i < n; i++) {
                                    System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                                    numbers[i] = scanner.nextInt();
                                }
                                break;
                            case 2:
                                if (numbers.length > 0) {
                                    int max = numbers[0];

                                    for (int i = 1; i < numbers.length; i++) {
                                        if (numbers[i] > max) {
                                            max = numbers[i];
                                        }
                                    }

                                    System.out.println("Số lớn nhất trong mảng: " + max);
                                } else {
                                    System.out.println("Bạn chưa nhập mảng!");
                                }
                                break;
                            case 3:
                                int count = 0;

                                for (int i = 0; i < numbers.length; i++) {
                                    int firstDigit = Math.abs(numbers[i]);
                                    while (firstDigit >= 10) {
                                        firstDigit /= 10;
                                    }
                                    if (firstDigit % 2 != 0) {
                                        count++;
                                    }
                                }

                                System.out.println("Số phần tử có chữ số đầu tiên là số lẻ: " + count);
                                break;
                            case 4:
                                boolean isSymmetric = true;

                                for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
                                    if (numbers[i] != numbers[j]) {
                                        isSymmetric = false;
                                        break;
                                    }
                                }

                                System.out.println(isSymmetric ? "Mảng là mảng đối xứng." : "Mảng không đối xứng.");
                                break;
                        }

                    } while (numberChoice != 5);
                    break;

                case 3:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
