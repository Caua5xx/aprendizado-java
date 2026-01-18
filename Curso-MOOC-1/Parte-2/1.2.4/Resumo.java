public class Resumo {

    public static int soma(int num1, int num2, int num3, int num4) {
        int soma = num1 + num2 + num3 + num4;
        return soma;
    }

    public static void main(String[] args) {
        int resultadoSoma = soma(4, 3, 6, 1);
        System.out.println("Soma: " + resultadoSoma);
    }
}
