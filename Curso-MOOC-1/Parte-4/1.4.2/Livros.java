import java.util.Scanner;
import java.util.ArrayList;

public class Livros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Livros> livros = new ArrayList<>();

        while (true) {
            System.out.print("Título: ");
            String titulo = leitor.nextLine().strip();

            if (titulo.isEmpty()) {
                break;
            }

            System.out.print("Páginas: ");
            int paginas = Integer.valueOf(leitor.nextLine().strip());
            System.out.print("Ano de publicação: ");
            int ano = Integer.valueOf(leitor.nextLine().strip());
            livros.add(new Livros(titulo, paginas, ano));
        }

        System.out.println("\nQuais informações serão impressas? ('tudo' ou 'titulo')");
        String infoImprimir = leitor.nextLine().strip().toLowerCase();
        System.out.println();
        
        if (infoImprimir.equals("titulo") || infoImprimir.equals("título")) {
            for (Livros livro: livros) {
                System.out.println(livro.getTitulo());
            }
        }

        if (infoImprimir.equals("tudo")) {
            for (Livros livro: livros) {
                System.out.println(livro);
            }
        }
    }

    private String nome;
    private int paginas;
    private int ano;

    public Livros(String nome, int paginas, int ano) {
        this.nome = nome;
        this.paginas = paginas;
        this.ano = ano;
    }

    public String getTitulo() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.paginas + " páginas, " + this.ano;
    }
}
