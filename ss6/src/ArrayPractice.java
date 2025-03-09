import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Nhap so phan tu cua mang va khai bao mang so nguyen gom n phan tu
            Nhap cac gia tri và chỉ số phần tử của mảng
        */

        // Nhập so phan tu, khai báo mảng, nhập giá trị
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhap vao giá tri phần tử cần chèn");
        int value = sc.nextInt();
        System.out.println("Nhập vào chỉ số:");
        int index = sc.nextInt();

        // Khai bao mảng mới có số phần tử = số phần tử mảng cũ
        int[] newArr;

        // Chèn phần tử vào mảng
        if(index < 0){
            System.out.println("Không tồn tại chỉ số trong mảng");
            newArr = new int[arr.length];

            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
        }else if(index < arr.length){
            newArr = new int[arr.length + 1];
            // Copy các phần tử từ old sang new và chèn phần tử vào mảng
            for (int i = 0; i < newArr.length; i++) {
                if(i < index){
                    newArr[i] = arr[i];
                } else if (i == index) {
                    newArr[i] = value;
                }else{
                    newArr[i] = arr[i - 1];
                }
            }
        }else{
            newArr = new int[arr.length + 1];

            // Copy các phần tử mảng cũ sang mảng mới
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            // Gán giá trị phần tử thứ index voi gia tri là value
            newArr[index] = value;
        }

        System.out.println("Danh sách các phần tử trong mảng sau khi chèn:");
        for (int element : newArr) {
            System.out.printf("%d\t ", element);
        }
        System.out.println("");

        // sửa
        System.out.println("Nhập vị trí cần sửa:");
        int updateIndex = sc.nextInt();

        if (updateIndex < 0 || updateIndex >= arr.length) {
            System.out.println("Không thể sửa! Chỉ số không hợp lệ.");
        } else {
            System.out.println("Nhập giá trị mới:");
            arr[updateIndex] = sc.nextInt();
            System.out.println("Đã cập nhật phần tử thành công!");
            System.out.print("Mảng hiện tại: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


        // xóa
        System.out.println("Nhập vị trí cần xóa:");
        int deleteIndex = sc.nextInt();

        if (deleteIndex < 0 || deleteIndex >= arr.length) {
            System.out.println("Không thể xóa! Chỉ số không hợp lệ.");
        } else {
            int[] tempArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != deleteIndex) {
                    tempArr[j++] = arr[i];
                }
            }
            arr = tempArr;
            System.out.println("Đã xóa phần tử thành công!");
            System.out.print("Mảng hiện tại: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}