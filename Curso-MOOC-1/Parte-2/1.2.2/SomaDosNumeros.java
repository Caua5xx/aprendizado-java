import java.util.Scanner;

public class SomaDosNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;

        while (true) {
            System.out.println("Dê um número: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num == 0) {
                break;
            }

            soma += num;

        }

        System.out.println("Soma dos números: " + soma);

    }
}
