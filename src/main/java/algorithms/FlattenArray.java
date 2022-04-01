package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenArray {

    public static void main(String[] args) {
        Object[] arr = {8, 9, 101, 2, new Object[]{3101, 2, 46, 7, new Object[]{68, 9, 10, 72, 46, 75}, 68, 9, 10, 72, 46, 768, 9, 10, 72, 46, 7}, 8, 9, 10};

        System.out.println(Arrays.toString(flatArrayWithStreams(arr).toArray()));
        System.out.println(Arrays.toString(flatArrayWithLoops(arr).toArray()));
    }

    private static Stream<Object> flatArrayWithStreams(Object[] arr) {
        return Arrays.stream(arr).flatMap(item -> item instanceof Object[] ? flatArrayWithStreams((Object[]) item) : Stream.of(item));
    }

    private static List<Object> flatArrayWithLoops(Object[] arr) {
        List<Object> newList = new ArrayList<>();
        for (Object item : arr) {
            if (item instanceof Object[]) {
                flatArrayWithLoops((Object[]) item).stream().forEach(o -> {
                    newList.add(o);
                });
            } else {
                newList.add(item);
            }
        }
        return newList;
    }
}
