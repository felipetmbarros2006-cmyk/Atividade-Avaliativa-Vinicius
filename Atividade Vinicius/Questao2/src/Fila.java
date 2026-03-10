class No {
    String nome;
    int prioridade;
    No proximo;

    public No(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.proximo = null;
    }
}

public class Fila {

    private No inicio;

    public Fila() {
        inicio = null;
    }

    public void enqueue(String nome, int prioridade) {

        No novo = new No(nome, prioridade);

        if (inicio == null || prioridade > inicio.prioridade) {
            novo.proximo = inicio;
            inicio = novo;
            return;
        }

        No atual = inicio;

        while (atual.proximo != null && atual.proximo.prioridade >= prioridade) {
            atual = atual.proximo;
        }

        novo.proximo = atual.proximo;
        atual.proximo = novo;
    }

    public String dequeue() {

        if (inicio == null) {
            return "Fila vazia";
        }

        String nome = inicio.nome;
        inicio = inicio.proximo;

        return nome;
    }

    public int count() {

        int contador = 0;
        No atual = inicio;

        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }

        return contador;
    }

    public void display() {

        No atual = inicio;

        while (atual != null) {
            System.out.println("Nome: " + atual.nome + " Prioridade: " + atual.prioridade);
            atual = atual.proximo;
        }
    }

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.enqueue("Carlos",3);
        fila.enqueue("Ana",8);
        fila.enqueue("Mariana",5);
        fila.enqueue("João",8);
        fila.enqueue("Beatriz",10);
        fila.enqueue("Lucas",2);

        fila.display();

        System.out.println("Total: " + fila.count());

        System.out.println("Removido: " + fila.dequeue());
        System.out.println("Removido: " + fila.dequeue());

        fila.display();
    }
}
