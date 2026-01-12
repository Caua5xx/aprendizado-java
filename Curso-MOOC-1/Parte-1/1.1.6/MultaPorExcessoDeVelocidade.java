import java.util.Scanner;

public class MultaPorExcessoDeVelocidade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê velocidade: ");
        int velocidade = Integer.valueOf(leitor.nextLine());
        
        if (velocidade > 120) {
            System.out.println("Multa por excesso de velocidade!");
        }
    }
}
