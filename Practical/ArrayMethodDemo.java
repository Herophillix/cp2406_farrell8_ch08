import java.util.*;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Display(array);
        DisplayReverse(array);
        DisplaySum(array);
        DisplayLessThan(array, 4);
        DisplayMoreThanAverage(array);
    }

    public static void Display(Integer[] array)
    {
        System.out.println(Arrays.asList(array));
    }

    public static void DisplayReverse(Integer[] array)
    {
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }

    public static void DisplaySum(Integer[] array)
    {
        int sum = 0;
        for(int element: array)
        {
            sum += element;
        }
        System.out.println("Sum: " + sum);
    }

    public static void DisplayLessThan(Integer[] array, int value)
    {
        for(int element: array)
        {
            if(element < value)
                System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void DisplayMoreThanAverage(Integer[] array)
    {
        int sum = 0;
        for(int element: array)
        {
            sum += element;
        }
        int average = sum / array.length;
        for(int element: array)
        {
            if(element > average)
                System.out.print(element + " ");
        }
        System.out.println();
    }
}