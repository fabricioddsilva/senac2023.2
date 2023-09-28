import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ataque de força bruta - Cifra de Cesar\nDigite o texto:");
        String textoCripto = in.next();
        System.out.println("Digite a quantidade de vezes que você deseja tentar: ");
        int tentativas = in.nextInt();

        for (int i = 1;i<=tentativas;i++)  {
            String textoDescripto = new String();
            int tamanhoTexto = textoCripto.length();
            int letraASCII;
            for(int j=0; j < tamanhoTexto; j++){
                int letra = ((int) textoCripto.charAt(j));
                letraASCII = letra - i;
                textoDescripto +=  ((char)letraASCII);
            }

            System.out.println("Tentativa " + i + " - Texto: " + textoDescripto);
        }

    }
}