public class Pilha {
    private int capacidade;
    private String[] pilha;
    private int tamanho;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new String[capacidade];
        this.tamanho = 0;
    }

    public void push(String elemento) throws PilhaCheiaException {
        if (tamanho >= capacidade) {
            throw new PilhaCheiaException("A pilha está cheia. Não é possível inserir mais elementos.");
        }
        pilha[tamanho] = elemento;
        tamanho++;
    }

    public String pop() throws PilhaVaziaException {
        if (tamanho == 0) {
            throw new PilhaVaziaException("A pilha está vazia. Não é possível retirar elementos.");
        }
        tamanho--;
        return pilha[tamanho];
    }
}
