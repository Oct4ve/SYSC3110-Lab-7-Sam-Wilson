abstract class Site {
    public String name;
    public static double TAX_RATE = 1.13;
    public abstract double getBillableAmount(int _units, double _rate);
    public String getName(){
        return name;
    }
}
