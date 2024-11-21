import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) throws Exception {

        try(Scanner input = new Scanner(System.in)) {
            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                int annualIncome = Integer.parseInt(input.nextLine());
                double rate = 0;
                if(annualIncome >= 0 && annualIncome< 11001) {
                    rate = 0.1;
                } else if(annualIncome < 44726) {
                    rate = 0.12;
                } else if(annualIncome < 95376) {
                    rate = 0.22;
                } else if(annualIncome < 182101) {
                    rate = 0.24;
                } else if(annualIncome < 231251) {
                    rate = 0.32;
                } else if(annualIncome < 578126) {
                    rate = 0.35;
                } else {
                    rate = 0.37;
                }
                System.out.println(Math.round(annualIncome * rate));
            }
        }
    }
}
