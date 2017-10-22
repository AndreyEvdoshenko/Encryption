package ru;


import ru.encryption.Encryption;
import ru.encryption.encryptionFactory;
import ru.encryption.encryptionType;

public class application {
    public static void main(String args[]){
        String key = "key";
        String text = "text";
        encryptionFactory factory = new encryptionFactory(encryptionType.DEScrypt);
        Encryption encryption = factory.getEncryption();
        String cryptedText = encryption.crypt(text, key);
        System.out.println(cryptedText);
    }
}
