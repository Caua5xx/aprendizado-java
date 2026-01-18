import java.util.Scanner;

public class Reimpressao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas vezes? ");
        int vezes = Integer.valueOf(leitor.nextLine());

        while (vezes > 0) {
            printTexto();
            vezes--;
        }
    }

    public static void printTexto() {
        System.out.println("Em um buraco no chão vivia um método");
    }
}