public class bai6 {
    public static void main(String[] args) {
        int []markingArray = new int[1000];
        int[] originalArray = {44, 44, 555, 700, 44, 50, 950, 321, 890,
                432, 890, 100, 500, 700, 800, 700, 150, 50, 950
        };


        for (int i = 0; i < originalArray.length; i++) {
            int value = originalArray[i]; // Lấy giá trị phần tử
            markingArray[value]++; // Tăng số lần xuất hiện của giá trị đó
        }


        int maxCount = 0;
        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] > maxCount) {
                maxCount = markingArray[i]; // Cập nhật số lần xuất hiện lớn nhất
            }
        }


        System.out.print("Phần tử xuất hiện nhiều nhất: ");
        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == maxCount) {
                System.out.print(i + ", ");
            }
        }


        System.out.println("\nSố lần xuất hiện: " + maxCount);


    }
}
