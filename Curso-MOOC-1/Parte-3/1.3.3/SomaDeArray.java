public class SomaDeArray {
    public static void main(String[] args) {

        int[] lista = {5, 1, 3, 4, 2};
        System.out.println(somaDosNumerosNaArray(lista));
    }

    public static int somaDosNumerosNaArray(int[] lista) {
        int soma = 0;

        for (int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }

        return soma;
    }
}
