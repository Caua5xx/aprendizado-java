import java.util.Scanner;

public class SegundosEmUmDia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos dias você gostaria de converter para segundos? ");
        int dias = Integer.valueOf(leitor.nextLine());
        int segundos = dias * 24 * 60 * 60;
        System.out.println(segundos);
    }
}
