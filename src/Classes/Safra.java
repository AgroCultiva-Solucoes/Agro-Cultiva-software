package Classes;

public class Safra {
    
    private int idSafra;
    private int idUser;
    private int idMaquinario;
    private int idEstoque;
    private int idClima;
    private int idAtividade;

    public Safra(int idSafra, int idUser, int idMaquinario, int idEstoque, int idClima, int idAtividade) {
        this.idSafra = idSafra;
        this.idUser = idUser;
        this.idMaquinario = idMaquinario;
        this.idEstoque = idEstoque;
        this.idClima = idClima;
        this.idAtividade = idAtividade;
    }

    public int getIdSafra() {
        return idSafra;
    }

    public void setIdSafra(int idSafra) {
        this.idSafra = idSafra;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdMaquinario() {
        return idMaquinario;
    }

    public void setIdMaquinario(int idMaquinario) {
        this.idMaquinario = idMaquinario;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getIdClima() {
        return idClima;
    }

    public void setIdClima(int idClima) {
        this.idClima = idClima;
    }

    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }    
}
