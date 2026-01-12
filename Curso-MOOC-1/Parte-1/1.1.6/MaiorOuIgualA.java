import java.util.Scanner;

public class MaiorOuIgualA {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê o primeiro número: ");
        int num1 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dê o segundo número: ");
        int num2 = Integer.valueOf(leitor.nextLine());

        if (num1 > num2) {
            System.out.println("O número maior é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O número maior é: " + num2);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
