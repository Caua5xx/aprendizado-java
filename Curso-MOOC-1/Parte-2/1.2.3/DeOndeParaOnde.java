import java.util.Scanner;

public class DeOndeParaOnde {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Para onde? ");
        int paraOnde = Integer.valueOf(leitor.nextLine());
        System.out.println("De onde? ");
        int deOnde = Integer.valueOf(leitor.nextLine());

        while (deOnde <= paraOnde) {
            System.out.println(deOnde);
            deOnde++;
        }
    }
}
