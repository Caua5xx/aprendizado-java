package Fitbyte;

public class Main {
    public static void main(String[] args) {
        Fitbyte assistente = new Fitbyte(30, 60);

        double porcentagem = 0.5;

        while (porcentagem < 1.0) {
            double alvo = assistente.frequenciaCardiacaAlvo(porcentagem);
            System.out.println("Alvo " + (porcentagem * 100) + "% do máximo: " + alvo);
            porcentagem += 0.1;
        }
    }
}