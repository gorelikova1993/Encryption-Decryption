
class Problem {
    public static void main(String[] args) {
        int i = 0;
        if (args[0].equals("mode")) {
            System.out.println(args[1]);
            return;
        }
        if (args[2].equals("mode")) {
            System.out.println(args[3]);
            return;
        }
        System.out.println("default");
    }
}