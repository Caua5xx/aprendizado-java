import java.util.Scanner;

public class Antigo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um ano: ");
        int ano = Integer.valueOf(leitor.nextLine());

        if (ano < 2015) {
            System.out.println("História antiga!");
        }
    }
}
