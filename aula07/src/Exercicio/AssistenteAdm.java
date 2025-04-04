package Exercicio;

public class AssistenteAdm extends Assistente{
    private String turno;
    private String turnoExtra = "noturno";

    public AssistenteAdm(){

    }

    public AssistenteAdm(String nome, String endereco, String sexo, int anoContratacao, String especializacao, String turno, String turnoExtra){
        super(nome, endereco, sexo, anoContratacao, especializacao);
        this.turno = turno;
        this.turnoExtra = turnoExtra;
    }

    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }

    public String getTurnoExtra(){
        return turnoExtra;
    }

    public void setTurnoExtra(String turnoExtra){
        this.turnoExtra = turnoExtra;
    }
}
