public class DivisivelPorTres {
    public static void main(String[] args) {
        divisibleByThreeInRage(2, 10);
    }

    public static void divisibleByThreeInRage(int inicio, int fim) {
        while (inicio <= fim) {
            if (inicio % 3 == 0) {
                System.out.println(inicio);
            }

            inicio++;
        }
    }
}
