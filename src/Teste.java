import java.util.*;

public class Teste {
    public static void main(String[] args) {

        System.out.println("Sistema de gestão de frota\n");

        // Criando itens de entregas mock
        ItemEntrega item1 = new ItemEntrega(1, "item1");
        ItemEntrega item2 = new ItemEntrega(2, "item2");
        ItemEntrega item3 = new ItemEntrega(3, "item3");
        ItemEntrega item4 = new ItemEntrega(4, "item4");
        ItemEntrega item5 = new ItemEntrega(5, "item5");

        Stack<ItemEntrega> itensDeEntrega1 = new Stack<>();
        itensDeEntrega1.push(item1);
        itensDeEntrega1.push(item2);
        itensDeEntrega1.push(item3);

        Stack<ItemEntrega> itensDeEntrega2 = new Stack<>();
        itensDeEntrega2.push(item4);
        itensDeEntrega2.push(item5);

        Stack<ItemEntrega> itensDeEntrega3 = new Stack<>();
        itensDeEntrega3.push(item1);
        itensDeEntrega3.push(item2);

        Stack<ItemEntrega> itensDeEntrega4 = new Stack<>();
        itensDeEntrega4.push(item3);
        itensDeEntrega4.push(item4);
        itensDeEntrega4.push(item5);

        Local local1 = new Local(1, "local1", itensDeEntrega1);
        Local local2 = new Local(2, "local2", itensDeEntrega2);
        Local local3 = new Local(3, "local3", itensDeEntrega3);
        Local local4 = new Local(4, "local4", itensDeEntrega4);

        Queue<Local> pontoDeEntrega1 = new ArrayDeque<>();
        pontoDeEntrega1.add(local1);
        Queue<Local> pontoDeEntrega2 = new ArrayDeque<>();
        pontoDeEntrega2.add(local2);
        Queue<Local> pontoDeEntrega3 = new ArrayDeque<>();
        pontoDeEntrega3.add(local3);
        Queue<Local> pontoDeEntrega4 = new ArrayDeque<>();
        pontoDeEntrega4.add(local4);

        Caminhao caminhao1 = new Caminhao("XXX-XXXX", pontoDeEntrega1, itensDeEntrega1);
        Caminhao caminhao2 = new Caminhao("ZZZ-ZZZZ", pontoDeEntrega3, itensDeEntrega3);
        // Criando itens de entregas


        //Percurso caminhão 1
        System.out.println("Percurso do caminhão " + caminhao1);
        System.out.println("Visitado ponto de entrega " + pontoDeEntrega1 + ". Foram entregues os itens");
        System.out.println(itensDeEntrega1);
        System.out.println("Visitado ponto de entrega " + pontoDeEntrega2 + ". Foram entregues os itens");
        System.out.println(itensDeEntrega2);
        int totalDePontosDeEntregas = pontoDeEntrega1.size() + pontoDeEntrega2.size();
        System.out.println("Total de pontos de entregas: " + totalDePontosDeEntregas);
        int totalDeItensDeEntregas = itensDeEntrega1.size() + itensDeEntrega2.size();
        System.out.println("Total de itens de entregas: " + totalDeItensDeEntregas);

        //Percurso caminhão 1
        System.out.println("\nPercurso do caminhão " + caminhao2);
        System.out.println("Visitado ponto de entrega " + pontoDeEntrega3 + ". Foram entregues os itens");
        System.out.println(itensDeEntrega3);
        System.out.println("Visitado ponto de entrega " + pontoDeEntrega4 + ". Foram entregues os itens");
        System.out.println(itensDeEntrega4);
        totalDePontosDeEntregas = pontoDeEntrega3.size() + pontoDeEntrega4.size();
        System.out.println("Total de pontos de entregas: " + totalDePontosDeEntregas);
        totalDeItensDeEntregas = itensDeEntrega3.size() + itensDeEntrega4.size();
        System.out.println("Total de itens de entregas: " + totalDeItensDeEntregas);

    }
}
