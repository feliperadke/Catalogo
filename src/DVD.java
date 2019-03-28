public class DVD extends Catalogo_Itens {
    private String tipo;
    private String descricao;

    public DVD (String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo () {
        return tipo;
    }

    public String getDescricao () {
        return descricao;
    }
}
