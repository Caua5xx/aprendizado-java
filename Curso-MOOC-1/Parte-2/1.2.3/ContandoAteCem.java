import java.util.Scanner;

public class ContandoAteCem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um número: ");
        int num = Integer.valueOf(leitor.nextLine());

        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
