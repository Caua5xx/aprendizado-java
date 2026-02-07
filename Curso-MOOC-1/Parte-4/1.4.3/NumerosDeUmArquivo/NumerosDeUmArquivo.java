import java.util.Scanner;
import java.nio.file.Paths;

public class NumerosDeUmArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do arquivo: ");
        String file = scanner.nextLine();

        int qtdNumeros = 0;

        try (Scanner reader = new Scanner(Paths.get("Curso-MOOC-1/Parte-4/1.4.3/NumerosDeUmArquivo/" + file + ".txt"))) {
            System.out.println("Limite Inferior: ");
            int lowerLimit = Integer.valueOf(scanner.nextLine());
            System.out.println("Limite superior: ");
            int upperLimit = Integer.valueOf(scanner.nextLine());

            while (reader.hasNextLine()) {
                int num = Integer.valueOf(reader.nextLine());

                if (num >= lowerLimit && num <= upperLimit) {
                    qtdNumeros++;
                }
            }

            System.out.println("Números: " + qtdNumeros);
        } catch (Exception e) {
            System.out.println("Lendo o arquivo " + file + " ERRO");
        }
    }
}