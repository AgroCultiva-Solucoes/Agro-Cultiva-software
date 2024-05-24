package Classes;

public class Atividade {
    
    private int idAtividade;
    private int idPesticida;
    private int idFertilizante;

    public Atividade(int idAtividade, int idPesticida, int idFertilizante) {
        this.idAtividade = idAtividade;
        this.idPesticida = idPesticida;
        this.idFertilizante = idFertilizante;
    }

    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    public int getIdPesticida() {
        return idPesticida;
    }

    public void setIdPesticida(int idPesticida) {
        this.idPesticida = idPesticida;
    }

    public int getIdFertilizante() {
        return idFertilizante;
    }

    public void setIdFertilizante(int idFertilizante) {
        this.idFertilizante = idFertilizante;
    }
}
