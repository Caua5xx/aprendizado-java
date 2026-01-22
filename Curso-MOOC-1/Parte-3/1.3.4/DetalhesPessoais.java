import java.util.Scanner;

public class DetalhesPessoais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeMaior = "NA";
        int soma = 0;
        int quantidade = 0;

        while (true) {
            System.out.println("Digite seu nome e sua data de nascimento (deixar em branco faz parar): ");
            String dados = leitor.nextLine().strip();

            if (dados.equals("")) {
                break;
            }

            String[] informacoes = dados.split(",");
            
            for (int i = 1; i == 1; i++) {
                int idadeAtual = Integer.valueOf(informacoes[1]);
                soma += idadeAtual;
                quantidade++;
            }

            for (int i = 0; i == 0; i++) {
                String nomeAtual = informacoes[0];

                if (nomeAtual.length() > nomeMaior.length()) {
                    nomeMaior = nomeAtual;
                }
            }
        }

        double media = 1.0 * soma / quantidade;

        System.out.println("Nome mais longo: " + nomeMaior);
        System.out.println("Média dos anos de nascimento: " + media);
    }
}
