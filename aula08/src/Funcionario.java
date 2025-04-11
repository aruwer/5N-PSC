public abstract class Funcionario {
    private String nome;
    private String endereco;
    private char sexo;
    private int anoContratacao;

    public Funcionario(){

    }

    public Funcionario(String nome, String endereco, char sexo, int anoContratacao){
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

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public int getAnoContratacao(){
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao){
        this.anoContratacao = anoContratacao;
    }

    public void exibirRegistro(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ano de Contratação: " + anoContratacao);
    }
}
