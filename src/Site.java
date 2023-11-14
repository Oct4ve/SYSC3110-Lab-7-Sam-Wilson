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
    public int getUnits(){
        return _units;
    }
    public double getRate(){
        return _rate;
    }
    public void setSiteName(String newname){
        siteName = newname;
    }
    public void setUnits(int newunits){
        _units = newunits;
    }
    public void setRate(double newrate){
        _rate = newrate;
    }
}
