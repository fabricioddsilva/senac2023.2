import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Iniciando o função Scanner para pegar os dados digitados pelo usuário
        Scanner in = new Scanner(System.in);
        //Iniciando a variável texto, que será usada posteriormente para mostrar a palavra depois de crifada
        String texto = "";

        //Primeira mensagem, instruindo o usuário a digitar a palavra
        System.out.println("Digite a palavra desejada: ");
        //Variavel que por meio dos metodos da Função Scanner ira armazenar oque o usuário escreveu
        String palavra = in.next();

        //Segunda mensagem, instruindo o usuário a digitar a rotação da cifra
        System.out.println("Digite a rotação: ");
        //Outra váriavel para armazena oue foi digitado
        int rot = in.nextInt();

//        Laço de Repetição, sendo int i o contador, i menor que o número de caracteres da palavra, isso sendo calculando usando a função length junto da variável palavra,
//        e o i++ pra fazer a contagem de forma positiva
        for (int i = 0; i < palavra.length(); i++) {

            //Variavel para armazenar as letras convertidas para a tabela ASCII.
            //Antes de converter usamos a função charAt() depois da variavel palavra para pegar a letra de acordo com a posição.
            //A posição é definida por um número dentro dos parentes. Por Exemplo: charAt(1), lembrando que normalmente a primeira posição é 0.
            //Usamos o i dentro do charAt() para pegar a letra em ordem, tendo em vista que o laço ira repetir a mesma quantidade da palavra, e que ele sempre vai contar de forma-
            //positiva no caso 0, 1, 2, 3,... ai ele vai pegar todas as letras ordem.
            //Já aquele (int) antes é para converter as letras em números, quando o programa faz isso ele automatica converte em ASCII. Ou seja "a" vira 97.
            int letras = ((int) palavra.charAt(i));

            //Essa variavel vai armazenar a soma do número da letra com a rotação, ou seja se "a" é 97, com +3 vira 100, virando a letra "d"
            int cript = letras + rot;

            //Aqui usamos a variavel texto para juntas as letras e formar a palavra criptografada.
            //Pegamos a variavel cript que seria os a letras convertidas em números, depois usamos o (char) para converter novamente para letra.
            //Isso ira ser somado dentro da variavel, exemplo: Se a palava criptografada for ABC, então a variavel ira somar com A, na próxima repetição com B e por ultimo C-
            //No final formando o ABC
            texto = texto + ((char) cript);

        }
        
        //Aqui simplesmente mostramos o resultado
        System.out.println(texto);


    }
}