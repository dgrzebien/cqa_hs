import java.util.Scanner;

public class FlipFlop {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)) {
            int numCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < numCases; testcase++) {
                String[] line = input.nextLine().split(" ");
                int rows = Integer.parseInt(line[0]);
                int cols = Integer.parseInt(line[1]);
                String[][] table = new String[rows][cols];

                // build input table
                for(int i = 0; i < rows; i++) {
                    line = input.nextLine().split(",");
                    for(int j = 0; j < cols; j++) {
                        if(!line[j].isEmpty()) {
                            table[i][j] = line[j];
                        }
                    }
                }

                // transpose table
                String[][] result = new String[cols][rows];
                for(int i = 0; i < rows; i++) {
                    for(int j = 0; j < cols; j++) {
                        result[j][i] = table[i][j];
                    }
                }

                // print table
                for(int i = 0; i < cols; i++) {
                    for(int j = 0; j < rows; j++) {
                        if(result[i][j] != null) {
                            System.out.print(result[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
