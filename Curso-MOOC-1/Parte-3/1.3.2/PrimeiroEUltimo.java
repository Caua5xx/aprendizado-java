import java.util.ArrayList;
import java.util.Scanner;

public class PrimeiroEUltimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome(deixar em branco faz parar): ");
            String nome = leitor.nextLine().strip();

            if (nome.equals("")) {
                break;
            }

            lista.add(nome);
        }

        int ultimoIndex = (lista.size() - 1);
        System.out.println("Primeiro nome da lista: " + (lista.get(0)));
        System.out.println("Último nome da lista: " + (lista.get(ultimoIndex)));
    }
}
