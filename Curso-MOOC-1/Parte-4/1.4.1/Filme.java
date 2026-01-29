import java.util.Scanner;

public class Filme {
    public static void main(String[] args) {
        Filme chipnunks = new Filme("Alvin E Os Esquilos", 6);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos anos você tem?" );
        int idade = Integer.valueOf(leitor.nextLine());

        if (idade >= chipnunks.idadeRecomendada()) {
            System.out.println("Você pode assistir ao filme " + chipnunks.filme());
        } else {
            System.out.println("Você não pode assistir ao filme " + chipnunks.filme());
        }
    }

    //Classe Filme
    private String nome;
    private int idadeRecomendada;

    public Filme(String nomeFilme, int idadeRecomendadaFilme) {
        this.nome = nomeFilme;
        this.idadeRecomendada = idadeRecomendadaFilme;
    }

    public String filme() {
        return nome;
    }

    public int idadeRecomendada() {
        return idadeRecomendada;
    }
}
