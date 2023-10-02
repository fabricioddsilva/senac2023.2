public class Main {
    public static void main(String[] args) {
        try {
            Pilha minhaPilha = new Pilha(5);

            minhaPilha.push("Mesa");
            minhaPilha.push("Cadeira");
            minhaPilha.push("Computador");

            System.out.println(minhaPilha.pop());
            System.out.println(minhaPilha.pop());
            System.out.println(minhaPilha.pop());
            System.out.println(minhaPilha.pop());
        } catch (PilhaCheiaException e) {
            System.out.println(e.getMessage());
        } catch (PilhaVaziaException e) {
            System.out.println(e.getMessage());
        }
    }
}