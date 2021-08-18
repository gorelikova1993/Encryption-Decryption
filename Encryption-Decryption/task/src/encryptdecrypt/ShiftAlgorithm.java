package encryptdecrypt;

public class ShiftAlgorithm extends Algorithm {
    @Override
    StringBuilder enc(String message, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result;
    }

    @Override
    StringBuilder dec(String message, int shift) {
        return enc(message, 26 - shift % 26);
    }
}
