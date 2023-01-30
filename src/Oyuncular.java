public class Oyuncular {
    String isimSoyisim;
    int saldiriGucu;
    int savunmaGucu;
    Oyuncular(String isimSoyisim,int saldiriGucu, int savunmaGucu){
        this.isimSoyisim = isimSoyisim;
        this.saldiriGucu = saldiriGucu;
        this.savunmaGucu = savunmaGucu;
    }
    public void oyuncuBilgisiGetir(){ // istenilirse oyuncuların bilgisini de getirebilirler.
        // heyyy
        System.out.println("Oyuncu ismi soyismi: "+isimSoyisim+" Saldırı Puanı: "+saldiriGucu+" Savunma puanı: "+savunmaGucu);
    }
}
