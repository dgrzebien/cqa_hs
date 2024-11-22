import java.util.Scanner;

public class CodeBreaker {
    public static void main(String[] args) throws Exception { 

        try(Scanner input = new Scanner(System.in)) {

            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                int[] frequency = new int[26];
                int totalLetters = 0;
                int numLines = Integer.parseInt(input.nextLine());
                for(int lineNumber = 0; lineNumber < numLines; lineNumber++) {
                    String inputString = input.nextLine().toUpperCase();
                    for(int c = 0; c < inputString.length(); c++) {
                        if(inputString.charAt(c) >= 'A' && inputString.charAt(c) <= 'Z') {
                            frequency[inputString.charAt(c) - 65] = frequency[inputString.charAt(c) - 65]  + 1;
                            totalLetters++;
                        }
                    }
                }

                for(int i = 0; i < frequency.length; i++) {
                    System.out.print((char) (i + 65) + ": ");
                    double relativeFreq = ((double) frequency[i] / (double) totalLetters) * 100.0;
                    relativeFreq = Math.round(relativeFreq * 100.0) / 100.0;
                    System.out.println(String.format("%.2f", relativeFreq) + "%");
                }

            }
            input.close();
        }

    }

}
