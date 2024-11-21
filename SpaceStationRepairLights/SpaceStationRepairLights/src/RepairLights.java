import java.util.Scanner;

public class RepairLights {

    public static void main(String[] args) throws Exception {
        
        
        try(Scanner input = new Scanner(System.in)) {

            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                String[] status = input.nextLine().split(" ");
                int code = 0;
                String led1 = "";
                String led2 = "";

                if(status[0].equals("BROKEN")) {
                    code = code + 8;
                }
                if(status[1].equals("BROKEN")) {
                    code = code + 4;
                }
                if(status[2].equals("BROKEN")) {
                    code = code + 2;
                }
                if(status[3].equals("BROKEN")) {
                    code = code + 1;
                }

                int lcode = code / 4;
                switch(lcode) {
                    case 0: led1 = "off";
                        break;
                    case 1: led1 = "red";
                        break;
                    case 2: led1 = "green";
                        break;
                    case 3: led1 = "blue";
                        break;
                    default:
                        break;
                }

                int rcode = code - (lcode * 4);
                switch(rcode) {
                    case 0: led2 = "off";
                        break;
                    case 1: led2 = "red";
                        break;
                    case 2: led2 = "green";
                        break;
                    case 3: led2 = "blue";
                        break;
                    default:
                        break;
                }
                
                System.out.println(led1 + " " + led2);

            }

            input.close();
        }

    }

}
