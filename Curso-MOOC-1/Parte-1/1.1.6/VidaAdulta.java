import java.util.Scanner;

public class VidaAdulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos anos tem? ");
        int idade = Integer.valueOf(leitor.nextLine());

        if (idade >= 18) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você não é adulto");
        }
    }
}
