public class Revista extends Catalogo_Itens {
    private int anoPublicacao;
    private int volume;
    private String editora;
    private String principalAssunto;

    public Revista (int anoPublicacao, int volume, String editora, String principalAssunto) {
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.volume = volume;
        this.principalAssunto = principalAssunto;
    }

    public int getAnoPublicacao () {
        return anoPublicacao;
    }

    public int getVolume () {
        return volume;
    }

    public String getEditora () {
        return editora;
    }

    public String getPrincipalAssunto () {
        return principalAssunto;
    }
}
