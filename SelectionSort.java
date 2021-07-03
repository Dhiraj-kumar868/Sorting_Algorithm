
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        num = input.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter the " + num + " elements one by one:");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int m = 0; m < num; m++) {
            System.out.print(arr[m] + " ");
        }
    }

}
