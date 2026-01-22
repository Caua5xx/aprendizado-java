import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite Strings (deixar em branco faz parar): ");
            String frase = leitor.nextLine().strip();

            if (frase.equals("")) {
                break;
            }

            String[] pedacos = frase.split(" ");

            for (int i = 0; i < pedacos.length; i++) {
                if (pedacos[i].contains("av")) {
                    System.out.println(pedacos[i]);
                }
            }
        }
    }
}
