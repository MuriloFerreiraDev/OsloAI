package com.osloAI.backend.resourcers;
import java.util.Random;

public class TokenGenerator {
    public static String generateToken() {
        long timestamp = System.currentTimeMillis(); // tempo atual
        int random = new Random().nextInt(1000);     // valor aleatório até 999
        return "u" + timestamp + random;
    }

    public static void main(String[] args) {
        System.out.println(generateToken()); // Exemplo: u1721493857697201
    }
}