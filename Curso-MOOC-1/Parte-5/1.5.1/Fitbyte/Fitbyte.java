package Fitbyte;

public class Fitbyte {

    private int idade;
    private int frequenciaCardiacaRepouso;

    public Fitbyte(int idade, int frequenciaCardiacaRepouso) {
        this.idade = idade;
        this. frequenciaCardiacaRepouso = frequenciaCardiacaRepouso;
    }

    public double frequenciaCardiacaAlvo(double percentageOfMaximum) {
        double frequenciaCardiacaMax = 206.3 - (0.711 * idade);
        return (frequenciaCardiacaMax - this.frequenciaCardiacaRepouso) * (percentageOfMaximum) + this.frequenciaCardiacaRepouso;
    }
}