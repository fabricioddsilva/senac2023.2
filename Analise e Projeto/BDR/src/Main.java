import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Controlador control = new Controlador();
        boolean menu = true;
        int codigo = 0;
        String nome = "";
        double saldo = 0;

        do {

            System.out.println("Sistema Bancario\n\n1 - Criar Conta\n2 - Exibir Conta\n3 - Editar Conta\n4 - Excluir Conta" +
                    "\n5 - Exibir Todas as Contas\n6 - Sair do Sistema\nSua Opção: ");

            int opcao = in.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.println("Digite o código da Conta: ");
                        codigo = in.nextInt();

                        System.out.println("Digite o seu nome: ");
                        nome = in.next();

                        System.out.println("Digite seu saldo inicial: ");
                        saldo = in.nextDouble();

                        Conta conta = new Conta(codigo, nome, saldo);

                        try {
                            control.criarConta(conta);
                        }catch (Exception e ){
                            e.printStackTrace();
                        }
                        break;

                    case 2:
                        System.out.println("Digite o Codigo da conta: ");
                        codigo = in.nextInt();

                        try{
                            control.exibirConta(codigo);
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case 3:
                        System.out.println("Digite o codigo da conta: ");
                        codigo = in.nextInt();
                        System.out.println("O que você deseja editar?\n1 - Nome\n2 - Saldo\n3 - Nome e Saldo");
                        int escolha = in.nextInt();
                        try {
                            control.editarConta(codigo, escolha);
                        }catch (Exception e) {

                        }
                        break;

                    case 4:
                        System.out.println("Digite o codigo da conta: ");
                        codigo = in.nextInt();
                        try {
                            control.excluirConta(codigo);
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case 5:
                        try{
                            control.listaContas();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        break;

                    case 6:
                        menu = false;
                        break;
                }

        } while (menu == true);


    }
}