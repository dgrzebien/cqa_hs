import java.util.Scanner;

public class SafetyPerimeter {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)) {
            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                int points = Integer.parseInt(input.nextLine());
                String[] tokens = input.nextLine().split(" ");
                int x1 = Integer.parseInt(tokens[0]);
                int y1 = Integer.parseInt(tokens[1]);
                int safe = Integer.parseInt(tokens[2]);

                for(int pt = 0; pt < points; pt++) {
                    tokens = input.nextLine().split(" ");
                    int x2 = Integer.parseInt(tokens[0]);
                    int y2 = Integer.parseInt(tokens[1]);
                    double d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
                    String status = "";
                    if(d < safe) {
                        status = "DANGER";
                    } else {
                        status = "SAFE";
                    }
                    System.out.println("(" + x2 + "," + y2 + ") " + status);
                }
                
            }
        }
    }
}
