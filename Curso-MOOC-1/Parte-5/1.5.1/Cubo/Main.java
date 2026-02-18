package Cubo;

public class Main {
    public static void main(String[] args) {
        Cubo cubo = new Cubo(4);
        System.out.println(cubo.volume());
        System.out.println(cubo);

        System.out.println();

        Cubo outroCubo = new Cubo(2);
        System.out.println(outroCubo.volume());
        System.out.println(cubo);
    }
}