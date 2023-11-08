import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        try {
            MessageDigest sr = MessageDigest.getInstance("MD5");
            String str = sr.toString();
            System.out.println("Status : " + str);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algoritmo não disponível: " + e);
        }
        catch (NullPointerException e){
            System.out.println("Parâmetro Nulo:" + e);
        }
    }
}