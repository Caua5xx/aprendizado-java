import java.util.Scanner;
import java.nio.file.Paths;

public class ImpressaoDeUmArquivoEspecificado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome de arquivo para ler: ");
        String file = scanner.nextLine();

        //Tentar encontrar o arquivo para o scanner
        try (Scanner reader = new Scanner(Paths.get(("Curso-MOOC-1/Parte-4/1.4.3/ImpressaoDeUmArquivoEspecificado/" + file + ".txt")))) {
            
            //Verificar se ainda tem alguma linha no arquivo
            while (reader.hasNextLine()) {
                
                //Ler e Imprimir a linha atual do arquivo
                String text = reader.nextLine();
                System.out.println(text);
            }
        
        //Se der algum erro dentro do Try, ele será descrito aqui sem atrapalhar o código inteiro
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}