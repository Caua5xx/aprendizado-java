import java.util.ArrayList;
import java.util.Scanner;

public class MaiorDaLista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int maiorDaLista = 0;

        while (true) {
            System.out.println("Digite um número ( -1 faz parar): ");
            int numero = Integer.valueOf(leitor.nextLine());

            if (numero == -1) {
                break;
            }

            lista.add(numero);
        }

        for (int i = 0; i < lista.size(); i++) {
            int numeroAtual = lista.get(i);

            if(numeroAtual > maiorDaLista) {
                maiorDaLista = numeroAtual;
            }
        }

        System.out.println("O maior número: " + maiorDaLista);
    }
}
