package Heranca;

public class Pessoa {
    private String nome;
    protected String endereco;
    private String nacionalidade;

    public Pessoa(){

    }

    public Pessoa(String nome, String endereco, String nacionalidade){
        this.nome = nome;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Nacionalidade: " + nacionalidade);
    }
}
