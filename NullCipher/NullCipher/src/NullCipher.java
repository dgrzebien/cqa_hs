import java.util.Scanner;

public class NullCipher {
    public static void main(String[] args) throws Exception {

        try(Scanner input = new Scanner(System.in)) {

            int numCases = Integer.parseInt(input.nextLine());
            
            for(int testcase = 0; testcase < numCases; testcase++) {

                String ciphertext = input.nextLine();
                boolean printLetter = false;

                for(int n = 0; n < ciphertext.length(); n++) {
                    char letter = ciphertext.charAt(n);
                    if(printLetter) {
                        System.out.print(letter);
                        printLetter = false;
                    } else if(letter == 'a' || letter == 'e' || letter == 'i' ||
                            letter == 'o' || letter =='u') {
                        printLetter = true;
                    }
                }

                System.out.println();
            }

            input.close();

        }

    }

}
