public class MinhaThread implements Runnable {

    private String nome;

    private int valorInicial;

    private int valorFinal;

    public MinhaThread(String nome, int valorInicial, int valorFinal) {
        this.nome = nome;
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }

    public void run(){
        for (int i = valorInicial; i<valorFinal; i++){
            if ( ( i % 3 ) == 0){
                System.out.println("Número Divisivel por 3: " + i);
            }

            if (( i % 5 ) == 0) {
                System.out.println("Número Divisivel por 5: " + i);

            }
            
    }
}
}
