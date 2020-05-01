package test;

import domain.Exercise;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class where all testing goes
 * @author Andrii Kotliar
 */
public class TestResult {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList(Arrays.asList(6, 6, 6, 8, 3, 7));
        System.out.println("Numbers: [6, 6, 6, 8, 3, 7]");
        try {
            int mostRepeatedNumber = Exercise.Calculate(arrayOfNumbers);
            System.out.println("Most repeated number: " + mostRepeatedNumber);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
