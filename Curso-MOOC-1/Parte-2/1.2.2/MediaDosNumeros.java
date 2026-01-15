import java.util.Scanner;

public class MediaDosNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;

        while (true) {
            System.out.println("Dê um número: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num == 0 && quantidade == 0) {
                System.out.println("Dê pelo o menos um número!");
                continue;
            }

            if (num == 0) {
                break;
            }

            soma += num;
            quantidade++;

        }

        double media = soma / quantidade;
        System.out.println("Média dos números: " + media);

    }
}
