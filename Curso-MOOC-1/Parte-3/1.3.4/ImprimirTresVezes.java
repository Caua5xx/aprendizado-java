import java.util.Scanner;

public class ImprimirTresVezes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Dê uma palavra: ");
        String palavra = leitor.nextLine();
        System.out.println("");
        System.out.print(palavra);
        System.out.print(palavra);
        System.out.println(palavra);
    }
}
