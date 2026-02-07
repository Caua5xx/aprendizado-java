import java.util.Scanner;

public class Cubos {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número para transformar em cubo: ");

        while (true) {
            String input = reader.nextLine();
            
            if (input.equals("end")) {
                break;
            }

            int num = Integer.valueOf(input);
            System.out.println("Cubo: " + (num * num * num));
        }
    }
}