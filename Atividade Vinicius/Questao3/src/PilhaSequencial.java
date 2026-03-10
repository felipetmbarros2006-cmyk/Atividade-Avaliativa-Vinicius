public class PilhaSequencial {

    private int[] pilha;
    private int topo;
    private int capacidade;


    public PilhaSequencial() {
        capacidade = 5;
        pilha = new int[capacidade];
        topo = -1;
    }


    public boolean isEmpty() {
        return topo == -1;
    }


    public void push(int valor) {
        if (topo == capacidade - 1) {
            expandir();
        }
        pilha[++topo] = valor;
    }


    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return pilha[topo--];
    }


    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return pilha[topo];
    }


    private void expandir() {
        capacidade = capacidade * 2;
        int[] novaPilha = new int[capacidade];

        for (int i = 0; i <= topo; i++) {
            novaPilha[i] = pilha[i];
        }

        pilha = novaPilha;
    }

    public void mostrar() { 
        for (int i = topo; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }
}
