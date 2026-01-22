import java.util.ArrayList;
import java.util.Scanner;

public class ImpressaoNaLinha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            System.out.println("Digite um número (9999 faz parar): ");
            int numero = Integer.valueOf(leitor.nextLine());

            if (numero == 9999) {
                break;
            }

            lista.add(numero);
        }

        System.out.println("Os números na faixa [0, 5]");
        printNumerosNoIntervalo(lista, 0, 5);
        System.out.println("Os números na faixa [3, 10]");
        printNumerosNoIntervalo(lista, 3, 10);
    }

    public static void printNumerosNoIntervalo(ArrayList<Integer> lista, int inicio, int fim) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= inicio && lista.get(i) <= fim) {
                System.out.println(lista.get(i));
            }
        }
    }
}
