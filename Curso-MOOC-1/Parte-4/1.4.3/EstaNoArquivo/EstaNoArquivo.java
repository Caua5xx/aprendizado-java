import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class EstaNoArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do arquivo:");
        String nomeDoArquivo = scanner.nextLine();

        ArrayList<String> strings = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get("Curso-MOOC-1/Parte-4/1.4.3/EstaNoArquivo/" + nomeDoArquivo + ".txt"))) {
            System.out.println("Buscar por: ");
            String buscarString = scanner.nextLine();

            while (reader.hasNextLine()) {
                strings.add(reader.nextLine());
            }

            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).equals(buscarString)) {
                    System.out.println("Encontrado!");
                    break;
                }
                
                if (strings.size() - 1 == i) {
                    System.out.println("Não encontrado.");
                }
            }

        } catch (Exception e) {
            System.out.println("Lendo o arquivo " + nomeDoArquivo + " falhou.");
        }
    }
}