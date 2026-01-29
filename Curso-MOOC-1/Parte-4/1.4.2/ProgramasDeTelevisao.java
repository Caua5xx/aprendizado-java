import java.util.Scanner;
import java.util.ArrayList;

public class ProgramasDeTelevisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<ProgramasDeTelevisao> programas = new ArrayList<>();

        while(true) {
            System.out.print("Nome: ");
            String nome = leitor.nextLine().strip();

            if (nome.isEmpty()) {
                break;
            }

            System.out.print("Duração: ");
            int duracao = Integer.valueOf(leitor.nextLine().strip());
            programas.add(new ProgramasDeTelevisao(nome, duracao));
        }

        System.out.print("\nQual a duração máxima do programa? ");
        int duracaoMax = Integer.valueOf(leitor.nextLine().strip());

        for (ProgramasDeTelevisao programa: programas) {
            if (programa.getDuracao() <= duracaoMax) {
                System.out.println(programa);
            }
        }
    }

    private String nome;
    private int duracao;

    public ProgramasDeTelevisao(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return this.duracao;
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.duracao + " minutos";
    }
}
