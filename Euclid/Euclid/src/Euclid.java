import java.util.Scanner;

public class Euclid {

    private static void gcd(int m, int s) {
        if(m == 1 && s == 1) {
            System.out.println("COPRIME");
        } else {
            int result = m - s;
            while(result != 0) {
                System.out.println(m + "-" + s + "=" +  result);
                if(s > result) {
                    m = s;
                    s = result;
                } else {
                    m = result;
                }
                result = m - s;
            }
            System.out.println(m + "-" + s + "=" +  result);
            if(m == 1 && s == 1) {
                System.out.println("COPRIME");
            } else {
                System.out.println("NOT COPRIME");
            }
        }
    }

    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {
            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                String[] line = input.nextLine().split(",");
                int minuend = 0;
                int subtrahend = 0;
                if(Integer.parseInt(line[0]) > Integer.parseInt(line[1])) {
                    minuend = Integer.parseInt(line[0]);
                    subtrahend = Integer.parseInt(line[1]);
                } else {
                    minuend = Integer.parseInt(line[1]);
                    subtrahend = Integer.parseInt(line[0]);
                }
                gcd(minuend, subtrahend);
            }
        }
    }
}
