import java.util.*;

public class Teste {
    public static void main(String[] args) {

        System.out.println("Sistema de gestão de frota.");

        // Criando itens de entregas
        ItemEntrega item1 = new ItemEntrega(1, "item1");
        ItemEntrega item2 = new ItemEntrega(2, "item2");
        ItemEntrega item3 = new ItemEntrega(3, "item3");
        ItemEntrega item4 = new ItemEntrega(4, "item4");
        ItemEntrega item5 = new ItemEntrega(5, "item5");

        Stack<ItemEntrega> itensDeEntrega1 = new Stack<>();
        itensDeEntrega1.push(item1);
        itensDeEntrega1.push(item2);
        itensDeEntrega1.push(item3);

        System.out.println("Itens de entrega 1 = " + itensDeEntrega1);

        Stack<ItemEntrega> itensDeEntrega2 = new Stack<>();
        itensDeEntrega2.push(item4);
        itensDeEntrega2.push(item5);

        System.out.println("Itens de entrega 2 = " + itensDeEntrega2);

        // Criando Locais
        Local local1 = new Local(1, "local1", itensDeEntrega1);
        Local local2 = new Local(2, "local2", itensDeEntrega2);
        Local local3 = new Local(3, "local3", itensDeEntrega2);

        Queue<Local> pontoDeEntrega1 = new ArrayDeque<>();
        pontoDeEntrega1.add(local1);

        Queue<Local> pontoDeEntrega2 = new ArrayDeque<>();
        pontoDeEntrega2.add(local2);
        pontoDeEntrega2.add(local3);

        System.out.println("Ponto de entrega 1 possui " + pontoDeEntrega1.size() + " local de entrega.");
        System.out.println("Ponto de entrega 2 possui " + pontoDeEntrega2.size() + " locais de entrega");

        // Criando caminhões
        Caminhao caminhao1 = new Caminhao("XXX-XXXX", pontoDeEntrega1, itensDeEntrega1);
        Caminhao caminhao2 = new Caminhao("ZZZ-ZZZZ", pontoDeEntrega2, itensDeEntrega2);

        // Realizando confirmando associanções
        System.out.println(caminhao1);
        System.out.println(caminhao2);

        // Realizando entregas caminhão 1
        System.out.println("Realizando primeira entrega: "+ caminhao1.getItemEntregas().pop());
        System.out.println("Realizando segunda entrega: "+ caminhao1.getItemEntregas().pop());
        System.out.println("Realizando terceira entrega: "+ caminhao1.getItemEntregas().pop());
        System.out.println(caminhao1);

        // Realizando entregas caminhão 2
        System.out.println("Realizando primeira entrega: "+ caminhao2.getItemEntregas().pop());
        System.out.println("Realizando segunda entrega: "+ caminhao2.getItemEntregas().pop());
        System.out.println(caminhao2);

    }
}
