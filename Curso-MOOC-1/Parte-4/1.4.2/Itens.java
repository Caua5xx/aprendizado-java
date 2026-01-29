import java.util.ArrayList;
import java.util.Scanner;

public class Itens {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Itens> itens = new ArrayList<>();

        System.out.println("Digite o nome do item para adicionar(deixar em branco faz parar).");
        while (true) {
            System.out.print("Nome: ");
            String nome = leitor.nextLine().strip();
            
            if (nome.isEmpty()) {
                break;
            }
            
            itens.add(new Itens(nome));
        }

        System.out.println();
        for (Itens item: itens) {
            System.out.println(item);
        }
    }

    //Classe Itens
    private String nome;

    public Itens(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome + " (criado em: )";
    }
}

//Implemente o horário que o item foi criado.