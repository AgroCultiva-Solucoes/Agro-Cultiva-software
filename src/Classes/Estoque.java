package Classes;


public class Estoque {
    
    private int idEstoque;
    private String nome;
    private double quantidade;
    private double preco;
    private String descricao;

    public Estoque() {
    }

    public Estoque(int idEstoque,String nome, double quantidade, double preco, String descricao) {
        this.idEstoque = idEstoque;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
    }
    public Estoque(int idEstoque, double quantidade, double preco) {
        this.idEstoque = idEstoque;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco (double preco) {
        this.preco = preco;
    }

    
   
}
