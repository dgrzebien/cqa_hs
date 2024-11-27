import java.util.Scanner;

public class Mole {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)) {
            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                String[] tokens = input.nextLine().split(" ");
                boolean first = false;
                for(int i = 0; i  < tokens.length; i++) {
                    //if(first) {
                        //System.out.print(" ");
                        //first = true;
                    //} 
                    if(tokens[i].equals("M")) {
                        if(first) {
                            System.out.print(" ");
                        }
                        System.out.print(i+1);
                        first = true;
                    }
                }    
                System.out.println();
            }
        }
    }
}
