import java.util.Scanner;

public class Logar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a senha: ");
        String senha = leitor.nextLine();

        if (nome.equals("Alex") && senha.equals("sunshine")) {
            System.out.println("Você fez login com sucesso!");
        }else if (nome.equals("Emma") && senha.equals("haskell")) {
            System.out.println("Você fez login com sucesso!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos!");
        }
    }
}
