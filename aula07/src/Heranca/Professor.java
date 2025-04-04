package Heranca;

public class Professor extends Pessoa{
    private int codigo;
    private String area;

    public Professor(){

    }

    public Professor(String nome, String endereco, String nacionalidade, int codigo, String area){
        super(nome, endereco, nacionalidade);
        this.codigo = codigo;
        this.area = area;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
