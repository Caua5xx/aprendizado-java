import java.util.Scanner;
import java.nio.file.Paths;

public class RegistrosDeUmArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do arquivo: ");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get("Curso-MOOC-1/Parte-4/1.4.3/RegistrosDeUmArquivo/" + file + ".txt"))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age <= 1) {
                    System.out.println(name + ", idade: " + age + " ano");
                } else {
                    System.out.println(name + ", idade: " + age + " anos");
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}