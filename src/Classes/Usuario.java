
package Classes;
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private boolean adm;

    public Usuario() {
        this.nome = "";
        this.email = "";
        this.cpf = "";
        this.senha = "";
        this.adm = false;
    }
    
    public boolean getAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
