import java.util.*;

public class CarCareChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] servicesAvailable = new String[] {"Oil change", "Tire rotation", "Battery check", "Brake inspection"};
        int[] prices = new int[] {25, 22, 15, 5};
        System.out.println("Services available:");
        for(int i = 0; i < servicesAvailable.length; ++i)
        {
            System.out.println((i + 1) + ")" + servicesAvailable[i]);
        }
        System.out.println("Input:");
        String userInput = scanner.nextLine();
        int priceIndex = -1;
        for(int i = 0; i < servicesAvailable.length; ++i)
        {
            if(servicesAvailable[i].equals(userInput))
            {
                priceIndex = i;
                break;
            }
        }
        if(priceIndex == -1)
        {
            System.out.println("No such service is available");
        }
        else
        {
            System.out.println("Price: $" + prices[priceIndex]);
        }
    }
}