public class Bitola {
    public static void main(String[] args) {
        Bitola g = new Bitola();

         while (!(g.full())) {
            System.out.println("Não cheio! Valor: " + g.value());
            g.increase();
        }

        System.out.println("Cheio! Valor : " + g.value());
        g.decrease();
        System.out.println("Não cheio! Valor: " + g.value());
    }

    private int valor;

    public Bitola() {
        this.valor = 0;
    }

    public void increase() {
        if (this.valor < 5) {
            this.valor++;
        }
    }

    public void decrease() {
        if (this.valor > 0) {
            this.valor--;
        }
    }

    public int value() {
        return this.valor;
    }

    public boolean full() {
        if (this.valor == 5) {
            return true;
        } else {
            return false;
        }
    }
}
