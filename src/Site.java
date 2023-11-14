abstract class Site {
    public String siteName;
    protected int _units;
    protected double _rate;
    public static double TAX_RATE = 1.13;
    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
    abstract double getBaseAmount();
    abstract double getTaxAmount();
    public String getSiteName(){
        return siteName;
    }
}
