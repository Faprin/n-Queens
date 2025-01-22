package com.Algoritmos;

public class Algoritmos {

    public static void backtrack(Integer[][] tablero, int row, int column, int queens) {
        // existe la solucion
        if (row == queens) {
            printTable(tablero);
        } else {

        // si me dan un tablero vacío
        if(tablero == null) {
            System.out.println("No se puede operar con un tablero vacío");
        }

        // compruebo si el estado de colocar una reina es seguro o no
        if (estadoSeguro(tablero, row, column)) {
            // si es un estado seguro, coloco la reina en el tablero y se lo paso al
            // algoritmo
            tablero[row][column] = 1;
            backtrack(tablero, row + 1, column, queens);
            tablero[row][column] = 0;
        } else {
            // si no es un estado seguro, intento tirar por otro lado, es decir, me desplazo hacia la derecha
            backtrack(tablero, row, column + 1, queens);
        }
        }

    }

    /**
     * Metodo que valorará si es seguro insertar una reina en una posición concreta
     * de la matriz
     *
     * @param tablero > Tablero actual
     * @param row     > Fila donde se quiere insertar la reina
     * @param column  > Columna donde se quiere insertar la reina
     * @return > True en caso de que se pueda insertar. False en caso contrario
     */
    public static boolean estadoSeguro(Integer[][] tablero, int row, int column) {
        // se va a usar para validar si puedo meter la reina nueva, en este caso
        // lo que voy a hacer es comprobar con las reinas superiores, si es que hay
        // por lo tanto podemos reducir el bucle for

        for (int i = 0; i < tablero.length; i++) {
            if (tablero[row][i] == 1) { // fija las filas y comprueba por columnas
                return false;
            }

            if (tablero[i][column] == 1) { // fija la columna y comprueba por filas
                return false;
            }

            if (row - i >= 0 && column - i >= 0 && tablero[row - i][column - i] == 1) {
                return false;
            }

            if (row - i >= 0 && column + i < tablero.length && tablero[row - i][column + 1] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void printTable(Integer[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Integer tablero[][] = new Integer[4][4];
        // rellenamos el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }

        // solucion para un tablero  4 * 4 con 4 reinas
        backtrack(tablero, 0, 0, 4);
        printTable(tablero);
    }
}
