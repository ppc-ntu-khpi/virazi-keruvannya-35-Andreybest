package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Class for getting static method
 * @author Andrii Kotliar
 */
public class Exercise {
    /**
     * Get get the most repeated number of an array
     * @param arrayOfNumbers
     * @return the most repeated number
     * @throws java.lang.Exception
     */
    public static int Calculate(ArrayList<Integer> arrayOfNumbers) throws Exception {
        if (arrayOfNumbers.size() < 1) {
            throw new Exception("Array with less than 1 value is not supported");
        }
        
        HashMap<Integer, Integer> mapOfNumbers = new HashMap();
        for (int i = 0; i < arrayOfNumbers.size(); i++) {
            Integer mapValue = mapOfNumbers.get(arrayOfNumbers.get(i));
            if (mapValue == null) {
                mapOfNumbers.put(arrayOfNumbers.get(i), 1);
            }
            else {
                mapOfNumbers.put(arrayOfNumbers.get(i), mapValue + 1);
            }
        }
        
        int mostRepeatedNumber = 0;
        int mostRepeatedNumberRepeatTimes = 0;
        
        for (Entry<Integer, Integer> entry : mapOfNumbers.entrySet()) {
            Integer value = entry.getValue();
            if (value > mostRepeatedNumberRepeatTimes) {
                mostRepeatedNumber = entry.getKey();
                mostRepeatedNumberRepeatTimes = value;
            }
            
        }
        return mostRepeatedNumber;
    }
}
