import java.util.Scanner;

public class RaizQuadradaDaSoma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê o primeiro número: ");
        int num1 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dê o segundo número: ");
        int num2 = Integer.valueOf(leitor.nextLine());
        double raiz = Math.sqrt(num1 + num2);
        System.out.println(raiz);
    }
}
