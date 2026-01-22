import java.util.ArrayList;
import java.util.Scanner;

public class MediaDeUmaLista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int somaDoTotal = 0;
        int somaDaQuantidade = 0;

        while (true) {
            System.out.println("Digite um número (-1 faz parar): ");
            int numero = Integer.valueOf(leitor.nextLine());

            if (numero == -1) {
                break;
            }

            lista.add(numero);
        }

        for (int i: lista) {
            somaDoTotal += i;
            somaDaQuantidade++;
        }

        System.out.println("Média: " + ( 1.0 * somaDoTotal / somaDaQuantidade));
    }
}
