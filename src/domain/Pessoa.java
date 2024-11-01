package domain;
import java.util.Date;

public class Pessoa {

    private String nome;
    private Date dt_nasc;
    private String cpf;
    private char sexo;
    private String estado_civil;
    private String telefone;
    private String endereco;
    private String login;
    private String senha;

    public Pessoa(String nome, Date dt_nasc, String cpf, char sexo, String estado_civil, String telefone,
            String endereco, String login, String senha) {
        this.nome = nome;
        this.dt_nasc = dt_nasc;
        this.cpf = cpf;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.telefone = telefone;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
