public class LifelineSite extends Site{
    public LifelineSite(String named){
        this.siteName = named;
    }
    @Override
    public double getBillableAmount(int _units, double _rate) {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
