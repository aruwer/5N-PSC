public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta(123);
        Correntista cor1 = new Correntista("Adriana");
        Gerente g = new Gerente("Amanda", "Poa", 'F', 2010, "Senior");

        c1.setCorrentista(cor1);
        c1.setGerente(g);
        c1.extratoInfo();

        g.exibirRegistro();

    }
}
