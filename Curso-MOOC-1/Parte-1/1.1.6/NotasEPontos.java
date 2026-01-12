import java.util.Scanner;

public class NotasEPontos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dê pontos [0-100]: ");
        int pontos = Integer.valueOf(leitor.nextLine());

        if (pontos > 100) {
            System.out.println("Incrível!");
        } else if (pontos >= 90) {
            System.out.println("Nota: 5");
        } else if (pontos >= 80) {
            System.out.println("Nota: 4");
        } else if (pontos >= 70) {
            System.out.println("Nota: 3");
        } else if (pontos >= 60) {
            System.out.println("Nota: 2");
        } else if (pontos >= 50) {
            System.out.println("Nota: 1");
        } else if (pontos >= 0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Impossível!");
        }
    }
}
