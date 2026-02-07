import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class ListaDeConvidadosAPartirDeUmArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o arquivo: ");
        String file = scanner.nextLine();
        
        ArrayList<String> names = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(("Curso-MOOC-1/Parte-4/1.4.3/ListaDeConvidadosAPartirDeUmArquivo/" + file + ".txt")))) {
            while (reader.hasNextLine()) {
                String nm = reader.nextLine();
                names.add(nm);
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        while (true) {
            System.out.print("Digite o nome que deseja procurar na lista(deixar em branco encerra): ");
            String findName = scanner.nextLine().strip();

            if (findName.isEmpty()) {
                break;
            }
                
            for (int i = 0; i < names.size(); i++) {
                if (findName.equals(names.get(i))) {
                    System.out.println(findName + " está na lista.");
                    break;
                }

                if (names.size() - i == 1) {
                    System.out.println(findName + " não está na lista.");
                }
            }
        }
    }
}