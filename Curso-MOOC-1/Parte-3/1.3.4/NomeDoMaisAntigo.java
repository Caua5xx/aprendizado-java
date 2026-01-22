import java.util.Scanner;

public class NomeDoMaisAntigo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maiorIdade = 0;
        String nome = "NA";

        while (true) {
            System.out.println("Digite seu nome e idade (deixar em branco faz parar): ");
            String dados = leitor.nextLine().strip();

            if (dados.equals("")) {
                break;
            }

            String[] informacoes = dados.split(",");
            int idade = Integer.valueOf(informacoes[1]);
            String nomeAtual = informacoes[0];

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nome = nomeAtual;
            }
        }

        System.out.println("Nome do mais velho: " + nome);
    }
}
