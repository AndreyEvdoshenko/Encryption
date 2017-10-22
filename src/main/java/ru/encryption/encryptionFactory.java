package ru.encryption;


public class encryptionFactory {

    private Encryption encryption;

    public encryptionFactory(encryptionType enc){
        switch (enc){
            case DEScrypt: encryption = new DEScrypt(); break;
            case GOSTcrypt: encryption =  new GOSTcrypt(); break;
            case RSAcrypt: encryption =  new RSAcrypt(); break;
        }
    }

    public Encryption getEncryption() {
        return encryption;
    }

}
