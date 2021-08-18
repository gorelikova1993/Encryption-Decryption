import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final double pI = 3.14;
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
            case "triangle":
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double p = (a + b + c) / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            case "rectangle":
                double f = sc.nextDouble();
                double d = sc.nextDouble();
                System.out.println(f * d);
                break;
            case "circle":
                double r = sc.nextDouble();
                System.out.println(pI * Math.pow(r, 2));
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
