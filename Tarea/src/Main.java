
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        int[][] matrix1 = {{6, 8}, {3, 8}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        System.out.println("Matrix1: " + Arrays.deepToString(matrix1));
        System.out.println("Matrix2: " + Arrays.deepToString(matrix2));
        System.out.println("");

        int[][] suma = MatrixCalculadora.realizarOperacion(matrix1,matrix2, '+');
        System.out.println("      Suma:     " + Arrays.deepToString(suma));

        int[][] resta = MatrixCalculadora.realizarOperacion(matrix1, matrix2, '-');
        System.out.println("     Resta:     " + Arrays.deepToString(resta));

        int[][] multiplicacion = MatrixCalculadora.realizarOperacion(matrix1, matrix2, '*');
        System.out.println("Multiplicación: " + Arrays.deepToString(multiplicacion));
    }
}