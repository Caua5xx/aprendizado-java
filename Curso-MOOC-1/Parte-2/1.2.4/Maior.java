public class Maior {

    public static int maior(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else if (num3 >= num1 && num3 >= num2) {
            return num3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int resposta = maior(2, 7, 3);
        System.out.println("Maior: " + resposta);
    }
}
