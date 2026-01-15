import java.util.Scanner;

public class JaChegamos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Dê um número: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num == 4) {
                break;
            } 
        }
    }
}
