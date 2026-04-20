package regexproblems;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String text = "This    is    an    example   with   multiple   spaces.";

        String result = text.replaceAll("\\s+", " ");

        System.out.println("After Replacing Spaces:");
        System.out.println(result);
    }
}