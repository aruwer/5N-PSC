public class Conta {
    private int numero;
    private double saldo;
    private Gerente gerente;
    private Correntista correntista;

    public Conta(){

    }

    public Conta(int numero){
        this.numero = numero;
    }

    //retirada
    public void retirada(double valor){
        if (valor <= saldo){
            saldo = saldo - valor;
        }
    }
    //deposito
    public void deposito(double valor){
        saldo = saldo + valor;
    }
    //transferencia
    public void tranferencia(double valor, Conta destino){
        if (valor <= saldo){
            saldo = saldo - valor;
            destino.deposito(valor);
        }
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    //extrato
    public void extratoInfo(){
        System.out.println("Número da conta: " + numero);
        System.out.println("Correntista: " + correntista.getNome());
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Saldo: R$" + saldo);
    }
}
