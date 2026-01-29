public class ContadorDecrescente {
    public static void main(String[] args) {
        ContadorDecrescenteE contador = new ContadorDecrescenteE(100);

        contador.printValor();

        contador.resetar();
        contador.printValor();

        contador.diminuir();
        contador.printValor();
    }
}

public class ContadorDecrescenteE {
    private int valor;

    public ContadorDecrescenteE(int valorInicial) {
        valor = valorInicial;
    }

    public void printValor() {
        System.out.println("Valor: " + valor);
    }

    public void diminuir() {
        if (valor > 0) {
            valor--;
        }
    }

    public void resetar() {
        valor = 0;
    }
}
