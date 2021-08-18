package encryptdecrypt;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String type = "enc", message = "";
        int key = 0;
        boolean isFileOut = false;
        String fileNameOut = "";
        boolean isFileIn = false;
        String fileName = "";
        String alg = "shift";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                type = args[i + 1];
            }
            if (args[i].equals("-data")) {
                message = args[i + 1];
            }
            if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);
            }
            if(args[i].equals("-out")) {
                isFileOut = true;
                fileNameOut = args[i+1];
            }
            if(args[i].equals("-in")) {
                isFileIn = true;
                fileName = args[i + 1];
            }
            if(args[i].equals("-alg")){
                alg = args[i + 1];
            }
        }
        if(isFileIn) {
            File file = new File(fileName);
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    message+=line;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        StringBuilder ciphertext = new StringBuilder("");

        switch (alg) {
            case "unicode":
                UnicodeAlgorithm uni = new UnicodeAlgorithm();
                if(type.equals("enc")) {
                    ciphertext = uni.enc(message, key);
                } else {
                    ciphertext = uni.dec(message, key);
                }
                break;
            case "shift":
                ShiftAlgorithm shift = new ShiftAlgorithm();
                if(type.equals("enc")) {
                    ciphertext = shift.enc(message, key);
                } else {
                    ciphertext = shift.dec(message, key);
                }
                break;
        }

        if(isFileOut) {
            try {
                FileWriter fileWriter = new FileWriter(fileNameOut);
                fileWriter.write(ciphertext.toString());
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(ciphertext);
        }


    }
}
