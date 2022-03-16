package algorithms;

import java.util.Hashtable;
import java.util.List;

public class BestDayToSellShares {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int maxProfit = 0;

        try {
            for (int day = 0; day < arr.length; day++) {
                System.out.println(arr[day + 1]);
                if (arr[day + 1] - arr[day] > maxProfit) {
                    maxProfit = arr[day + 1] - arr[day];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        System.out.println(maxProfit);
    }
}
