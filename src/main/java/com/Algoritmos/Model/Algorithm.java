package com.Algoritmos.Model;

public class Algorithm {

    public static void backtracking(int table[][], int queens) {
        backtrack(table, 0, queens);
    }

    public static void backtrack(int table[][], int row, int queens) {

        if (row == queens) {
            printTable(table);
            return;
        }

        // Exploramos todas las columnas de la fila actual
        for (int col = 0; col < table.length; col++) {
            if (safeStatus(table, row, col)) {
                table[row][col] = 1; // Colocar una reina
                backtrack(table, row + 1, queens); // Intentar con la siguiente fila
                table[row][col] = 0; // Retroceder (backtracking)
            }
        }
    }

    public static boolean safeStatus(int[][] table, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (table[i][col] == 1) {
                return false;
            }
        }

        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
            if (table[row - i][col - i] == 1) {
                return false;
            }
        }

        for (int i = 1; row - i >= 0 && col + i < table.length; i++) {
            if (table[row - i][col + i] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
