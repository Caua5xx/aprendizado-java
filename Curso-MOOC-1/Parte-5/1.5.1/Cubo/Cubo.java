package Cubo;

public class Cubo {

    private int tamanhoAresta;
    private int volumeCubo;

    public Cubo(int tamanhoAresta) {
        this.tamanhoAresta = tamanhoAresta;
    }

    public int volume() {
        volumeCubo = this.tamanhoAresta * this.tamanhoAresta * this.tamanhoAresta;
        return volumeCubo;
    }

    @Override
    public String toString() {
        return "O comprimento da aresta é " + this.tamanhoAresta + " e o volume do cubo é " + this.volumeCubo;
    }
}