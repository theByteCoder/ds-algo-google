package algorithms;

import java.util.HashMap;

public class FirstRecurringCharacter {

    public static void main(String[] args) {
        String val = "ABCDBA";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int count = 0; count < val.length(); count++) {
            char charAt = val.charAt(count);
            if(hashMap.containsKey(charAt)) {
                System.out.println(charAt);
                break;
            } else hashMap.put(charAt, 1);
        }
    }
}
