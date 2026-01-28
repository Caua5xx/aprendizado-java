import java.util.ArrayList;
import java.util.Scanner;

public class AnalisadorDeLogsDeTelemetriaLegada {
    
    static final String[] SENSORES_VALIDOS = {"RADAR", "SONAR", "TERMO"};

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Double> valoresValidos = new ArrayList<>();
        ArrayList<String> sensoresComStatusErro = new ArrayList<>(); 
        int linha = 0;
        int leiturasValidas = 0;

        System.out.println("=== Analisador De Logs De Telemetria Legada ===");

        while (true) {
            String dadosBrutos = leitor.nextLine().strip().toUpperCase();

            if (dadosBrutos.equals("FIM")){
                leitor.close();
                System.out.println("\n=== RELATÓRIO DE TELEMETRIA ===");
                System.out.println("Total de leituras válidas: " + leiturasValidas);
                calcularMedia(valoresValidos);
                imprimirSensorComStatusErro(sensoresComStatusErro);
                break;
            }

            linha++;

            if (verificarDadoCorrompido(dadosBrutos)) {
                System.out.println("Aviso: Log corrompido na linha " + linha + ". Ignorado.");
                continue;

            } else {
                String[] dadosSeparados = dadosBrutos.split(",");
                String sensor = verificarSensor(dadosSeparados);
                if (!(sensor.equals("OK"))) {
                    System.out.println("Aviso: Sensor desconhecido '" + sensor + "'. Ignorado.");

                } else {
                    leiturasValidas++;
                    valoresValidos.add(adicionarValorNaLista(dadosSeparados));
                    String statusErro = verificarStatusErro(dadosSeparados);
                    if (statusErro.equals("OK")) {
                        continue;
                    } else {
                        sensoresComStatusErro.add(statusErro);
                    }
                }
            }
        }
    }

    public static boolean verificarDadoCorrompido(String dadosBrutos) {
        int quantidadeDeVirgulas = 0;

        for (int i = 0; i <= dadosBrutos.length() - 1; i++) {
            char letraAtual = dadosBrutos.charAt(i);
            if(letraAtual == ',') {
                quantidadeDeVirgulas++;
            }
        }

        if (quantidadeDeVirgulas != 2) {
            return true;
        } else {
            return false;
        }
    }

    public static String verificarSensor(String[] dadosSeparados) {
        String primeiroDado = dadosSeparados[0].toUpperCase();

        for (int i = 0; i < SENSORES_VALIDOS.length; i++) {
            if (primeiroDado.contains(SENSORES_VALIDOS[i])) {
                return "OK";
            }
        }

        return dadosSeparados[0];
    }

    public static double adicionarValorNaLista(String[] dadosSeparados) {
        double valor = Double.valueOf(dadosSeparados[1]);
        return valor;
    }

    public static void calcularMedia(ArrayList<Double> lista) {
        double soma = 0;
        double quantidade = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
            quantidade++;
        }

        System.out.println("Média dos valores: " + soma / quantidade);
    }

    public static String verificarStatusErro(String[] dadosSeparados) {
        String statusErro = dadosSeparados[2];
        
        if (statusErro.toUpperCase().equals("ERRO")) {
            return dadosSeparados[0].toUpperCase();
        } else {
            return "OK";
        }
    }

    public static void imprimirSensorComStatusErro(ArrayList<String> lista) {
        System.out.println("Sensores em ERRO: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.print("- " + lista.get(i) + "\n");
        }
    }
}
