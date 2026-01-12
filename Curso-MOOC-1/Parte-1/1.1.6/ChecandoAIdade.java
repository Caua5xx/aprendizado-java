import java.util.Scanner;

public class ChecandoAIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos anos tem? ");
        int idade = Integer.valueOf(leitor.nextLine());

        if (idade < 0 || idade > 120) {
            System.out.println("Impossível!");
        } else {
            System.out.println("OK");
        }
    }
}
