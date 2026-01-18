public class DeUmParaParametro {
    public static void main(String[] args) {
        printAteNumero(5);
    }

    public static void printAteNumero(int num) {
        int i = 1;

        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
