class Problem {
    public static void main(String[] args) {
        boolean isFound = false;
        for(int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                System.out.println(i);
                isFound = true;
            }
        }
        if(!isFound) {
            System.out.println(-1);
        }
    }
}