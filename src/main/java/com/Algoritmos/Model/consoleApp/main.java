package com.Algoritmos.Model.consoleApp;

import com.Algoritmos.Model.Algorithm;

public class main {

    public static void fillTableToZero(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] table = new int[4][4];
        fillTableToZero(table);

        Algorithm.backtrack(table, 0 , 4);
    }
}
