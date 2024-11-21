import java.util.Scanner;

public class SumItUp {
    public static void main(String[] args) throws Exception {
        
        try(Scanner input = new Scanner(System.in)) {

            int numCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < numCases; testcase++) {
                
                String[] tokens = input.nextLine().split(" ");
                int first = Integer.parseInt(tokens[0]);
                int second = Integer.parseInt(tokens[1]);
                if(first == second) {
                    System.out.println(2 * (first + second));
                } else {
                    System.out.println(first + second);
                }

            }

            input.close();
        }

    }

}
