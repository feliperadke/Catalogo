import java.util.Date;

public class Livro extends Catalogo_Itens {
    private String editora;
    private Date anoPublicacao;

    public Livro (String editora, Date anoPublicacao) {
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora () {
        return editora;
    }

    public Date getAnoPublicacao () {
        return anoPublicacao;
    }
}
