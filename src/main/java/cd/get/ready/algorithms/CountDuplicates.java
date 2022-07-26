package cd.get.ready.algorithms;

import java.util.HashMap;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        int count = 0;
        for (String word : input) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 0);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
                count++;
            }
        }
        return count;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int count = 0;

        for (int num : input) {
            if(numCount.containsKey(num)) {
                count++;
            } else
                numCount.put(num, 1);
        }
        return count;
    }
}
