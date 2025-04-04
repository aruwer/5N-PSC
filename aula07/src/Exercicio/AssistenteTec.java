package Exercicio;

public class AssistenteTec extends Assistente{
    private double bonusSalario;

    public AssistenteTec(){

    }

    public AssistenteTec(String nome, String endereco, String sexo, int anoContratacao, String especializacao, double bonusSalario){
        super(nome, endereco, sexo, anoContratacao, especializacao);
        this.bonusSalario = bonusSalario;
    }

    public double getBonusSalario(){
        return bonusSalario;
    }

    public void setBonusSalario(double bonusSalario){
        this.bonusSalario = bonusSalario;
    }
}
