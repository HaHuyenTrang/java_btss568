import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Nhập kích thước mảng
        do {
            System.out.print("Nhập kích thước mảng : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Kích thước không hợp lệ, vui lòng nhập lại.");
            }
        } while (n <= 0);

        int[] array = new int[n];
        boolean isInitialized = false;
        int choice;

        do {
            // Hiển thị menu
            System.out.println("******************** MENU ********************");
            System.out.println("1. Nhập giá trị `n` phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương trong mảng");
            System.out.println("4. Tìm vị trí các phần tử có giá trị bằng `k`");
            System.out.println("5. Tính số lượng phần tử là số nguyên tố trong mảng");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.print("Phần tử thứ " + (i + 1) + ": ");
                        array[i] = scanner.nextInt();
                    }
                    isInitialized = true;
                    break;
                case 2:
                    System.out.print("Các phần tử trong mảng: ");
                    for (int num : array) {
                        System.out.print(num + " ");
                    }
                    System.out.println();

                    break;
                case 3:
                        int sum = 0, count = 0;
                        for (int num : array) {
                            if (num > 0) {
                                sum += num;
                                count++;
                            }

                        if (count > 0) {
                            System.out.println("Trung bình các số dương: " + (double) sum / count);
                        } else {
                            System.out.println("Không có số dương nào trong mảng.");
                        }
                    }
                    break;
                case 4:
                        System.out.print("Nhập giá trị k: ");
                        int k = scanner.nextInt();
                        System.out.print("Vị trí của " + k + " trong mảng: ");

                        for (int i = 0; i < n; i++) {
                            if (array[i] == k) {
                                System.out.print(i + "là vị trị tìm thấy ");

                            }else {
                                System.out.println("Không tìm thấy phần tử nào có giá trị " + k);
                            }



                        System.out.println();
                    }
                    break;
                case 5:
                    int primeCount = 0;
                    for (int num : array) {
                        if (num >= 2) {
                            boolean isPrime = true;
                            for (int i = 2; i * i <= num; i++) {
                                if (num % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                primeCount++;
                            }
                        }
                    }
                    System.out.println("Số lượng phần tử là số nguyên tố: " + primeCount);

                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 6);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}