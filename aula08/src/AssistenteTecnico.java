public class AssistenteTecnico extends Assistente{
    private double percentualBonus;

    public AssistenteTecnico(){

    }

    public AssistenteTecnico(String nome, String endereco, char sexo, int anoContratacao, String especializacao, double bonusSalario){
        super(nome, endereco, sexo, anoContratacao, especializacao);
        this.percentualBonus = percentualBonus;
    }

    public double getBonusSalario(){
        return percentualBonus;
    }

    public void setBonusSalario(double bonusSalario){
        this.percentualBonus = percentualBonus;
    }
}
