import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dẽ o primeiro número: ");
        int num1 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dẽ o segundo número: ");
        int num2 = Integer.valueOf(leitor.nextLine());

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 < num2 ) {
            System.out.println(num1 + " é menor que " + num2);
        } else {
            System.out.println(num1 + " é igual a " + num2);
        }
    }
}
