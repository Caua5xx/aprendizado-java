import java.util.Scanner;

public class EVerdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê uma String: ");
        String palavra = leitor.nextLine();

        if (palavra.equals("true")) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Tente de novo!");
        }
    }
}
