import java.util.Scanner;

public class CaesarCipher {
    static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j',
                            'k','l','m','n','o','p','q','r','s','t',
                            'u','v','w','x','y','z'};

    public static void main(String[] args) throws Exception {

        try(Scanner input = new Scanner(System.in)) {

            int numCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < numCases; testcase++) {

                int shift = Integer.parseInt(input.nextLine());
                char[] line = input.nextLine().toCharArray();
                //int value = (int)'a';
                //System.out.println(value);
                //System.out.println(alphabet[value - 97]);

                for(int i = 0; i < line.length; i++) {

                    if(line[i] != ' ') {
                        line[i] = alphabet[((int)line[i] - 97 + (26 - shift)) % 26];
                    }

                }

                System.out.println(line.toString().valueOf(line));

            }

            input.close();
        }
        
        
    }
}
