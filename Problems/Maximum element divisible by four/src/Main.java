import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++ ) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] % 4 == 0) {
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println(max);
    }
}