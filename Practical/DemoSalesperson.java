import java.util.*;

public class DemoSalesperson {
    public static void main(String[] args) {
        Salesperson[] salespeople = new Salesperson[10];
        for(int i = 0; i < salespeople.length; ++i)
        {
            salespeople[i] = new Salesperson(99999, 0);
            System.out.println(salespeople[i].toString());
        }
    }
}