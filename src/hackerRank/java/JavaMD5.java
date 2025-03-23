package hackerRank.java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaMD5 {
    public static void solution() throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(s.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }

            System.out.println(sb.toString());
        } catch (NoSuchAlgorithmException e) {
            Logger.getAnonymousLogger().log(Level.SEVERE, e.toString(), e);
        }
    }
}
