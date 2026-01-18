public class Menor {
    
    public static int menor(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }
        
        if (num1 > num2) {
            return num2;
        }

        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int resultadoMenor = menor(2, 7);
        
        if (resultadoMenor == 0) {
            System.out.println("Mesmo valor!");
        } else {
            System.out.println("Menor: " + resultadoMenor);
        }
    }
}
