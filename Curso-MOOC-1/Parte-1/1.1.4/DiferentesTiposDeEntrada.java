import java.util.Scanner;

public class DiferentesTiposDeEntrada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê uma string: ");
        String entrada1 = leitor.nextLine();
        System.out.println("Dê um inteiro: ");
        int entrada2 = Integer.valueOf(leitor.nextLine());
        System.out.println("Dê um double: ");
        double entrada3 = Double.valueOf(leitor.nextLine());
        System.out.println("Dê um booleano: ");
        boolean entrada4 = Boolean.valueOf(leitor.nextLine());
        System.out.println("Você deu a string " + entrada1);
        System.out.println("Você deu o inteiro " + entrada2);
        System.out.println("Você deu o double " + entrada3);
        System.out.println("Você deu o booleano " + entrada4);
    }
}
