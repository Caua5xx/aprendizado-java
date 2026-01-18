public class Media {

    public static int soma(int num1, int num2, int num3, int num4 ) {
        int soma = num1 + num2 + num3 + num4;
        return soma;
    }

    public static double media(int num1, int num2, int num3, int num4) {
        double media = soma(4, 3, 6, 1) / 4.0;
        return media;
    }

    public static void main(String[] args) {
        double resultado = media(4, 3, 6, 1);
        System.out.println("Média: " + resultado);
    }
}
