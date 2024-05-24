package Classes;


public class Caixa {
    
    private int idFluxo;
    private int idEstoque;
    private int idSafra;

    public Caixa(int idFluxo, int idEstoque, int idSafra) {
        this.idFluxo = idFluxo;
        this.idEstoque = idEstoque;
        this.idSafra = idSafra;
    }

    public int getIdFluxo() {
        return idFluxo;
    }

    public void setIdFluxo(int idFluxo) {
        this.idFluxo = idFluxo;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getIdSafra() {
        return idSafra;
    }

    public void setIdSafra(int idSafra) {
        this.idSafra = idSafra;
    }   
}
