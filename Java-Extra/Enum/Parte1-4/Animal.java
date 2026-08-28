public class Animal {

    private String nome;
    private AnimalTipo tipo;

    public Animal(String nome, AnimalTipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public AnimalTipo getTipo() {
        return tipo;
    }
}
