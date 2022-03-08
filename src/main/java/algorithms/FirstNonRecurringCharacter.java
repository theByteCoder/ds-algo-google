package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FirstNonRecurringCharacter {

    public static void main(String[] args) {
        String val = "EAAAAAABCCCCDDDDA12A";

        HashSet<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();

        for (int count = 0; count < val.length(); count++) {
            char charAt = val.charAt(count);
            if (nonRepeating.contains(charAt)) {
                repeating.add(charAt);
                nonRepeating.remove((Character) charAt);
            } else nonRepeating.add(charAt);
        }
        System.out.println(nonRepeating.get(0));
    }
}
