package studio1;

import support.cse131.ArgsProcessor;

public class Average {
public static void main(String[] args) {
    ArgsProcessor ap = new ArgsProcessor(args);
    int n1 = ap.nextInt("How many cups of coffee did you have today?");
    int n2 = ap.nextInt("How many siblings do you have?");

    System.out.println("You had " + n1 + " cups of coffee today. You have " + n2 + " sibling(s).");
}
}
