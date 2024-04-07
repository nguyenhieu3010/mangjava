import java.util.Arrays;
import java.util.Scanner;

public class index3 {
    //lớn nhất mảng 2 chiều
    public static void main(String[] args) {
//        double[][] arr= {
//                {1,4,6,3},
//                {2,5,7,8}//arr[1][3]
//        };
//        int max = 0;
//        int number1= 0;
//        int number2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > max){
//                    max = arr[i][j];
//                    number1 = i;
//                    number2 = j;
//                }
//            }
//        }
//        System.out.println("số lớn nhất " + max );
//        System.out.println("vị trí " + number1 + ";" +number2);
        Scanner input = new Scanner(System.in);
        System.out.println("nhap giá trị của mảng:");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
