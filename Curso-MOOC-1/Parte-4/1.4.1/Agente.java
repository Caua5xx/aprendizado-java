public class Agente {
    public static void main(String[] args) {
        Agente bond = new Agente("James", "Bond");

        System.out.println(bond);

        Agente ionic = new Agente("Ionic", "Bond");
        System.out.println(ionic);
    }

    //Classe Agente
    private String nome;
    private String sobrenome;

    public Agente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String toString() {
        return "Meu nome é " + sobrenome + ", " + nome + " " + sobrenome + ".";
    }
}
