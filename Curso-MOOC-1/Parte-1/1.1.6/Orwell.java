import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um número: ");
        int num = Integer.valueOf(leitor.nextLine());

        if (num == 1984) {
            System.out.println("Orwell");
        }
    }
}
