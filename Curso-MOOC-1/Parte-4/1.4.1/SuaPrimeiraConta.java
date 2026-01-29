public class SuaPrimeiraConta {
    public static void main(String[] args) {
        Conta artosConta = new Conta("Artos Conta", 100.00);
        Conta artosContaSuica = new Conta("Artos Conta Suíça", 1000000.00);

        System.out.println("Estado Inicial");
        System.out.println(artosConta);
        System.out.println(artosContaSuica);

        artosConta.saque(20);
        System.out.println("O valor disponível atual da conta do Artos: " + artosConta.extrato());
        artosContaSuica.deposito(200);
        System.out.println("O valor disponível atual da conta do Artos(Suíça): " + artosContaSuica.extrato());

        System.out.println("Estado final");        
        System.out.println(artosConta);
        System.out.println(artosContaSuica);
    }
}

public class Conta {
    private String nome;
    private double dinheiro;

    public Conta(String nomeInicial, double dinheiroInicial) {
        nome = nomeInicial;
        dinheiro = dinheiroInicial;
    }

    public void saque(double qtdRetirar) {
        dinheiro -= qtdRetirar;
    }

    public void deposito(double depositar) {
        dinheiro += depositar;
    }

    public double extrato() {
        return dinheiro;
    }
}
