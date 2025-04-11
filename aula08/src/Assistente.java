public class Assistente extends Funcionario{
    protected String especializacao;

    public Assistente(){

    }

    public Assistente(String nome, String endereco, char sexo, int anoContratacao, String especializacao){
        super(nome, endereco, sexo, anoContratacao);
        this.especializacao = especializacao;
    }

    public String getEspecializacao(){
        return especializacao;
    }

    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }
}
