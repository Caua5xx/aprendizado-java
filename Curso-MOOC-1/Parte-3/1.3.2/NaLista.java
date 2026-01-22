import java.util.ArrayList;
import java.util.Scanner;

public class NaLista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome (deixar em branco faz parar): ");
            String nome = leitor.nextLine().strip();

            if (nome.equals("")) {
                break;
            }

            lista.add(nome);
        }

        System.out.println("Procurar pelo o que? ");
        String procurarNome = leitor.nextLine();

        if (lista.contains(procurarNome)) {
            System.out.println(procurarNome + " foi encontrado(a) na lista!");
        } else {
            System.out.println(procurarNome + " não foi encontrado(a) na lista!");
        }
    }
}
