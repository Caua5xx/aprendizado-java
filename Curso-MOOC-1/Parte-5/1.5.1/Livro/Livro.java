package livro;

public class Livro {

    private String autor;
    private String nome;
    private int paginas;

    public Livro(String autor, String nome, int paginas) {
        this.autor = autor;
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPaginas() {
        return this.paginas;
    }

    @Override
    public String toString() {
        return this.autor + ", " + this.nome; + ", " + this.paginas + " páginas";
    }
}