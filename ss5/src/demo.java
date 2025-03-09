import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   /*
            Xây dung ung dung java console
            1. Khai báo và khởi tạo mảng số nguyên 1 chieu gom 100 phan tu
            2. In menu và thực hiện chức năng theom menu
            ----------------------MENU------------------------
            1.Nhap các giá trị mảng
            2. In các giá trị phần tử mảng
            3. Tính tổng các phần tử mảng
            4. In ra các phần tử chia hết cho 3 và tính tổng
            5. In ra các phần tu là số nguyên tố và tính tổng
            6. Thoát
            // Datatype[] arrName = new Datatype[size]
        */

        // Khai báo và khởi tạo mảng 1 chiều có tối đa 100 phần tử
        int[] numbers = new int[100];
        int currentIndex = 0;

        do {
            System.out.println("--------------------MENU------------------");
            System.out.println("1. Nhập các giá trị mảng");
            System.out.println("2. In các giá trị phần tử mảng");
            System.out.println("3. Tính tổng các phần tử mảng");
            System.out.println("4. In ra các phần tử chia hết cho 3 và tính tổng");
            System.out.println("5. In ra các phần tử là số nguyên tố và tính tổng");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số phần tử của mảng: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.printf("number[%d] = ", currentIndex);
                        numbers[currentIndex++] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng :");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.printf("number[%d] = %d\n", i, numbers[i]);
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        sum += numbers[i];
                    }
                    System.out.println("Tổng các phần tử của mảng: " + sum);
                    break;
                case 4:
                    if (currentIndex == 0) {
                        System.out.println("Mảng chưa có dữ liệu.");
                        break;
                    }
                    int total4 = 0;
                    System.out.println("Các phần tử chia hết cho 3:");
                    for (int i = 0; i < currentIndex; i++) {
                        if (numbers[i] % 3 == 0) {System.out.print(numbers[i] + " ");
                            total4 += numbers[i];
                        }
                    }
                    System.out.println("\nTổng : " + total4);
                    break;

                case 5:
                    if (currentIndex == 0) {
                        System.out.println("Mảng chưa có dữ liệu.");
                        break;
                    }
                    int totalPrime = 0;
                    System.out.println("Các số nguyên tố trong mảng:");
                    for (int i = 0; i < currentIndex; i++) {
                        int num = numbers[i];
                        int isPrime = (num > 1) ? 1 : 0;
                        for (int j = 2; j * j <= num && isPrime == 1; j++) {
                            if (num % j == 0) {
                                isPrime = 0;
                            }
                        }
                        if (isPrime == 1) {
                            System.out.print(num + " ");
                            totalPrime += num;
                        }
                    }
                    System.out.println("\nTổng: " + totalPrime);
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    System.exit(0);

                default:
                    System.err.println("Vui lòng nhập từ 1 đến 6.");
            }
        } while (true);
    }
}