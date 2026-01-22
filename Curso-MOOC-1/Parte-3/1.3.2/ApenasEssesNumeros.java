import java.util.ArrayList;
import java.util.Scanner;

public class ApenasEssesNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            System.out.println("Digite um número( -1 faz parar): ");
            int numero = Integer.valueOf(leitor.nextLine());

            if (numero == -1) {
                break;
            }

            lista.add(numero);
        }

        System.out.println("De onde? ");
        int inicio = Integer.valueOf(leitor.nextLine());
        System.out.println("Para onde? ");
        int fim = Integer.valueOf(leitor.nextLine());

        for (int i = inicio; i <= fim; i++) {
            System.out.println(lista.get(inicio));
            inicio++;
        }
    }
}

