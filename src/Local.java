import java.util.ArrayList;
import java.util.Stack;

public class Local {
    private int idLocal;
    private String nome;
    private Stack<ItemEntrega> conjuntoDeItens; //

    public Local(int idLocal, String nome, Stack<ItemEntrega> conjuntoDeItens) {
        this.idLocal = idLocal;
        this.nome = nome;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Stack<ItemEntrega> getConjuntoDeItens() {
        return conjuntoDeItens;
    }

    public void setConjuntoDeItens(Stack<ItemEntrega> conjuntoDeItens) {
        this.conjuntoDeItens = conjuntoDeItens;
    }

    @Override
    public String toString() {
        return "local id = " + idLocal +
                " " + nome +
                ", possui os itens de entrega = " + conjuntoDeItens + '.';
    }
}
