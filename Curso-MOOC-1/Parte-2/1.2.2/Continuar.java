import java.util.Scanner;

public class Continuar {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Vamos continuar? ");
            String msg = leitor.nextLine();
            if (msg.equals("Não")) {
                break;
            }
        }
    }
}
