import java.util.Stack;

public class Local {
    private int idLocal;
    private String nome;
    private Itens itens;

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

    public Itens getItens() {
        return itens;
    }

    public void setItens(Itens itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "<" + getNome() + ">";
    }


}
