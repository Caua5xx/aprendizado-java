import java.util.ArrayList;
import java.util.Scanner;

public class TamanhoDaLista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um nome para adicionar (deixar em branco sai): ");
            String nome = leitor.nextLine().strip();

            if (nome.equals("")) {
                break;
            }

            lista.add(nome);
        }

        System.out.println("No total: " + (lista.size()));
    }
}
