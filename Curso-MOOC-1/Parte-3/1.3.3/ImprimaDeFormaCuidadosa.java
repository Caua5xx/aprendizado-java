public class ImprimaDeFormaCuidadosa {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printCuidadosamente(array);
    }

    public static void printCuidadosamente(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);

            if (i != lista.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}
