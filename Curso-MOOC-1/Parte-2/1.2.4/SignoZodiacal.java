public class SignoZodiacal {
    
    public static void main(String[] args) {
        //printTriangulo(4);
        //printRetangulo(4, 2);
        //printQuadrado(4);
        //printEstrelas(5, 3, 9);
    }

    public static void printEstrelas(int num, int num2, int num3) {
        int i = num;
        int i2 = num2;
        int i3 = num3;

        while (num > 0) {
            while (i > 0) {
                System.out.println("*");
                i--;
                if (i == 0) {
                    System.out.println("");
                }
            }
            break;
        }

        while (num2 > 0) {
            while (i2 > 0) {
                System.out.print("*");
                i2--;
                if (i2 == 0) {
                    System.out.println("");
                }
            }
            break;
        }

        while (num3 > 0) {
            while (i3 > 0) {
                System.out.print("*");
                i3--;
                if (i3 == 0) {
                    System.out.println("");
                }
            }
            break;
        }
    }

    public static void printQuadrado(int num) {
        int i = num;

        while (num > 0) {
            printEstrelas(i, 0, 0);    
            num--;
        }
    }

    public static void printRetangulo(int largura, int altura) {
        int i = 0;

        if (altura > largura) {
            i += altura;
        } else if (largura > altura) {
            i += altura;
        } else {
            i += largura;
        }

        if (largura > altura) {
            while (i > 0) {
                printEstrelas(largura, 0, 0);
                i--;
            }
        } 

        if (altura > largura) {
            while (i > 0) {
                printEstrelas(largura, 0, 0);
                i--;
            }
        }

        if (altura == largura) {
            while (i > 0) {
                printEstrelas(largura, 0, 0);
                i--; 
            }
        } 
    }

    public static void printTriangulo(int tamanho) {
        for (String i = "*"; tamanho > 0; i += "*") {
            System.out.println(i);
            tamanho--;
        }
    }
}
