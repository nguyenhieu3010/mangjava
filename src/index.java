import java.util.Arrays;
import java.util.Scanner;
// xoa phần tử trong mảng
public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số càn xoa:");
        int x = input.nextInt();
        int index = -1;
        int[] arr = {1, 2, 3, 7, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            if(x == arr[i]) {
                index = i;
            }
        }
        if( index == -1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        // hàm xoá theo index//
        for (; index < arr.length -1; index++) {
            arr[index] = arr[index +1];
        }
        arr[arr.length -1 ] = 0;
        System.out.println(Arrays.toString(arr));

    }
}
