import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Senha? ");
        String senha = leitor.nextLine();

        if (senha.equals("Caput Draconis")) {
            System.out.println("Bem-Vindo!");
        } else {
            System.out.println("Vai embora!");
        }
    } 
}
