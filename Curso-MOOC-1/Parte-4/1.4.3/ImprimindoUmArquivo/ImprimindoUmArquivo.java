import java.util.Scanner;
import java.nio.file.Paths;

public class ImprimindoUmArquivo {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(Paths.get("Curso-MOOC-1/Parte-4/1.4.3/ImprimindoUmArquivo/data.txt"))) {

            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                System.out.println(text);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}