package ExercicioAula04.Ex03;

public class App {
    public static void main(String[] args) {
        System.out.println("Programa com Associação");
        Fabricante f1 = new Fabricante("Coca-Cola", "Brasil");

        Produto p1 = new Produto(125, "Fanta", 2.60, f1);
        System.out.println(p1.getCodigo() + " é fabricado por: " + p1.getFabricante().getNome());

        Produto p2 = new Produto(126, "Sprite", 2.50, f1);
        System.out.println(p2.getCodigo() + " é fabricado por: " + p2.getFabricante().getNome());

        /*System.out.println("Teste Produto");
        Produto p1 = new Produto();
        System.out.println("Código: " + p1.getCodigo());

        Produto p2/identificador/; //criei apenas a referência
        p2 = new Produto();//atribuição da area inflada do construtor
        p2.setCodigo(666);
        System.out.println("Código: " + p2.getCodigo());

        Produto p3 = new Produto(2001, "Coca-Cola", 2.50, "Coca");
        System.out.println("P3: " + p3.getCodigo() + ", " +p3.getFabricante());*/
    }
}
