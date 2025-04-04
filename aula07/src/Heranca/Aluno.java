package Heranca;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(){

    }

    public Aluno(String nome, String endereco, String nacionalidade, int matricula, String curso){
        super(nome, endereco, nacionalidade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibeInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + endereco);
    }
}
