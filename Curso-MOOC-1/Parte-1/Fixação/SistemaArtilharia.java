import java.util.Scanner;

/**
 * Sistema de artilharia responsável por calcular o alcance de projéteis.
 * A precisão dos algorítmos utilizados neste sistema é crítica,
 * pois erros de cálculos podem comprometer a segurança de vidas humanas.
 */
public class SistemaArtilharia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final int ENERGIA = 5000;
        final int DISTANCIA_MINIMA_ALVO = 100;

        System.out.println("");
        System.out.println("======================================");
        System.out.println(" SISTEMA DE ARTILHARIA ATIVA");
        System.out.println(" UNIDADE: MORTEIRO TÁTICO");
        System.out.println("======================================");
        System.out.println("");

        System.out.println("Informe a distância do alvo (m): ");
        double distanciaAlvo = Double.valueOf(leitor.nextLine());
        System.out.println("");
        if (distanciaAlvo < DISTANCIA_MINIMA_ALVO) {
            System.out.println("DISPARO ABORTADO! PERIGO DE FOGO AMIGO!");
            leitor.close();
            return;
        }
        

        System.out.println("Informe a velocidade atual do vento (m/s): ");
        double velocidadeVento = Double.valueOf(leitor.nextLine());
        System.out.println("");

        System.out.println("Informe o peso do projétil (kg): ");
        double projetilPeso = Double.valueOf(leitor.nextLine());
        System.out.println("");
        leitor.close();

        String statusVento = velocidadeVento > 10 ? "VENTO FORTE" : "VENTO NORMAL";

        System.out.println("Status do vento: " + statusVento);
        System.out.println("Calculando alcance do projétil...");
        System.out.println("");

        double projetilAlcance = (ENERGIA / projetilPeso) * (1 + (velocidadeVento * 0.1));
        double raioPerto = distanciaAlvo - 5;
        double raioLonge = distanciaAlvo + 5;

        if (projetilAlcance >= raioPerto && projetilAlcance <= raioLonge) {
            System.out.println("ALVO ATINGIDO!");
        } else if (projetilAlcance < raioPerto) {
            System.out.println("ALVO NÃO ATINGIDO! TIRO CURTO!");
        } else if (projetilAlcance > raioLonge) {
            System.out.println("ALVO NÃO ATINGIDO! TIRO LONGO!");
        } 
    }
}
