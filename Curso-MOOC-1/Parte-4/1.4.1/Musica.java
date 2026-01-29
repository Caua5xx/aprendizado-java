public class Musica {
    //Main
    public static void main(String[] args) {
        Musica garden = new Musica("In The Garden", 10910);
        System.out.println("A música " + garden.nome() + " tem duração de " + garden.duracao() + " segundos.");
    }
    
    //Classe Musica
    private String nome;
    private int duracao;

    public Musica(String nomeInicial, int duracaoInicial) {
        this.nome = nomeInicial;
        this.duracao = duracaoInicial;
    }

    public String nome() {
        return nome;
    }

    public int duracao() {
        return duracao;
    }
}
