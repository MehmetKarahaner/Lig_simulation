public class BasketbolTakimi extends Takim{
    public BasketbolTakimi(String takimIsmi) {
        super(takimIsmi);
    }
    @Override
    protected void setOyuncuSayisi() {
        this.oyuncuSayisi = 5;
    }
}
