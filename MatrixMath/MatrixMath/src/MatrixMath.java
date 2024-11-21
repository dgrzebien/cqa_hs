import java.io.File;
import java.util.Scanner;

public class MatrixMath {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)) {
        //try(Scanner input = new Scanner(new File("./src/2.in"))) {
            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                String[] dimensions = input.nextLine().split(" ");
                int rowsA = Integer.parseInt(dimensions[0]);
                int colsA = Integer.parseInt(dimensions[1]);
                int rowsB = Integer.parseInt(dimensions[2]);
                int colsB = Integer.parseInt(dimensions[3]);
                int[][] matrixA = new int[rowsA][colsA];
                int[][] matrixB = new int[rowsB][colsB];
                int[][] resultMatrix = new int[rowsA][colsB];

                // create Matrix A
                for(int rows = 0; rows < rowsA; rows++) {
                    String[] line = input.nextLine().split(" ");
                    for(int cols = 0; cols < colsA; cols++) {
                        matrixA[rows][cols] = Integer.parseInt(line[cols]);
                    }
                }

                // create Matrix B
                for(int rows = 0; rows < rowsB; rows++) {
                    String[] line = input.nextLine().split(" ");
                    for(int cols = 0; cols < colsB; cols++) {
                        matrixB[rows][cols] = Integer.parseInt(line[cols]);
                    }
                }
                
                if(colsA == rowsB) {
                    for(int x = 0; x < rowsA; x++) {
                        for(int y = 0; y < colsA; y++) {
                            for(int i = 0; i < colsB; i++) {
                                resultMatrix[x][i] = resultMatrix[x][i] + matrixA[x][y] * matrixB[y][i];
                            }
                        }
                    }

                    // print resultMatrix
                    for(int i = 0; i < rowsA; i++) {
                        for(int j = 0; j < colsB; j++) {
                            if(j == colsB - 1) {
                                System.out.print(resultMatrix[i][j]);
                            } else {
                                System.out.print(resultMatrix[i][j] + " ");
                            }
                            if(j == colsB - 1){
                                System.out.println();
                            }
                        }
                        //System.out.println();
                    }
                    
                } else {
                    System.out.println("undefined");
                }

            }
        }
    }
}
