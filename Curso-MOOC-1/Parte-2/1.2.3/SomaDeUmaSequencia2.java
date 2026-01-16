import java.util.Scanner;

public class SomaDeUmaSequencia2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Primeiro número? ");
        int num1 = Integer.valueOf(leitor.nextLine());
        System.out.println("Segundo número? ");
        int num2 = Integer.valueOf(leitor.nextLine());
        int soma = 0;

        while (num1 <= num2) {
            soma += num1;
            num1++;
        }

        System.out.println("A soma é " + soma);
    }
}
