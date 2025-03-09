public class bai1 {
    public static void main(String[] args) {
        int [] arr = new int[]{100,2,3,4,5,6,7,8,9,10,89};
        int maxArr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxArr = Math.max(maxArr, arr[i]);
        }
        System.out.printf("số lớn nhất trong mảng: %d", maxArr);

    }
}
