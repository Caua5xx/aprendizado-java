import java.util.Scanner;

public class RepetindoQuebrandoELembrando {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int numeroDeNumeros = 0;
        int par = 0;
        int impar = 0;

        while (true) {
            System.out.println("Dê números: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                par++;
            } else{
                impar++;
            }

            soma += num;
            numeroDeNumeros++;
        }

        System.out.println("Obrigado! Tchau!");
        System.out.println("Soma: " + soma);
        System.out.println("Números: " + numeroDeNumeros);
        System.out.println("Média: " + ((double) soma / numeroDeNumeros));
        System.out.println("Par: " + par);
        System.out.println("Ímpares: " + impar);
    }
}
