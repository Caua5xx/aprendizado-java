public class SuaPrimeiraTransferenciaBancaria {
    public static void main(String[] args) {
        Conta matthew = new Conta("Matthew Conta", 1000);
        Conta minha = new Conta("Minha Conta", 0);
        matthew.transferencia(100, minha);
        System.out.println("Matthew saldo: " + matthew.printConta());
        System.out.println("Meu saldo: " + minha.printConta());
    }
}

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nomeInicial, double saldoInicial) {
        nome = nomeInicial;
        saldo = saldoInicial;
    }

    public void transferencia(double qtdTransferir, Conta contaReceber) {
        saldo -= qtdTransferir;
        contaReceber.saldo += qtdTransferir;
    }

    public double printConta() {
        return saldo;
    }
}
