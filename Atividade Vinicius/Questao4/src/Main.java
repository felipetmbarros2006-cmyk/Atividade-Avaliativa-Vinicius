class No {
    String valor;
    int prioridade;
    No prox;

    public No(String valor, int prioridade) {
        this.valor = valor;
        this.prioridade = prioridade;
        this.prox = null;
    }
}

class PilhaMonotonica {

    private No topo;
    private int tamanho;

    public PilhaMonotonica() {
        topo = null;
        tamanho = 0;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void push(String valor, int prioridade) {

        if (prioridade < 1 || prioridade > 10) {
            System.out.println("Prioridade inválida: " + prioridade);
            return;
        }

        if (isEmpty() || prioridade >= topo.prioridade) {

            No novo = new No(valor, prioridade);
            novo.prox = topo;
            topo = novo;
            tamanho++;

        } else {
            System.out.println("Rejeitado: prioridade " + prioridade + " < topo=" + topo.prioridade);
        }
    }

    public String pop() {

        if (isEmpty()) {
            return "Pilha vazia";
        }

        String valor = topo.valor;
        topo = topo.prox;
        tamanho--;

        return valor;
    }

    public String peek() {

        if (isEmpty()) {
            return "Pilha vazia";
        }

        return topo.valor + " (Prioridade: " + topo.prioridade + ")";
    }

    public int count() {
        return tamanho;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return;
        }

        No atual = topo;

        while (atual != null) {
            System.out.println("Valor: " + atual.valor + " | Prioridade: " + atual.prioridade);
            atual = atual.prox;
        }
    }
}
public class Main {

    public static void main(String[] args) {

        PilhaMonotonica pilha = new PilhaMonotonica();

        pilha.push("Lavar carro", 4);
        pilha.push("Comprar pão", 5);
        pilha.push("Comprar ovo", 5);
        pilha.push("Pagar conta de energia", 8);
        pilha.push("Varrer a casa", 7); // rejeitado

        System.out.println("\nPilha após inserções:");
        pilha.display();

        System.out.println("\nRemovendo o elemento do topo: " + pilha.pop());

        System.out.println("\nPilha após remoção:");
        pilha.display();

        System.out.println("\nTotal de elementos na pilha: " + pilha.count());
    }
}