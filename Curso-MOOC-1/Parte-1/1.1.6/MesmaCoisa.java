import java.util.Scanner;

public class MesmaCoisa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê a primeira string: ");
        String msg1 = leitor.nextLine();
        System.out.println("Dê a segunda string: ");
        String msg2 = leitor.nextLine();

        if (msg1.equals(msg2)) {
            System.out.println("Mesma coisa");
        } else {
            System.out.println("Diferente");
        }
    }
}
