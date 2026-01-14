import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um número: ");
        int num = Integer.valueOf(leitor.nextLine());

        if (num < 0) {
            System.out.println(num * (-1));
        } else {
            System.out.println(num);
        }
    }
}
