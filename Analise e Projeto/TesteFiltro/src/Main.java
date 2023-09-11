
import java.io.*;

public class Main {
        public static void main(String[] args) {
            InputStream inputstream;
            try {
                inputstream = new BufferedInputStream(new FileInputStream("exemplo.txt"));
                int data = inputstream.read();
                System.out.println("Conteúdo do arq. exemplo.txt:");
                while (data != -1) {
                    System.out.print((char) data);
                    data = inputstream.read();
                }
                inputstream.close();
            } catch (Exception e1) {   e1.printStackTrace();        }
        }


}