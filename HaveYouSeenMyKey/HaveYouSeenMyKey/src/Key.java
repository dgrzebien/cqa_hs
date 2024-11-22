import java.util.Scanner;

public class Key {
    public static void main(String[] args) throws Exception {

        try(Scanner input = new Scanner(System.in)) {

            int numCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < numCases; testcase++) {
                int keys = Integer.parseInt(input.nextLine());
                String cipherText = input.nextLine();
                for(int i = 0; i < keys; i++) {
                    String key = input.nextLine();
                    System.out.print("[");
                    for(int l = 0; l < key.length(); l = l + 2) {
                        String hex1 = cipherText.substring(l, l + 2);
                        String hex2 = key.substring(l, l + 2);
                        System.out.print((char) (Integer.parseInt(hex1, 16) ^ Integer.parseInt(hex2,16)));
                    }
                    System.out.println("]");
                }
            }

            input.close();
        }

    }

}
