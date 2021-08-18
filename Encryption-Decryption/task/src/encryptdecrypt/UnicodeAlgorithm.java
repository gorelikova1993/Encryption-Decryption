package encryptdecrypt;

public class UnicodeAlgorithm extends Algorithm{
    @Override
    StringBuilder enc(String message, int shift) {
        StringBuilder ciphertext = new StringBuilder("");
        for (int i = 0; i < message.length(); i++) {
            char ch = (char) (message.charAt(i) + shift);
            ciphertext.append(ch);
        }
        return ciphertext;
    }

    @Override
    StringBuilder dec(String message, int shift) {
        StringBuilder ciphertext = new StringBuilder("");
        for (int i = 0; i < message.length(); i++) {
            char ch = (char) (message.charAt(i) - shift);
            ciphertext.append(ch);
        }
        return ciphertext;
    }
}
