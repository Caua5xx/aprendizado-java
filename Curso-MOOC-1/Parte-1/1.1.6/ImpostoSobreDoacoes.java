import java.util.Scanner;

public class ImpostoSobreDoacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor do presente? ");
        int valor = Integer.valueOf(leitor.nextLine());

        if (valor > 0 && valor < 5000) {
            System.out.println("Sem imposto!");
        } else if (valor >= 5000 && valor < 25000) {
            System.out.println("Imposto: " + (100 + (valor - 5000) * 0.08));
        } else if (valor >= 25000 && valor < 55000) {
            System.out.println("Imposto: " + (1700 + (valor - 25000) * 0.1));
        } else if (valor >= 55000 && valor < 200000) {
            System.out.println("Imposto: " + (4700 + (valor - 55000) * 0.12));
        } else if (valor >= 200000 && valor < 1000000) {
            System.out.println("Imposto: " + (22100 + (valor - 200000) * 0.15));
        } else if (valor > 1000000) {
            System.out.println("Imposto: " + (142100 + (valor - 1000000) * 0.17));
        } else {
            System.out.println("Impossível!");
        }
    }
}
