package algorithms;

import java.util.HashMap;

public class SlidingWindow_CombinationOfCharactersInString {

    public static void main(String[] args) {
        String bigString = "abcabdefcabec";
        String smallString = "abc";
        System.out.println(combinationOfCharactersInString(bigString, smallString));
    }

    public static int combinationOfCharactersInString(String bigString, String smallString) {
        HashMap<Character, Integer> counterBingString = new HashMap<>();
        HashMap<Character, Integer> counterSmallString = new HashMap<>();

        int result = 0;
        int l = smallString.length();
        int counterForMatches = 0;

        for (int i = 0; i < l; i++) {
            // add to small string counter map
            counterSmallString.put(bigString.charAt(i), counterSmallString.getOrDefault(bigString.charAt(i), 0) + 1);
        }

        // first window
        for (int i = 0; i < l; i++) {
            char currChar = bigString.charAt(i);
            // checking if current character is present in small string counter saves space
            if (counterSmallString.containsKey(currChar)) {
                // add to big string counter map
                counterBingString.put(bigString.charAt(i), counterBingString.getOrDefault(bigString.charAt(i), 0) + 1);
                // check if matches with small string counter map
                if (counterBingString.get(currChar) == counterSmallString.get(currChar)) {
                    counterForMatches++;
                }
            }
            // final check if counterForMatches match small string length
            if (l == counterForMatches) {
                result++;
            }
        }
        // next window
        for (int i = 0; i < bigString.length() - l; i++) {
            char nextChar = bigString.charAt(i + l);
            // checking if current character is present in small string counter saves space
            if (counterSmallString.containsKey(nextChar)) {
                // add next char to big string counter map
                counterBingString.put(nextChar, counterBingString.getOrDefault(nextChar, 0) + 1);
                // increment if matches with small string counter map
                if (counterBingString.get(nextChar) == counterSmallString.get(nextChar)) {
                    counterForMatches++;
                }
            }

            char prevChar = bigString.charAt(i);
            // checking if previous character is present in small string counter avoids unwanted decrements
            if (counterSmallString.containsKey(prevChar)) {
                // decrement if previous char matched with small string counter map
                if (counterBingString.get(prevChar) == counterSmallString.get(prevChar)) {
                    counterForMatches--;
                }
                // remove previous char from big string counter map
                counterBingString.put(prevChar, counterBingString.getOrDefault(prevChar, 0) - 1);
            }
            // final check if counterForMatches match small string length
            if (l == counterForMatches) {
                result++;
            }
        }

        return result;
    }
}
