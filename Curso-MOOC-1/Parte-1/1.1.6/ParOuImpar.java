import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um número: ");
        int num = Integer.valueOf(leitor.nextLine());

        if (num % 2 == 0) {
            System.out.println("Número " + num + " é par.");
        } else {
            System.out.println("Número " + num + " é ímpar.");
        }
    }
}
