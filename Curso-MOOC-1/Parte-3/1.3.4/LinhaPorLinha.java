import java.util.Scanner;

public class LinhaPorLinha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite Strings (deixar em branco faz parar): ");
            String frase = leitor.nextLine().strip();
            String[] pedacos = frase.split(" ");
            
            if (frase.equals("")) {
                break;
            }

            for (int i = 0; i < pedacos.length; i++) {
                System.out.println(pedacos[i]);
            }
        }
    }
}
