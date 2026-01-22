import java.util.ArrayList;
import java.util.Scanner;

public class IndiceDe {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            System.out.println("Digite um número (-1 faz parar): ");
            int numero = Integer.valueOf(leitor.nextLine());

            if (numero == -1) {
                break;
            }

            lista.add(numero);
        }

        System.out.println("Procurar por qual número? ");
        int procurarNumero = Integer.valueOf(leitor.nextLine());

        for (int i = 0; i < lista.size(); i++) {
            int numeroAtual = lista.get(i);

            if (procurarNumero == numeroAtual) {
                System.out.println(procurarNumero + " está no índice " + i);
            }
        }
    }
}
