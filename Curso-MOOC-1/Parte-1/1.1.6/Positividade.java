import java.util.Scanner;

public class Positividade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um número: ");
        int num = Integer.valueOf(leitor.nextLine());

        if (num > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número não é positivo.");
        }
    }
}
