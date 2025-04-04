package Exercicio;

public class Funcionario {
    protected String nome;
    protected String endereco;
    protected String sexo;
    protected int anoContratacao;

    public Funcionario(){

    }

    public Funcionario(String nome, String endereco, String sexo, int anoContratacao){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.anoContratacao = anoContratacao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public int getAnoContratacao(){
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao){
        this.anoContratacao = anoContratacao;
    }
}
