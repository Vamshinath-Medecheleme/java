public class StringConcatenation {
    public static void main(String[] args) {
        // Declare and initialize two strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate strings using +
        String result1 = str1 + str2;

        // Concatenate strings using concat() method
        String result2 = str1.concat(str2);

        // Print results
        System.out.println("Using +: " + result1);
        System.out.println("Using concat(): " + result2);
    }
}


