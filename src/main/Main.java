package main;

public class Main {
    public static void main(String[] args) {
        // NOTE: comments can be added this way or
        /* this way */
        System.out.println("This is our Day #1");
        String argsAsString = String.join(", ", args);
        if (argsAsString.isEmpty()) {
            System.out.println("No arguments found");
        } else {
            // we are using printf here since we have a formatted string
            // %n adds a system line separator and argAsString is printed on a new line
            // %s will be replaced with argsAsString
            System.out.printf("Your command line arguments are:%n%s", argsAsString);
        }
    }
}
