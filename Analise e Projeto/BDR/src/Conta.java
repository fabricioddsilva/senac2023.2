public class Conta {

    private int codigo;

    private String nome;

    private double saldo;

    public Conta() {
    }

    public Conta(int codigo, String nome, double saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
