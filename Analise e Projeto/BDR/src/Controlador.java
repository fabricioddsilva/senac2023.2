import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Controlador {
    Scanner in = new Scanner(System.in);

    public void criarConta(Conta dados) {
        String query = "INSERT INTO tb_conta (codigo, nome, saldo) VALUES (?, ?, ?)";
        try{

           Connection conn = Conexao.abrir();
           PreparedStatement ptsm = conn.prepareStatement(query);
           ptsm.setInt(1, dados.getCodigo());
           ptsm.setString(2, dados.getNome());
           ptsm.setDouble(3, dados.getSaldo());

           ptsm.execute();

           ptsm.close();
           conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarConta(int codigo, int opcao){
        String nome = "";
        double saldo = 0;
        switch (opcao) {

           case 1:
               String query1 = "UPDATE tb_conta SET nome = ? WHERE codigo = ?";
               System.out.println("Digite o novo nome: ");
               nome = in.next();
               try{
                   Connection conn = Conexao.abrir();
                   PreparedStatement pstm = conn.prepareStatement(query1);
                   pstm.setString(1, nome);
                   pstm.setInt(2, codigo);
                   pstm.execute();

                   pstm.close();
                   conn.close();

               }catch (Exception e){
                   e.printStackTrace();
               }

               break;

           case 2:
               String query2 = "UPDATE tb_conta SET saldo = ? WHERE codigo = ?";
               System.out.println("Digite o novo saldo: ");
               saldo = in.nextDouble();
               try{
                   Connection conn = Conexao.abrir();
                   PreparedStatement pstm = conn.prepareStatement(query2);
                   pstm.setDouble(1, saldo);
                   pstm.setInt(2, codigo);
                   pstm.execute();

                   pstm.close();
                   conn.close();

               }catch (Exception e){
                   e.printStackTrace();
               }
               break;

           case 3:
               String query3 = "UPDATE tb_conta SET nome = ?, saldo = ? WHERE codigo = ?";

               System.out.println("Digite o novo nome: ");
               nome = in.next();

               System.out.println("Digite o novo saldo: ");
               saldo = in.nextDouble();

               try{
                   Connection conn = Conexao.abrir();
                   PreparedStatement pstm = conn.prepareStatement(query3);
                   pstm.setString(1, nome);
                   pstm.setDouble(2, saldo);
                   pstm.setInt(3, codigo);
                   pstm.execute();

                   pstm.close();
                   conn.close();

               } catch (Exception e) {
                    e.printStackTrace();
               }
               break;


       }


    }

    public void excluirConta(int codigo){
        String query = "DELETE FROM tb_conta WHERE codigo = ?";
        try {
            Connection conn = Conexao.abrir();
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, codigo);
            pstm.execute();

            pstm.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exibirConta(int id){
        String query = "SELECT codigo, nome, saldo FROM tb_conta WHERE codigo = ?";


        try {
            Connection conn = Conexao.abrir();
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            if(rs.next()){
                System.out.println("\nCodigo: " + rs.getInt("codigo") + "\nNome: " + rs.getString("nome")
                        + "\nSaldo: " + rs.getDouble("saldo"));

            }

            rs.close();
            pstm.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void listaContas(){
        String query = "SELECT codigo, nome, saldo FROM tb_conta";

        try{
            Connection conn = Conexao.abrir();
            PreparedStatement pstm = conn.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()) {
                System.out.println("\nCodigo: " + rs.getInt("codigo") + "\nNome: " + rs.getString("nome")
                        + "\nSaldo: " + rs.getDouble("saldo"));
            }

            rs.close();
            pstm.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
