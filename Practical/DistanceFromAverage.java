import java.util.*;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        double userInput = 0;
        double sum = 0;

        while(userInput != 99999)
        {
            System.out.println("Input any decimal number between 0 and 20:");
            userInput = scanner.nextDouble();
            if(userInput == 99999)
                continue;
            userInput = Math.min(userInput, 20);
            userInput = Math.max(userInput, 0);
            ++count;
            sum += userInput;
            double average = sum / count;
            double distance = Math.abs(average - userInput);
            System.out.println("Distance from average: " + distance);
        }
    }
}