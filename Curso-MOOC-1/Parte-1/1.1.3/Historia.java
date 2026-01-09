import java.util.Scanner;

public class Historia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Vou contar uma história, mas preciso de algumas informações primeiro.");
        System.out.println("Como se chama o personagem principal?");
        String personagem = leitor.nextLine();
        System.out.println("Qual é o trabalho dele(a)?");
        String trabalho = leitor.nextLine();
        System.out.println("Aqui está a história:");
        System.out.println("Era uma vez " + personagem + ", que era " + trabalho + ".");
        System.out.println("No caminho para o trabalho, " + personagem + " refletiu sobre a vida.");
        System.out.println("Talvez " + personagem + " não seja " + trabalho + " para sempre.");
    }
}
