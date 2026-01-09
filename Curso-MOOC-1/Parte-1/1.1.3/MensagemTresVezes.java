import java.util.Scanner;

public class MensagemTresVezes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva uma mensagem: ");
        String mensagem = leitor.nextLine();
        System.out.println(mensagem);
        System.out.println(mensagem);
        System.out.println(mensagem);
    }
}
