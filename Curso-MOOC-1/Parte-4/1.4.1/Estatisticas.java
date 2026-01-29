import java.util.Scanner;

public class Estatisticas {
    public static void main(String[] args) {
        Estatisticas estatisticas = new Estatisticas();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite números (-1 faz parar): ");

        while (true) {
            int numero = Integer.valueOf(leitor.nextLine());
            
            if (numero != -1) {
                estatisticas.addNumber(numero);
            } else {
                break;
            }
        }

        System.out.println("Contagem: " + estatisticas.getCount());
        System.out.println("Soma: " + estatisticas.sum());
        System.out.println("Média: " + estatisticas.average());
        System.out.println("Soma dos números Pares: " + estatisticas.sumEven());
        System.out.println("Soma dos números ímpares: " + estatisticas.sumOdd());
    }

    //Classe Estatisticas
    private int numero;
    private int sum;
    private int sumEven;
    private int sumOdd;
    
    public Estatisticas() {
        this.numero = 0;
    }

    public void addNumber(int numeros) {
        this.numero++;
        this.sum += numeros;

        if (numeros % 2 == 0) {
            this.sumEven += numeros;
        } else {
            this.sumOdd += numeros;
        }
    }

    public int getCount() {
        return this.numero;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return 1.0 * sum() / getCount();
    }

    public int sumEven() {
        return this.sumEven;
    }

    public int sumOdd() {
        return this.sumOdd;
    }
}
