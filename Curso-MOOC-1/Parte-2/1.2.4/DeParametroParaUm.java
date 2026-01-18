public class DeParametroParaUm {
    public static void main(String[] args) {
        printDeNumeroAteUm(5);
    }

    public static void printDeNumeroAteUm(int num) {
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }
}
