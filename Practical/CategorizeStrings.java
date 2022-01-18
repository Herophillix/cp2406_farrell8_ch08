import java.util.*;

public class CategorizeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> smallString = new Stack<>();
        List<String> largeString = new Stack<>();
        for(int i = 0; i < 10; ++i)
        {
            System.out.println("Input string " + (i + 1) + ": ");
            String userInput = scanner.nextLine();
            if(userInput.length() <= 10)
                smallString.add(userInput);
            else
                largeString.add(userInput);
        }
        
        System.out.println("Select type of string to print(1 - Short, 2 - Long): ");
        int userChoice = scanner.nextInt();
        if(userChoice == 1)
        {
            for(String element: smallString)
            {
                System.out.println(element);
            }
        }
        else
        {
            for(String element: largeString)
            {
                System.out.println(element);
            }
        }
    }
}