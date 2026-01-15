import java.util.Scanner;

public class NumeroDeNumeros {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int quantidade = 0;

        while (true) {
            
            System.out.println("Dẽ um número: ");
            int num = Integer.valueOf(leitor.nextLine());

            if (num == 0) {
                break;
            }

            quantidade = quantidade + 1;

        }

        System.out.println("Número de números: " + quantidade);

    }
}
