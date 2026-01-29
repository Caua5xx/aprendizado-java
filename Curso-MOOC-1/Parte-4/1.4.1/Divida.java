public class Divida {
    public static void main(String[] args) {
        Debt mortgage = new Debt(120000, 1);
        mortgage.printSaldo();

        mortgage.esperarUmAno();
        mortgage.printSaldo();

        int anos = 0;

        while (anos < 20) {
            mortgage.esperarUmAno();
            anos += 1;
        }

        mortgage.printSaldo();
    }
}

public class Debt {
    private double saldo;
    private double taxaJuros;

    public Debt(double saldoInicial, double taxaJurosInicial) {
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJurosInicial;
    }

    public void printSaldo() {
        System.out.println(saldo);
    }

    public void esperarUmAno() {
        this.saldo += this.taxaJuros * this.saldo / 100;
    }
}
