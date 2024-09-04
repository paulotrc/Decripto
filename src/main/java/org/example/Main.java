package org.example;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        //Example Using Hash Function MD5 / SHA-256
        String password = "MySecureSecretGoesHere" + "MyNameGoesHere" + "AnotherPersonalDataGoesHere";

        MessageDigest algorithmMD5 = MessageDigest.getInstance("MD5");
        byte[] messageDigestMD5 = algorithmMD5.digest(password.getBytes("UTF-8"));

        System.out.println(messageDigestMD5);

        MessageDigest algorithmSHA = MessageDigest.getInstance("SHA-256");
        byte[] messageDigestSHA = algorithmSHA.digest(password.getBytes("UTF-8"));

        System.out.println(messageDigestSHA);

        //Applying hash to hexadecimal format
        //The mask of bits in "hexString.append(Integer.toHexString(0xFF & b));" is used to evict negative numbers.
        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigestSHA) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        String passwordHex = hexString.toString();

        System.out.println(passwordHex);


        //============================================================================================

        //Example Using Base64 Codification

        String passwordEncoded = null;

        passwordEncoded = Base64.getEncoder().encodeToString(password.getBytes());

        System.out.println("String encoded: " + passwordEncoded);

        // Decoding Base64 String e
        byte[] decoded = Base64.getDecoder().decode(passwordEncoded.getBytes());

        System.out.println(Arrays.toString(decoded));


    }
}
