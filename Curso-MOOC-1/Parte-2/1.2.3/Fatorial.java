import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um número: ");
        int num = Integer.valueOf(leitor.nextLine());
        int fatorial = 1;

        while (num > 0) {
            fatorial *= num;
            num--;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
