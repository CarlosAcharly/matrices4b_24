public class Matrices {
    // para aprendizaje de las caracteristicas de Arreglos Bidimencionales
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int numero = 0;
        // introducir valores a la matriz cuadrada
        System.out.println();
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = numero;
                numero++;
                System.out.print(matriz1[i][j] + "   ");
            }
            System.out.println();

        }
        // imprimir la matriz
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        int[][] matriz2 = new int[3][5];
        numero = 10;
        System.out.println();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = numero;
                numero++;
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }

}