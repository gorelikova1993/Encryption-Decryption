import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.length() % 2 == 0) {
            int middle = line.length() / 2;
            System.out.println(line.substring(0, middle - 1) +
                    line.substring(middle + 1));
        } else {
            int middle = line.length() / 2;
            System.out.println(line.substring(0, middle) +
                    line.substring(middle + 1));
        }
    }
}