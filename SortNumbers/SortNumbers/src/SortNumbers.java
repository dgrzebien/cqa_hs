import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) throws Exception {

        try(Scanner input = new Scanner(System.in)) {

            int[] numlist = {};
            int numCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < numCases; testcase++) {
                
                String[] tokens = input.nextLine().split(",");
                numlist = new int[tokens.length];
                
                for(int i = 0; i < numlist.length; i++) {
                    numlist[i] = Integer.parseInt(tokens[i]);
                }
                
                Arrays.sort(numlist);

                for(int i = 0; i < numlist.length; i++) {
                    System.out.print(numlist[i]);
                    if(i < numlist.length - 1) {
                        System.out.print(",");
                    }
                }

                System.out.println();
            }

            input.close();
        }

    }

}
