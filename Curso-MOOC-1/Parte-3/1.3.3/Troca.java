import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[5];
        lista[0] = 1;
        lista[1] = 3;
        lista[2] = 5;
        lista[3] = 7;
        lista[4] = 9;

        for (int i: lista) {
            System.out.println(i);
        }

        System.out.println("\nDê dois índices para trocar: ");
        int primeiroNumero = Integer.valueOf(leitor.nextLine());
        int segundoNumero = Integer.valueOf(leitor.nextLine());
        System.out.println();

        int ajudante = lista[primeiroNumero];
        lista[primeiroNumero] = lista[segundoNumero];
        lista[segundoNumero] = ajudante;

        for (int i: lista) {
            System.out.println(i);
        }
    }
}
