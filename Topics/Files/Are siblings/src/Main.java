import java.io.File;

class Siblings {

//    public static void main(String[] args) {
//        File f1 = new File("dir/file1.txt");
//        File f2 = new File("dir/file2.txt");
//        System.out.println(areSiblings(f1, f2));
//    }

    public static boolean areSiblings(File f1, File f2) {
        String pathName1 = f1.getParent();
        String pathName2 = f2.getParent();
        return pathName1.equals(pathName2);
    }
}