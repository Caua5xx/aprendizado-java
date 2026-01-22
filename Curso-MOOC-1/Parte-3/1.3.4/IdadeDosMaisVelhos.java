import java.util.Scanner;

public class IdadeDosMaisVelhos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maiorIdade = 0;

        while (true) {
            System.out.println("Digite seu nome e idade (deixar em branco faz parar): ");
            String dados = leitor.nextLine().strip();

            if (dados.equals("")) {
                break;
            }

            String[] informacoes = dados.split(",");
            int idade = Integer.valueOf(informacoes[1]);

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }

        System.out.println("Idade do mais velho: " + maiorIdade);
    }
}
