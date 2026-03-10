

public class FilaSequencial {

    private int[] Fila;
    private int inicio;
    private int fim;
    private int tamanho;


    public FilaSequencial(){
        Fila = new int[5];
        inicio = 0;
        fim = 0;
        tamanho = 0;

    }
    public void enqueue(int valor){

        if (tamanho == Fila.length){
            expand();
        }

        Fila[fim] = valor;
        fim++;
        tamanho++;
    }


    public int dequeue() {
        if (tamanho == 0) {
            System.out.println("Fila Vazia");
            return -1;
        }
        int valor = Fila[inicio];
        inicio++;
        tamanho--;
        return valor;
    }
    private void expand() {
        int[] NovaFila = new int[Fila.length * 2];

        for (int i = 0; i < tamanho; i++) {
            NovaFila[i] = Fila[inicio + i];
        }
        Fila = NovaFila;
        inicio = 0;
        fim = tamanho;
    }
    public void MostrarFila(){

        if(tamanho == 0){
            System.out.println("Fila Vazia");
            return;
        }
        for(int i = inicio; i < fim;i++){
            System.out.print(Fila[i] + "");
    }
        System.out.println();
    }
    public static void main(String[] args){
        FilaSequencial fila = new FilaSequencial();
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        fila.enqueue(50);

        System.out.println("Fila após enqueue: ");
        fila.MostrarFila();

        fila.enqueue(60);

        System.out.println("Após expandir:");
        fila.MostrarFila();

        fila.dequeue();
        fila.dequeue();

        System.out.println("Após dequeue:");
        fila.MostrarFila();
    }
}
