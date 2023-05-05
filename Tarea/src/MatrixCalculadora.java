
public class MatrixCalculadora {

    public static int[][] realizarOperacion(int[][] matrix1, int[][] matrix2, char operacion) {

        int filas = matrix1.length;
        int columnas = matrix1[0].length;
        int[][] resultado = new int[filas][columnas];

        if (matrix2.length != filas || matrix2[0].length != columnas) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones.");
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                switch (operacion) {
                    case '+':
                        resultado[i][j] = matrix1[i][j] + matrix2[i][j];
                        break;
                    case '-':
                        resultado[i][j] = matrix1[i][j] - matrix2[i][j];
                        break;
                    case '*':
                        resultado[i][j] = matrix1[i][j] * matrix2[i][j];
                        break;
                    default:
                        throw new IllegalArgumentException("Operacion invalidad.");
                }
            }
        }

        return resultado;
    }
}

