import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = 0;
        
        System.out.println("Dê um número: ");
        int num2 = Integer.valueOf(leitor.nextLine());

        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }
    }
}
