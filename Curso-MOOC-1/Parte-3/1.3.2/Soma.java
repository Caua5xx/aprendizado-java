import java.util.ArrayList;

public class Soma {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(6);
        lista.add(-1);
        System.out.println(soma(lista));

        lista.add(5);
        lista.add(1);
        System.out.println(soma(lista));
    }

    public static int soma(ArrayList<Integer> lista) {
        int somaDosNumeros = 0;

        for (int i: lista) {
            somaDosNumeros += i;
        }

        return somaDosNumeros;
    }
}
