package com.Algoritmos.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileProcessor {

    public static void createSolutionFile(List<int[][]> solutions, int row, int col, int queens) {
        String fileName = "solutions/sol" + row + col + queens + ".txt";
        File file = new File(fileName);

        try {
            FileWriter fw = new FileWriter(file);

            // cabecera
            fw.write("Table settings: " + row + " rows, " + col + " cols, " + queens + " queens \n");
            fw.write("Solutions: " + solutions.size() + "\n");
            fw.write(System.lineSeparator());

            // cuerpo
            for (int[][] solution : solutions) {
                // para cada solucion pintamos el tablero
                for (int i = 0; i < solution.length; i++) {
                    for (int j = 0; j < solution[i].length; j++) {
                        fw.write(solution[i][j] + " ");
                    }
                    fw.write("\n");
                }
                fw.write("\n");
            }

            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
