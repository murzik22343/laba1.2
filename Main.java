
import java.util.Scanner;

public class Main {

    public static int removeElementInplace(int[] arr, int val) {
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Введите val: ");
        int val = sc.nextInt();
        System.out.print("Input: arr = [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        System.out.println("], val = " + val);
        int size = removeElementInplace(arr, val);
        System.out.print("Output: " + size + ", arr = [");

        for (int i = 0; i < n; i++) {
            if (i < size) {
                System.out.print(arr[i]);
            } else {
                System.out.print("_");
            }

            if (i < n - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
        sc.close();
    }
}
