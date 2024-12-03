public class Strings {
    public static void main(String[] args) throws Exception {
        // string concatenation; adding 2 strings together
        String firstName = "George";
        String lastName = "Washington";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        // String.concat method
        System.out.println(firstName.concat(lastName));

        // inputStr with 16 words
        String inputStr = "now is the time for all good men to come to the aid of their country";
        String[] splits = inputStr.split(" ");
        System.out.println(splits.length);

        // words separated by a dot (.)
        inputStr = "now.is.the.time.for.all.good.men.to.come.to.the.aid.of.their.country.";
        // the dot (.) in the String.split method needs to be escaped with 2 back slashes. The dot (.)
        // is a Java regular expression (regex) special character to indicate find just one instance
        // of any character
        String[] newSplits = inputStr.split("\\.");
        System.out.println(newSplits.length);

    }
}
