import java.util.Scanner;
import java.util.ArrayList;

public class SegundoMaisTerceiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while(true) {
            System.out.println("Digite um valor inteiro(0 faz parar): ");
            int valor = Integer.valueOf(leitor.nextLine());

            if (valor == 0) {
                break;
            }

            lista.add(valor); 
        }

        System.out.println("Soma do segundo e terceiro valor: " + (lista.get(1) + lista.get(2)));
    }
}
