import java.util.Arrays;
import java.util.Scanner;

public class index4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhâp giá trị của mảng :");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] arr = new double[row][column];
        System.out.println("Enter " + arr.length + " rows and " +
                arr[0].length + " columns: ");
        for ( row = 0; row < arr.length; row++) {
            for ( column = 0; column < arr[row].length; column++) {
                arr[row][column] = input.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
            System.out.println("Enter the column u want :");
            int columns = input.nextInt();
            double sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][columns];
            }
            System.out.println("Sum of columns " + columns + " is " + sum);
        }

    }
