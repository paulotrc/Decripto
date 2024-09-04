package org.example;

import java.util.Base64;

public class MainBase64 {


    public static void main(String[] args) {

        String password = "MySecureSecretGoesHere " + "MyNameGoesHere " + "AnotherPersonalDataGoesHere";

        //Example Using Base64 Codification

        String passwordEncoded = null;

        passwordEncoded = Base64.getEncoder().encodeToString(password.getBytes());

        System.out.println("String encoded: " + passwordEncoded);

        // Decoding Base64 String e
        byte[] decoded = Base64.getDecoder().decode(passwordEncoded.getBytes());

        System.out.println("String decoded: " + new String(decoded));

    }
}
