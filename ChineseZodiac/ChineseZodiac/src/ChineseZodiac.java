import java.util.Scanner;

public class ChineseZodiac {
    
    static int year;
    static String aspect;
    static String[] elements = {"Wood", "Fire", "Earth", "Metal", "Water"};
    static String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                    "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};

    public static void main(String[] args) throws Exception {
        
        try(Scanner input = new Scanner(System.in)) {

            int numCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < numCases; testcase++) {
                year = Integer.parseInt(input.nextLine());
                if(year % 2 == 0) {
                    aspect = "Yang";
                } else {
                    aspect = "Yin";
                }

                String element = elements[((year - 4) % 10) / 2];

                String animal = animals[(year - 4) % 12];

                System.out.println(year + " " + aspect + " " + element + " " + animal);
            }

            input.close();
        }

    }

}
