public class Main {
    public static void main(String[] args) {

        PilhaSequencial pilha = new PilhaSequencial();

        pilha.push(15);
        pilha.push(2);
        pilha.push(8);
        pilha.push(3);
        pilha.push(10);
        System.out.println("Topo: " + pilha.peek());
        pilha.push(20);
        System.out.println("Pilha após adicionar o 20:");
        pilha.mostrar();
        System.out.println("Pop: " + pilha.pop());
        System.out.println("Topo após pop: " + pilha.peek());
        System.out.println("Pilha:");
        pilha.mostrar();
        pilha.push(15);
        pilha.push(2);
        pilha.push(8);
        pilha.push(3);
        pilha.push(10);
        pilha.mostrar();

    }
}
