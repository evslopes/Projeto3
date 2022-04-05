import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Caminhao {
    private String placa;
    private Queue<Local> pontosDeEntrega; // Fila de entrega
    private Stack<ItemEntrega> itemEntregas; // Pilha de entrega

    public Caminhao(String placa, Queue<Local> pontosDeEntrega, Stack<ItemEntrega> itemEntregas) {
        this.placa = placa;
        this.pontosDeEntrega = pontosDeEntrega;
        this.itemEntregas = itemEntregas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Queue<Local> getPontosDeEntrega() {
        return pontosDeEntrega;
    }

    public void setPontosDeEntrega(Queue<Local> pontosDeEntrega) {
        this.pontosDeEntrega = pontosDeEntrega;
    }

    public Stack<ItemEntrega> getItemEntregas() {
        return itemEntregas;
    }

    public void setItemEntregas(Stack<ItemEntrega> itemEntregas) {
        this.itemEntregas = itemEntregas;
    }

    @Override
    public String toString() {
        return "Caminhão placa " + placa +
                " possui " + pontosDeEntrega.size() + " pontos de entrega com " + itemEntregas.size() + " item de entregas.";
    }
}
