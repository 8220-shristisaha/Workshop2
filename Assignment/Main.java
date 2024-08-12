//Define a functional interface Transformer with a method
// String transform(String input). Implement this interface using
// to convert the string to lower case,uppercase &title case.


import java.util.Scanner;

interface Transformer {
    String transform(String input);
}

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String string = scanner.next();

            Transformer lowerCase = input -> input.toLowerCase();
            System.out.println("The lower case of input is : " + lowerCase.transform(string));

            Transformer upperCase = input -> input.toUpperCase();
            System.out.println("The upper case of input is : " + upperCase.transform(string));

            Transformer titleCase = input -> input.substring(0, 1).toUpperCase() + input.substring(1, input.length());
            System.out.println("The title case of input is : " + titleCase.transform(string));

        } catch (Exception e) {
            System.out.println("Error : [ " + e.getMessage() + " ]");
        }

    }
}
