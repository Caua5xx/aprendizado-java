import java.util.Scanner;

public class EntradaDupla {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê um número: ");
        double num = Double.valueOf(leitor.nextLine());
        System.out.println("Você deu o número " + num);
    }
}
