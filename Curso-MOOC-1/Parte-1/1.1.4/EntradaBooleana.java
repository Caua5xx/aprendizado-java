import java.util.Scanner;

public class EntradaBooleana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        boolean entrada = Boolean.valueOf(leitor.nextLine());
        System.out.println("Verdadeiro ou falso? " + entrada);
    }
}
