// able to encrypt
//.txt .bon .dat .jpg .png .gif .,p3 .wav .mp4 .avi .pdf .docx


// main functionalities
// Generate an AES key.
// Encrypt a file using the key.
// Decrypt the file using the key.

import java.io.*;
import java.nio.file.Paths;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class FileEncryptor
{
    //AES (Advanced Encryption Standard) is a symmetric encryption algorithm, meaning the same key is used to both encrypt and decrypt the data
    private static final String ALGORITHM = "AES";
    private static final String KEY_FOLDER = "keys";
    private static final String INPUT_FOLDER = "input";
    private static final String ENCRYPTED_FOLDER = "encrypted";
    private static final String DECRYPTED_FOLDER = "decrypted";
    

    //key generator method
    public static void generateKey(String keyFileName) throws Exception {
       
        //A class from javax.crypto that provides functionality to generate secret keys for encryption.
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        // setting the key size (128 bytes)
        keyGen.init(128);

        //generates secret key
        SecretKey secretKey = keyGen.generateKey();

        File keyFolder = new File(KEY_FOLDER);
        if (!keyFolder.exists())
        {
            keyFolder.mkdir();
        }

        //writes the secret key to a file
        try(FileOutputStream fos = new FileOutputStream(Paths.get(KEY_FOLDER, keyFileName).toString()))
        {
            //return raw byte representation of the key
            fos.write(secretKey.getEncoded());
        }
    }

    //loads the key from the file for either encrypting or decrypting
    public static SecretKey loadKey(String keyFileName) throws Exception
    {
       //reads the secret key from the file where it was saved (file input stream initialization)
       try(FileInputStream fis  = new FileInputStream(Paths.get(KEY_FOLDER, keyFileName).toString()))
       {
            //determine the byte array size
            byte[] keyByte = new byte[fis.available()];

            //read bytes into byte array
            fis.read(keyByte);

            //create a key from the byte array
            return new SecretKeySpec(keyByte, ALGORITHM);
       }
    }

    //Encrypts the file using AES key
    public static void encryptFile(String keyFileName, String inputFileName, String outputFileName) throws Exception
    {
        SecretKey key = loadKey(keyFileName);
        //Creates AES instance which is responsible for carrying out the encryption
        Cipher cipher = Cipher.getInstance(ALGORITHM);

        // The cipher is initialized to encrypt with the previously loaded key
        cipher.init(Cipher.ENCRYPT_MODE, key);

        File encryptedFolder = new File(ENCRYPTED_FOLDER);
        if(!encryptedFolder.exists())
        {
            encryptedFolder.mkdir();
        }
       
        //opens input and output stream to read and write data
        try (FileInputStream fis = new FileInputStream(Paths.get(INPUT_FOLDER, inputFileName).toString());
             FileOutputStream fos = new FileOutputStream(Paths.get(ENCRYPTED_FOLDER, outputFileName).toString()))
        {
            //declares a byte array and initialize it with the length of the input file and cast the value as an int
            byte[] inputBytes = new byte[(int) new File(Paths.get(INPUT_FOLDER, inputFileName).toString()).length()];
            fis.read(inputBytes);
            //encrypts the data and return the encrypted byte array
            byte[] outputBytes = cipher.doFinal(inputBytes);
            //writes the encrypted byte array to the output file
            fos.write(outputBytes);
        }

    }

    public static void decryptFile(String keyFilename, String inputFileName, String outputFileName) throws Exception
    {
        SecretKey key = loadKey(keyFilename);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);

        File decryptedFolder = new File(DECRYPTED_FOLDER);
        if (!decryptedFolder.exists()) {
            decryptedFolder.mkdir();
        }

        try (FileInputStream fis = new FileInputStream(Paths.get(ENCRYPTED_FOLDER, inputFileName).toString());
             FileOutputStream fos = new FileOutputStream(Paths.get(DECRYPTED_FOLDER, outputFileName).toString()))
        {
            byte[] inputBytes = new byte[(int) new File(Paths.get(ENCRYPTED_FOLDER , inputFileName).toString()).length()];
            fis.read(inputBytes);
            
            byte[] outputBytes = cipher.doFinal(inputBytes);
            fos.write(outputBytes);
        }

    }

    public static void main(String[] args) throws Exception
    {
        if(args.length < 2)
        {
            System.err.println("Usage: java file encryptor <generate/encrypt/decrypt> <filename>");
            return;
        }

        // <generate_key, encrypt, decrypt>
        String command = args[0];
        //fileName
        String fileName = args[1];

        switch(command)
        {
            case "generate_key" -> generateKey("secret.key");
            case "encrypt" -> encryptFile("secret.key", fileName, fileName + ".enc");
            case "decrypt" -> decryptFile("secret.key", fileName, fileName.replace(".enc", ""));
            default -> System.out.println("Invalid Command");
        }

    }

}