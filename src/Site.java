abstract class Site {
    public String siteName;
    public static double TAX_RATE = 1.13;
    abstract double getBillableAmount(int _units, double _rate);
    abstract double getBaseAmount(int _units, double _rate);
    abstract double getTaxAmount(double base);
    public String getSiteName(){
        return siteName;
    }
}
