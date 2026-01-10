import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê o primeiro número: ");
        int num1 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dê o segundo número: ");
        int num2 = Integer.valueOf(leitor.nextLine());
        int resultado = num1 + num2;
        System.out.println("A soma dos números é " + resultado);
    }
}
