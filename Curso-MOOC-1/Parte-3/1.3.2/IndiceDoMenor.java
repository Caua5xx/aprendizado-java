import java.util.ArrayList;
import java.util.Scanner;

public class IndiceDoMenor {
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

        int menorDaLista = menorNumero(lista);
        procurarIndice(lista, menorDaLista);
    }

    public static int menorNumero(ArrayList<Integer> lista) {
        int menorDaLista = lista.get(0);
        
        for (int i = 0; i < lista.size(); i++) {
            int numeroAtual = lista.get(i);

            if (numeroAtual < menorDaLista) {
                menorDaLista = numeroAtual;
            }
        }

        System.out.println("Menor número: " + menorDaLista);
        return menorDaLista;
    }

    public static void procurarIndice(ArrayList<Integer> lista, int menorDaLista) {
        for (int i = 0; i < lista.size(); i++) {
            if (menorDaLista == lista.get(i)) {
                System.out.println("Encontrado no índice: " + i);
            }
        }
    }
}
