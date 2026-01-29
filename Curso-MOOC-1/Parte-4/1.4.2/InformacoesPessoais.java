import java.util.ArrayList;
import java.util.Scanner;

public class InformacoesPessoais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<InformacoesPessoais> informacoes = new ArrayList<>();

        while (true) {
            System.out.print("Nome: ");
            String nome = leitor.nextLine().strip();

            if (nome.isEmpty()) {
                break;
            }

            System.out.print("Sobrenome: ");
            String sobrenome = leitor.nextLine();
            System.out.print("Número de identificação: ");
            int identificacao = Integer.valueOf(leitor.nextLine());

            informacoes.add(new InformacoesPessoais(nome, sobrenome, identificacao));
        }

        System.out.println();
        for (InformacoesPessoais dados: informacoes) {
            System.out.println(dados);
        }
    }

    private String nome;
    private String sobrenome;
    private int identificacao;

    public InformacoesPessoais(String nome, String sobrenome, int identificacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }
}
