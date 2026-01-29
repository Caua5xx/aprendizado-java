public class Multiplicador {
    public static void main(String[] args) {
        Multiplicador multiplicarPorTres = new Multiplicador(3);

        System.out.println("multiplicarPorTres.multiplicar(3): " + multiplicarPorTres.multiplicar(2));

        Multiplicador multiplicarPorQuatro = new Multiplicador(4);

        System.out.println("multiplicarPorQuatro.multiplicar(2): " + multiplicarPorQuatro.multiplicar(2));
        System.out.println("multiplicarPorTres.multiplicar(1): " + multiplicarPorTres.multiplicar(1));
        System.out.println("multiplicarPorQuatro.multiplicar(1): " + multiplicarPorQuatro.multiplicar(1));
    }

    //Classe Multiplicar
    private int numero;
    
    public Multiplicador(int numero) {
        this.numero = numero;
    }

    public int multiplicar(int valor) {
        return this.numero * valor;
    }
}
