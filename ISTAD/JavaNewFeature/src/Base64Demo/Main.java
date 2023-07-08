package Base64Demo;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String originalMessage = "Hello everyone!!";
        String encryptedMessage = Base64.getEncoder().encodeToString(originalMessage.getBytes(StandardCharsets.UTF_8));
        System.out.println("Original message: " + originalMessage);

        byte[] decodeMessage = Base64.getDecoder().decode(encryptedMessage);
        String actualContend = new String(decodeMessage);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decoded Message is : " + actualContend);
    }

}
