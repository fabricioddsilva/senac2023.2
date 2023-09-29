import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Digite o nome do produto: ");
        String nome = in.next();

        System.out.println("Digite o valor do produto: ");
        double valor = in.nextDouble();

        criarProduto(nome, valor);


    }

    public static void criarProduto (String nome, double valor){
        if (nome == null){
           throw new IllegalArgumentException("O nome não pode ser vazio");
        }else if (valor < 0) {
            throw new IllegalArgumentException("Preço Inválido");
        } else {
            Random gerador = new Random();

            Produto produto = new Produto(gerador.nextInt(100), nome, valor);

            System.out.println("Produto: " + produto.getCodigo() + ", Nome: " + nome + ", Valor: R$" + valor + "\nAdicionado com Sucesso!!");
        }


    }




}