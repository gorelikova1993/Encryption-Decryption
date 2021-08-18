import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        long a = Long.parseLong(arr[0]);
        String operation = arr[1];
        long b = Long.parseLong(arr[2]);
        switch (operation){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                if(b == 0) {
                    System.out.println("Division by 0!");

                }else {
                    System.out.println(a / b);
                }
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
