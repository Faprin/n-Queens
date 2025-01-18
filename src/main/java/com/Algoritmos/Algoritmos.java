package com.Algoritmos;


public class Algoritmos {

    public void backtracking(int tablero[][]) {

    }

    /**
     * Metodo que valorará si es seguro insertar una reina en una posición concreta de la matriz
     * @param tablero -> Tablero actual
     * @param row -> Fila donde se quiere insertar la reina
     * @param column -> Columna donde se quiere insertar la reina
     * @return -> True en caso de que se pueda insertar. False en caso contrario
     */
    public boolean estadoSeguro(int tablero[][], int row, int column) {
        // tenemos que ver si donde se quiere poner la reina es seguo

        // primero de manera lineal -> tablero[fila][columna]
        for(int i = 0; i < tablero.length; i++) {
            if(tablero[row][i] == 1) { // si existe una reina en la columna donde se quiere isnertar
                return false;
            }

            if(tablero[i][column] == 1) { // si existe una reina en la fila  donde se quiere insertar
                return false;
            }

            if(Math.abs(i-row) == Math.abs(tablero[i][column] - column)) {
                return false;
            }
        }

        return true;
    }
}
