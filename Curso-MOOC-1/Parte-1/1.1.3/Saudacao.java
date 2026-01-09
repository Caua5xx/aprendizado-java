import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Oi, " + nome);
    }
}
