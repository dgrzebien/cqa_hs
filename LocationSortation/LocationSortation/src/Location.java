import java.util.Arrays;
import java.util.Scanner;

public class Location {
    public static void main(String[] args) throws Exception {
        String[] countries;

        try(Scanner input = new Scanner(System.in)) {

            int numCases = Integer.parseInt(input.nextLine());
            countries = new String[numCases];
            for(int testcase = 0; testcase < numCases; testcase++) {
                countries[testcase] = input.nextLine();
            }

            Arrays.sort(countries);
            
            for(String c: countries) {
                System.out.println(c);
            }
            
            input.close();

        }

    }

}
