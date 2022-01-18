public class Salesperson {
    private int id;
    private double annualSales;

    public Salesperson(int id, double annualSales)
    {
        this.id = id;
        this.annualSales = annualSales;
    }

    public int GetID() { return id; }
    public double GetAnnualSales() { return annualSales; }

    public void SetID(int id) { this.id = id; }
    public void SetAnnualSales(double annualSales) { this.annualSales = annualSales; }

    @Override
    public String toString() {
        return "Salesperson{" +
                "id=" + id +
                ", annualSales=" + annualSales +
                '}';
    }
}
