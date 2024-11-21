import java.util.Scanner;

public class ProperAddress {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)) {
            int numCases = Integer.parseInt(input.nextLine());
            boolean invalid = false;

            for(int testcase = 0; testcase < numCases; testcase++) {
                String[] address = input.nextLine().split("\\.");
                if(address.length != 4) {
                    invalid = true;
                } else {
                    for(String x: address) {
                        if(Integer.parseInt(x) < 0 || Integer.parseInt(x) > 255) {
                            invalid = true;
                        }
                        
                    }
                }
                if(invalid) {
                    System.out.println("INVALID");
                    invalid = false;
                } else {
                    System.out.println("VALID");
                }
            }
        }
    }
}
