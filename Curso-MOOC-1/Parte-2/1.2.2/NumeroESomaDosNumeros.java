import java.util.Scanner;

public class NumeroESomaDosNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int quantidade = 0;

        while (true) {
            
            System.out.println("Dẽ um número: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num == 0) {
                break;
            }
            
            quantidade++;
            soma += num;
            
        }

        System.out.println("Número de números: " + quantidade);
        System.out.println("Soma dos números: " + soma);

    }
}
