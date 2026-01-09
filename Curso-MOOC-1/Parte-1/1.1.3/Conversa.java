import java.util.Scanner;

public class Conversa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Saudações! Como vai você?");
        String msg1 = leitor.nextLine();
        System.out.println("Ah, que interessante. Me conte mais!");
        String msg2 = leitor.nextLine();
        System.out.println("Obrigado por compartilhar!");
    }
}
