public class ResidentialSite extends Site{
    public ResidentialSite(String named, int units, double rate){
        this.siteName = named;
        this._units = units;
        this._rate = rate;
    }
    @Override
    protected double getBaseAmount(){
        return _units * _rate;
    }
    @Override
    protected double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE;
    }
}
