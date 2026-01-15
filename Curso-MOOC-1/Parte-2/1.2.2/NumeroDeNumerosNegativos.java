import java.util.Scanner;

public class NumeroDeNumerosNegativos {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int quantidade = 0;

        while (true) {
            System.out.println("Dê um número: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num == 0) {
                break;
            }
            
            if (num < 0) {
                quantidade++;
            }
        }

        System.out.println("Número de números negativos: " + quantidade);

    }
}
