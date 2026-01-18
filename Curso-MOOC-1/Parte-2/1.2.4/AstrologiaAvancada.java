public class AstrologiaAvancada {

    public static void main(String[] args) {
        arvoreDeNatal(16);
    }

    public static void printEspaco(int num) {
        String espaco = " ";
        int repeticao = num;
        
        while (repeticao > 0) {
            System.out.print(espaco);
            repeticao--;
        }
    }

    public static void printEstrelas(int num) {
        String estrela = "*";
        
        for (int repeticao = num; repeticao > 0; repeticao--) {
            System.out.print(estrela);
            if (estrela == "*") {
                estrela += "*";
            }
        }
    }

    public static void printTriangulo(int tamanho) {
        for (int linhaAtual = 1; linhaAtual <= tamanho; linhaAtual++) {
            printEspaco(tamanho - linhaAtual);
            printEstrelas(linhaAtual);
            System.out.println("");
        }
    }

    public static void arvoreDeNatal(int altura) {
        int base = altura;

        for (int linhaAtual = 1; linhaAtual <= altura; linhaAtual++) {
            printEspaco(altura - linhaAtual);
            printEstrelas(linhaAtual);
            System.out.println("");
        }

        printEspaco(altura - 2);
        printEstrelas(2);
        System.out.println("");
        printEspaco(altura - 2);
        printEstrelas(2);
        System.out.println("");
    }
}
