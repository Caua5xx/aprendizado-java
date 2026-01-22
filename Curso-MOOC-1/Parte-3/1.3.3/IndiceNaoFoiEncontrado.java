import java.util.Scanner;

public class IndiceNaoFoiEncontrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[5];
        int encontrados = 0;

        lista[0] = 1;
        lista[1] = 3;
        lista[2] = 5;
        lista[3] = 7;
        lista[4] = 9;

        System.out.println("Procurar qual número? ");
        int numero = Integer.valueOf(leitor.nextLine());

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] == numero) {
                System.out.println(numero + " está no índice " + i);
                encontrados++;
                continue;
            }

            if (i == lista.length - 1 && encontrados == 0) {
                System.out.println(numero + " não foi encontrado");
                break;
            }
        }
    }
}
