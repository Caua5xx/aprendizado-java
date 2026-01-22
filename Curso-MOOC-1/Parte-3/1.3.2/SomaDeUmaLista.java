import java.util.ArrayList;
import java.util.Scanner;

public class SomaDeUmaLista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int soma = 0;

        while (true) {
            System.out.println("Digite um número(-1 faz parar): ");
            int numero = Integer.valueOf(leitor.nextLine());

            if (numero == -1) {
                break;
            }

            lista.add(numero);
        }

        for (int i: lista) {
            soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
