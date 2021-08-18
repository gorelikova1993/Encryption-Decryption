package encryptdecrypt;

abstract class Algorithm {
    abstract StringBuilder enc(String message, int shift);
    abstract StringBuilder dec(String message, int shift);
}
