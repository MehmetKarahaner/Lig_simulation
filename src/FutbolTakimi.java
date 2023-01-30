public class FutbolTakimi extends Takim {
    public FutbolTakimi(String takimIsmi) {
        super(takimIsmi);
        // setOyuncuSayisi();
    }

    @Override
    protected void setOyuncuSayisi() {
        this.oyuncuSayisi = 11;
    }

}
