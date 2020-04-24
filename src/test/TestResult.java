package test;

import domain.Exercise;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class where all testing goes
 * @author Andrii Kotliar
 */
public class TestResult {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList();
        Scanner in = new Scanner(System.in);
        boolean isNotEnd = true;
        System.out.println("Welcome to application where you can get the most repeated number ou entered!\nEnter numbers or write 'stop' in order to stop inputing new numbers.");
        while(isNotEnd) {
            System.out.print("Please, enter number: ");
            String input = in.nextLine();
            if ("stop".equals(input.toLowerCase())) {
                isNotEnd = false;
            }
            else {
                try {
                    arrayOfNumbers.add(Integer.parseInt(input));
                }
                catch (NumberFormatException exception) {
                    System.err.println("Please enter correct number");
                }
            }
        }
        try {
            int mostRepeatedNumber = Exercise.Calculate(arrayOfNumbers);
            System.out.println("Most repeated number in this list is: " + mostRepeatedNumber);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
