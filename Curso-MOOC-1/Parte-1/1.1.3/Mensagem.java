import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String mensagem = leitor.nextLine();
        System.out.println(mensagem);
    }
}
