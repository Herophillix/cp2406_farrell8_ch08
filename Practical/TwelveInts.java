import java.util.*;

public class TwelveInts {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println(Arrays.asList(array));
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }
}