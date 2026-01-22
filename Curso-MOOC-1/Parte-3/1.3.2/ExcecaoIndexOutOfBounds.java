import java.util.ArrayList;

public class ExcecaoIndexOutOfBounds {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.get(0);
    }
}
//objetivo é dar esse erro especifico.