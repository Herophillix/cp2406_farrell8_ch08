public class DemoSalesperson2 {
    public static void main(String[] args) {
        Salesperson[] salespeople = new Salesperson[10];
        for(int i = 0; i < salespeople.length; ++i)
        {
            salespeople[i] = new Salesperson(111 + i, 25000 + i * 5000);
            System.out.println(salespeople[i].toString());
        }
    }
}