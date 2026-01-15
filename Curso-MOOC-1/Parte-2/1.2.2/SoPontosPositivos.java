import java.util.Scanner;

public class SoPontosPositivos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Dê um número: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num < 0) {
                System.out.println("Número inadequado");
                continue;
            }

            if (num == 0) {
                break;
            }

            System.out.println(num * num);

        }
    }
}
