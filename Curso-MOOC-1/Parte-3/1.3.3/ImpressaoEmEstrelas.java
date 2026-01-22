public class ImpressaoEmEstrelas {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayEmEstrelas(array);
    }

    public static void printArrayEmEstrelas(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int quantidadeEstrelas = lista[i];

            while (quantidadeEstrelas > 0) {
                System.out.print("*");
                quantidadeEstrelas--;
            }

            System.out.println();
        }
    }
}
