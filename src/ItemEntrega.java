public class ItemEntrega {
    private int idItemEntrega;
    private String nome;

    public ItemEntrega(int idItemEntrega, String nome) {
        this.idItemEntrega = idItemEntrega;
        this.nome = nome;
    }

    public int getIdItemEntrega() {
        return idItemEntrega;
    }

    public void setIdItemEntrega(int idItemEntrega) {
        this.idItemEntrega = idItemEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "id:" + idItemEntrega + " " + nome;
    }


}
