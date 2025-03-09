import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;
        int choice;

        do {
            System.out.println("************************MENU**************************");
            System.out.println("1. Nhập giá trị n phần tử của mảng ");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng (k nhập từ bàn phím)");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử theo quy luật đặc biệt");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm dần) đúng vị trí");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số phần tử n: ");
                    n = scanner.nextInt();
                    System.out.println("Nhập các phần tử của mảng:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.print("Mảng: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0, count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    if (count > 0) {
                        //(double) sum / count: Chia tổng cho số lượng phần
                        // tử để tính trung bình cộng. Ép kiểu double
                        System.out.println("Trung bình các phần tử dương: " + (double) sum / count);
                    } else {
                        System.out.println("Không có số dương trong mảng.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập giá trị k: ");
                    int k = scanner.nextInt();
                    System.out.print("Vị trí của " + k + " trong mảng: ");
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                            found = true;
                        }
                    }
                    if (!found) System.out.print("Không tìm thấy.");
                    System.out.println();
                    break;
                case 5:
                    // Thuật toán sắp xếp nổi bọt giảm dần
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Mảng sau khi sắp xếp giảm dần: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 6:
                    int primeCount = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isPrime = true;
                        if (arr[i] < 2) isPrime = false; // Số nhỏ hơn 2 không phải số nguyên tố
                        for (int j = 2; j * j <= arr[i]; j++) {
                            if (arr[i] % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) primeCount++;
                    }
                    System.out.println("Số lượng số nguyên tố trong mảng: " + primeCount);
                    break;
                case 7:
                    break;
                case 8:
                    System.out.print("Nhập giá trị m: ");
                    int m = scanner.nextInt();
                    int i;
                    for (i = n - 1; i >= 0 && arr[i] < m; i--) {
                        arr[i + 1] = arr[i]; // Dịch chuyển các phần tử để chèn m đúng vị trí
                    }
                    arr[i + 1] = m;
                    n++;
                    System.out.println("Mảng sau khi chèn giá trị m: ");
                    for (i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (true);
    }
}
