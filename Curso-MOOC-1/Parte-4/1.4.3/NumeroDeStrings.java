import java.util.Scanner;

public class NumeroDeStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int strings = 0;

        System.out.println("Digite Strings 'end' faz parar");

        while (true) {
            String string = reader.nextLine().strip().toLowerCase();
            
            if (string.equals("end")) {
                break;
            }

            strings++;
        }

        System.out.println(strings);
    }
}