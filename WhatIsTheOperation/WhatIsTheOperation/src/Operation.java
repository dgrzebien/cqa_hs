import java.util.Scanner;

public class Operation {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)) {
            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                String[] tokens = input.nextLine().split(" ");
                int first = Integer.parseInt(tokens[0]);
                int second = Integer.parseInt(tokens[1]);
                int third = Integer.parseInt(tokens[2]);

                if(first - second == third) {
                    System.out.println("Subtraction");
                } else if(first + second == third) {
                    System.out.println("Addition");
                } else if(first / second == third) {
                    System.out.println("Division");
                } else if(first * second == third) {
                    System.out.println("Multiplication");
                } else if(first % second == third) {
                    System.out.println("Modulo");
                }
            }
        }
    }
}
