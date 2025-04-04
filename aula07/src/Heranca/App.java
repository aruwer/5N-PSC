package Heranca;

public class App {
    public static void main(String[] args) {
        System.out.println("Exemplo Herança");
        Pessoa p1 = new Pessoa("Adri", "Brasil", "Bra");
        p1.imprimeDados();

        Aluno a1 = new Aluno("Amanda", "Bra", "Bra", 2007, "Ciência da Computação");
        a1.exibeInfo();
        System.out.println("Curso: " + a1.getCurso());
        System.out.println("Matricula: " + a1.getMatricula());

        Professor prof1 = new Professor();
        prof1.setNome("Vitor");
        prof1.setCodigo(123);
        System.out.println(prof1.getNome() +" tem código " + prof1.getCodigo());
    }
}
