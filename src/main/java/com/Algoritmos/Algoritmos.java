package com.Algoritmos;


public class Algoritmos {

    /**
     * Algoritmo basado en backtracking para resolver el problema de las n-reinas
     *
     * @param tablero
     */
    public void backtracking(Integer[][] tablero, int queens, int row, int column) {
        if (queens == row) {
            System.out.println("Tablero terminado");
            printTable(tablero);
        }

        for (int i = 0; column < queens; i++) {
            if (estadoSeguro(tablero, row, column)) {
                tablero[row][column] = 1;
                backtracking(tablero, queens, row + 1, column); // vemos en la siguiente fila
                tablero[row][column] = 0;
            }
        }
    }

    /**
     * Metodo que valorará si es seguro insertar una reina en una posición concreta de la matriz
     *
     * @param tablero > Tablero actual
     * @param row     > Fila donde se quiere insertar la reina
     * @param column  > Columna donde se quiere insertar la reina
     * @return > True en caso de que se pueda insertar. False en caso contrario
     */
    public boolean estadoSeguro(Integer[][] tablero, int row, int column) {
        // se va a usar para validar si puedo meter la reina nueva, en este caso
        // lo que voy a hacer es comprobar con las reinas superiores, si es que hay
        // por lo tanto podemos reducir el bucle for

        for (int i = 0; i < row; i++) {
            if (tablero[row][i] == 1) { // fija las filas y comprueba por columnas
                return false;
            }

            if (tablero[i][column] == 1) { // fija la columna y comprueba por filas
                return false;
            }

            if (column - i >= 0 && tablero[row - i][column - i] == 1) { // diagonal principal
                return false;
            }

            if (tablero[row - i][column + 1] == 1) {
                return false;
            }
        }
        return true;
    }

    public void printTable(Integer[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Integer tablero[][] = new Integer[4][4];
        Algoritmos algoritmos = new Algoritmos();
        algoritmos.backtracking(tablero, 4, 0, 0);
    }
}
