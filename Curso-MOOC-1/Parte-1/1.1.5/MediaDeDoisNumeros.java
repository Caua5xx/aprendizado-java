import java.util.Scanner;

public class MediaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê o primeiro número: ");
        int num1 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dê o segundo número: ");
        int num2 = Integer.valueOf(leitor.nextLine());
        double media = (1.0 * num1 + num2) / 2;
        System.out.println("A média é " + media);
    }
}
