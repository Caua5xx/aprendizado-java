import java.util.ArrayList;

public class RemoverOUltimo {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");

        System.out.println(lista);

        removerUltimoDaLista(lista);
        removerUltimoDaLista(lista);

        System.out.println(lista);
    }

    public static void removerUltimoDaLista(ArrayList<String> lista) {
        lista.remove(lista.size() - 1);
    }
}
