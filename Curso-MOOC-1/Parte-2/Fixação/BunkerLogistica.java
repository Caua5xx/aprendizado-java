import java.util.Scanner;

public class BunkerLogistica {
    
    static final int CAPACIDADE_MAXIMA  = 2000;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int totalMunicao = 0;
        int totalRacao = 0;
        String municao = "Munição";
        String racao = "Ração";


        while (true) {
            exibirMenu();
            System.out.print("Escolha: ");
            int opcao = Integer.valueOf(leitor.nextLine().strip());

            if (opcao == 1) {
                int adicionarMunicao = lerQuantidadeValida(leitor, municao, totalMunicao);
                totalMunicao += adicionarMunicao;
                
                if (adicionarMunicao > 0) {
                    System.out.println("Munição registrada.\n");
                }

            } else if (opcao == 2) {
                int adicionarRacao = lerQuantidadeValida(leitor, racao, totalRacao);
                totalRacao += adicionarRacao;

                if (adicionarRacao > 0) {
                    System.out.println("Ração registrada.\n");
                }

            } else if (opcao == 3) {
                System.out.println("\n=== Relatório ==");
                imprimirStatus(totalMunicao, municao);
                imprimirStatus(totalRacao, racao);

            } else if (opcao == 4) {
                if (confirmarSaida(leitor)) {
                    leitor.close();
                    return;
                }

            } else {
                System.out.println("\nERRO: OPÇÃO INVÁLIDA. ");
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("=== BUNKER ALPHA LOGISTICS ===");
        System.out.println("1. Adicionar Munição");
        System.out.println("2. Adicionar Ração");
        System.out.println("3. Relatório");
        System.out.println("4. Sair");
    }

    public static int lerQuantidadeValida(Scanner leitor, String item, int total) {
        while (true) {
            System.out.print("\nInforme qtd de " + item + ": ");
            int adicionarItem = Integer.valueOf(leitor.nextLine());

            if (adicionarItem < 0) {
                System.out.print("ERRO: Valor inválido. ");
                    continue;
            }

            int capacidadeLivre = CAPACIDADE_MAXIMA - total;

            if (capacidadeLivre < adicionarItem) {
                System.out.println("ERRO: Quantidade de " + item + " Excede o Limite do Bunker!");
                System.out.println("Capacidade livre de " + item + ": " + capacidadeLivre);
            } else {
                return adicionarItem;
            }
        }
    }

    public static void imprimirStatus(int total, String item) {
        if (total < 100) {
            System.out.println(item + " CRÍTICA\n" + item + ": " + total + "\n");
            return;
        } else if (total >= 100 && total < 500) {
            System.out.println(item + " ESTÁVEL\n" + item + ": " + total + "\n");
            return;
        } else {
            System.out.println(item + " EXCEDENTE\n" + item + ": " + total + "\n");
        }
    }

    public static boolean confirmarSaida(Scanner leitor) {
        while (true) {
            System.out.println("Deseja sair? (sim/nao)");
            String confirmacaoSaida = leitor.nextLine().strip().toLowerCase();

            if (confirmacaoSaida.equals("sim")) {
                return true;
            } else if (confirmacaoSaida.equals("nao") || confirmacaoSaida.equals("não")) {
                return false;
            } else {
                System.out.print("ERRO: RESPOSTA INVÁLIDA. ");
                continue;
            }
        }
    }
}
