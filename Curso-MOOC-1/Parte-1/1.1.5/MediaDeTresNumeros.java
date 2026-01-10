import java.util.Scanner;

public class MediaDeTresNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê o primeiro número: ");
        int num1 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dê o segundo número: ");
        int num2 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dê o terceiro número: ");
        int num3 = Integer.valueOf(leitor.nextLine());
        double media = (num1 + num2 + num3) / 3.0;
        System.out.println("A média é " + media);
    }
}
