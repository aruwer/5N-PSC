public class Gerente extends Funcionario{
    private String nivel;

    public Gerente(){

    }

    public Gerente(String nome, String endereco, char sexo, int anoContratacao, String nivel){
        super(nome, endereco, sexo, anoContratacao);
        this.nivel = nivel;
    }

    public String getNivel(){
        return nivel;
    }

    public void setNivel(String nivel){
        this.nivel = nivel;
    }

    public void exibirRegistro(){
        
    }
}
