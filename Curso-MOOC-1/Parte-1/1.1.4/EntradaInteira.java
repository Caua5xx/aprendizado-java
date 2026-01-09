import java.util.Scanner;

public class EntradaInteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um número: ");
        int num = Integer.valueOf(leitor.nextLine());
        System.out.println("Você deu o número " + num);
    }
}
