import java.util.Scanner;

public class MediaDosNumerosPositivos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int quantidade = 0;

        while (true) {
            System.out.println("Dê um número: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                soma += num;
                quantidade++;
            }

        }
        
        if (quantidade == 0) {
            System.out.println("Não é possível calcular a média");
        } else {
            double media = (double) soma / quantidade;
            System.out.println("Média dos números positivos: " + media);
        }
    }
}
