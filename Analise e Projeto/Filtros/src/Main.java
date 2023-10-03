import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo de entrada:");
        String inputFile = s.nextLine();
        System.out.println("Digite o nome do arquivo de saída:");
        String outputFile = s.nextLine();

        System.out.println("Escolha o formato de saída (\n1 - Decimal\n2 - Hexadecimal\n3 - Binário):");
        int formatoSaida = s.nextInt();
        s.nextLine();

        try {
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);

            int byteRead = -1, contador_bytes = 0, contador_linha = 0;
            String conteudo = "";
            while ((byteRead = inputStream.read()) != -1) {
                contador_bytes = contador_bytes + 1;
                String valorFormatado = "";

                switch (formatoSaida) {
                    case 1: // Decimal
                        valorFormatado = String.valueOf(byteRead);
                        break;
                    case 2: // Hexadecimal
                        valorFormatado = String.format("0x%02X", byteRead);
                        break;
                    case 3: // Binário
                        valorFormatado = Integer.toBinaryString(byteRead);
                        break;
                    default:
                        valorFormatado = String.valueOf(byteRead);
                        break;
                }

                if (contador_bytes == 1) {
                    conteudo = conteudo + "db " + valorFormatado + ", ";
                } else if (contador_bytes % 8 == 0) {
                    contador_linha++;
                    conteudo = conteudo + valorFormatado + " ; linha " + (contador_linha - 1) + " \ndb ";
                } else {
                    conteudo = conteudo + valorFormatado + ", ";
                }
                outputStream.write(conteudo.getBytes());
                conteudo = "";
            }
            outputStream.close();
            System.out.println("Arquivo gerado com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
