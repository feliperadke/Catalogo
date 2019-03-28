import java.util.Date;
import java.util.List;

public abstract class Catalogo_Itens {
    private int PK;
    private String nome;
    private Date dataAquisicao;
    private List atores;

    public int getPK () {
        return PK;
    }

    public void setPK (int PK) {
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
    }

    public Date getData_aquisicao () {
        return dataAquisicao;
    }

    public void setDataAquisicao (Date dataAquisicao) {
    }

    public List getAtores () {
        return atores;
    }

    public void setAtores (List atores) {
    }
}
