public class ResidentialSite extends Site{
    public ResidentialSite(String named){
        this.siteName = named;
    }
    @Override
    public double getBillableAmount(int _units, double _rate){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
