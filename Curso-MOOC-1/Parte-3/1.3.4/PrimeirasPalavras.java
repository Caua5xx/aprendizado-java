import java.util.Scanner;

public class PrimeirasPalavras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite Strings (deixar em branco faz parar): ");
            String palavras = leitor.nextLine().strip();

            if (palavras.equals("")) {
                break;
            }

            String[] pedacos = palavras.split(" ");
            System.out.println(pedacos[0]);
        }
    }
}
