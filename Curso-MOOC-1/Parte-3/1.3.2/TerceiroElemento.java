import java.util.Scanner;
import java.util.ArrayList;

public class TerceiroElemento {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome (deixar em branco sai): ");
            String nome = leitor.nextLine().strip();
            
            if (nome.equals("")) {
                break;
            }

            lista.add(nome);
        }

        System.out.println(lista.get(2));
    }
}
