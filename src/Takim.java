import java.util.ArrayList;
abstract public class Takim {
    protected String takimIsmi;
    protected int kazanmaSayisi;
    protected int kaybetmeSayisi;
    protected int berabereSayisi;
    protected int averaj;
    protected int saldiriGucu = 0;
    protected int savunmaGucu = 0;
    protected int oyuncuSayisi;
    protected int puan;

    public int getOyuncuSayisi() {
        return oyuncuSayisi;
    }

    protected ArrayList<Oyuncular> oyuncular= new ArrayList<>();
    public void oyuncuEkle(String isim, int saldiri, int savunma){
        Oyuncular oyuncu = new Oyuncular(isim, saldiri, savunma);
        oyuncular.add(oyuncu);
        saldiriGucu += oyuncu.saldiriGucu;
        savunmaGucu += oyuncu.savunmaGucu;
    }
    protected void setOyuncuSayisi() {
        this.oyuncuSayisi = 11;
    }
    public Takim(String takimIsmi) {
        super();
        this.takimIsmi = takimIsmi;
        setOyuncuSayisi();
    }

    public String getTakimIsmi() {
        return takimIsmi;
    }
    public void puanYazdir(){
        System.out.println(takimIsmi+"   ||      "+kazanmaSayisi+"    ||     "+berabereSayisi+"      ||    "
                +kaybetmeSayisi+"       || "+ puan+"   ||  "+averaj);
    }
    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public int getSavunmaGucu() {
        return savunmaGucu;
    }

    public void setKazanmaSayisi(int kazanmaSayisi) {
        this.kazanmaSayisi += kazanmaSayisi;
        puan += 3;
    }

    public void setKaybetmeSayisi(int kaybetmeSayisi) {
        this.kaybetmeSayisi += kaybetmeSayisi;
    }

    public void setBerabereSayisi(int berabereSayisi) {
        this.berabereSayisi += berabereSayisi;
        puan++ ;
    }

    public int getAveraj() {
        return averaj;
    }

    public int getPuan() {
        return puan;
    }

    public void setAveraj(int averaj) {
        this.averaj += averaj;
    }
}
