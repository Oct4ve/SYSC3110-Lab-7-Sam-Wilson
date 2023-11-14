public class LifelineSite extends Site{
    public LifelineSite(String named){
        this.siteName = named;
    }
    @Override
    protected double getBaseAmount(){
        return _units * _rate * 0.5;
    }
    @Override
    protected double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }
}
