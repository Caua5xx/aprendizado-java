import java.util.Scanner;

public class SomaDeUmaSequencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Ùltimo número? ");
        int num = Integer.valueOf(leitor.nextLine());
        int i = 1;
        int soma = 0;

        while (i <= num) {
            soma += i;
            i++;
        }

        System.out.println(soma);
    }
}
