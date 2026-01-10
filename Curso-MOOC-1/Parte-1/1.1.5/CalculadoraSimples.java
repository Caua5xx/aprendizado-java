import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê o primeiro número: ");
        int num1 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dê o segundo número: ");
        int num2 = Integer.valueOf(leitor.nextLine());
        int soma = num1 + num2;
        int subtracao = num1 - num2; 
        int multiplicacao = num1 * num2; 
        double divisao = 1.0 * num1 / num2;
        System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println(num1 + " - " + num2 + " = " + subtracao);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
        System.out.println(num1 + " / " + num2 + " = " + divisao);
    }
}
