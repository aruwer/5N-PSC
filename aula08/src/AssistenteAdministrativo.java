public class AssistenteAdministrativo extends Assistente{
    private char turno;
    private double adicionalNoturno;

    public AssistenteAdministrativo(){

    }

    public AssistenteAdministrativo(String nome, String endereco, char sexo, int anoContratacao, String especializacao, char turno, double adicionalNoturno){
        super(nome, endereco, sexo, anoContratacao, especializacao);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public char getTurno(){
        return turno;
    }

    public void setTurno(char turno){
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
}
