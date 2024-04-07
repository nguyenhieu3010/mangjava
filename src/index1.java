import java.util.Arrays;
import java.util.Scanner;

public class index1 {
    // thêm phần tử trong mảng//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 5, 8, 7, 9, 6};
        System.out.println("nhập vị trí cần thêm:");
        int index = input.nextInt();
        System.out.println("nhập số muốn thêm :");
        int number = input.nextInt();
        if (index < 0 || index >= arr.length - 1) {
            System.out.println("index không nằm trong arr");
        }
        for (int i = index; i <= arr.length -1; i++) {
            int tempt = 0;
            tempt = number;
            number = arr[i];
            arr[i] = tempt;
        }
        System.out.println(Arrays.toString(arr));
    }
}