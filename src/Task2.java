import java.util.Scanner;

public class Task2 {

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        fillArray(sc, arr, 0);

        int sum = sumArray(arr, 0);
        double average = (double) sum / n;

        System.out.println(average);
    }

    public static void fillArray(Scanner sc, int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        arr[index] = sc.nextInt();
        fillArray(sc, arr, index + 1);
    }
}
