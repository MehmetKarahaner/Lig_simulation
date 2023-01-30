import java.util.Arrays;
import java.util.Random;

public class Lig {
    public FutbolTakimi[] siralamaYap(FutbolTakimi[] takimlar){
        FutbolTakimi yedek;
        for (int i = 0; i < takimlar.length; i++) {
            for (int j = 0; j < takimlar.length; j++) {
                if (takimlar[i].getPuan()>takimlar[j].getPuan()){
                    yedek = takimlar[i];
                    takimlar[i] = takimlar[j];
                    takimlar[j] = yedek;
                } else if (takimlar[i].getPuan() == takimlar[j].getPuan()) {
                    if (takimlar[i].getAveraj()>takimlar[j].getAveraj()){
                        yedek = takimlar[i];
                        takimlar[i] = takimlar[j];
                        takimlar[j] = yedek;
                    }
                }
            }
        }
        return takimlar;
    } // şimdi fikstür için sıralayalım
    public void futbolKupasi(FutbolTakimi[] takimlar){
        for (int i = 0; i <takimlar.length; i++) {
            for (int j = 0; j <takimlar.length ; j++) {
                if (j == i )
                    continue;
                FutbolMaci yeniMac = new FutbolMaci(takimlar[i], takimlar[j]);
            }
        }
        // takimlar[0].oyuncular.forEach(Oyuncular::oyuncuBilgisiGetir); // mesela şu an oyuncu bilgilerini getirebilir

        takimlar = siralamaYap(takimlar);

        System.out.println("\nPuan durumu: ");
        System.out.println("Takım İsmi || Galibiyet || Beraberlik || Mağlubiyet || Puan || Averaj\n");
        for (int i = 0; i < takimlar.length; i++) {
            takimlar[i].puanYazdir();
        }

    }
    public int randomPuan(int multiply){
        Random rnd = new Random();
        return rnd.nextInt(21)+(multiply*10);
    }
    public void oyuncuYerlestir(FutbolTakimi[] yariFinal){

        yariFinal[0].oyuncuEkle("M ter Stegen",randomPuan(5),randomPuan(7));
        yariFinal[0].oyuncuEkle("T Kehrer",randomPuan(5),randomPuan(7));
        yariFinal[0].oyuncuEkle("N Süle",randomPuan(5),randomPuan(7));
        yariFinal[0].oyuncuEkle("N Schlotterbeck",randomPuan(5),randomPuan(7));
        yariFinal[0].oyuncuEkle("D Raum",randomPuan(5),randomPuan(6));
        yariFinal[0].oyuncuEkle("J Kimmich",randomPuan(7),randomPuan(5));
        yariFinal[0].oyuncuEkle("I Gündogan",randomPuan(5),randomPuan(7));
        yariFinal[0].oyuncuEkle("J Hofmann",randomPuan(5),randomPuan(7));
        yariFinal[0].oyuncuEkle("J Musiala",randomPuan(6),randomPuan(7));
        yariFinal[0].oyuncuEkle("L Sané",randomPuan(8),randomPuan(5));
        yariFinal[0].oyuncuEkle("K Havertz",randomPuan(8),randomPuan(5));

        yariFinal[1].oyuncuEkle("Lloris",randomPuan(5),randomPuan(8));
        yariFinal[1].oyuncuEkle("Varane",randomPuan(5),randomPuan(7));
        yariFinal[1].oyuncuEkle("Upamecano",randomPuan(4),randomPuan(6));
        yariFinal[1].oyuncuEkle("Hernandez",randomPuan(5),randomPuan(6));
        yariFinal[1].oyuncuEkle("Kounde",randomPuan(4),randomPuan(7));
        yariFinal[1].oyuncuEkle("Griezmann",randomPuan(6),randomPuan(7));
        yariFinal[1].oyuncuEkle("Rabiot",randomPuan(6),randomPuan(7));
        yariFinal[1].oyuncuEkle("O. Dembele",randomPuan(7),randomPuan(7));
        yariFinal[1].oyuncuEkle("Tchouameni",randomPuan(7),randomPuan(7));
        yariFinal[1].oyuncuEkle("Giroud",randomPuan(8),randomPuan(4));
        yariFinal[1].oyuncuEkle("Mbappe",100,randomPuan(5));

        yariFinal[2].oyuncuEkle("Emiliano Martínez",randomPuan(6),randomPuan(8));
        yariFinal[2].oyuncuEkle("Molina",randomPuan(5),randomPuan(7));
        yariFinal[2].oyuncuEkle("Romero",randomPuan(5),randomPuan(6));
        yariFinal[2].oyuncuEkle("Otamendi",randomPuan(5),randomPuan(6));
        yariFinal[2].oyuncuEkle("Acuna",randomPuan(7),randomPuan(7));
        yariFinal[2].oyuncuEkle("Di María",randomPuan(8),randomPuan(7));
        yariFinal[2].oyuncuEkle("De Paul",randomPuan(7),randomPuan(7));
        yariFinal[2].oyuncuEkle("Enzo Fernández",randomPuan(8),randomPuan(7));
        yariFinal[2].oyuncuEkle("Mac Allister",randomPuan(8),randomPuan(6));
        yariFinal[2].oyuncuEkle("Julian Alvarez",randomPuan(7),randomPuan(5));
        yariFinal[2].oyuncuEkle("Lionel Messi",100,randomPuan(7));

        yariFinal[3].oyuncuEkle("N Pope",randomPuan(5),randomPuan(8));
        yariFinal[3].oyuncuEkle("J Stones",randomPuan(5),randomPuan(6));
        yariFinal[3].oyuncuEkle("E Dier",randomPuan(4),randomPuan(5));
        yariFinal[3].oyuncuEkle("H Maguire",randomPuan(6),randomPuan(5));
        yariFinal[3].oyuncuEkle("R James",randomPuan(6),randomPuan(7));
        yariFinal[3].oyuncuEkle("J Bellingham",randomPuan(7),randomPuan(5));
        yariFinal[3].oyuncuEkle("D Rice",randomPuan(7),randomPuan(6));
        yariFinal[3].oyuncuEkle("L Shaw",randomPuan(7),randomPuan(6));
        yariFinal[3].oyuncuEkle("P Foden",randomPuan(7),randomPuan(5));
        yariFinal[3].oyuncuEkle("R Sterling",randomPuan(8),randomPuan(5));
        yariFinal[3].oyuncuEkle("H Kane",randomPuan(8),randomPuan(4));

        futbolKupasi(yariFinal);
    }
    Lig(){
        FutbolTakimi Almanya = new FutbolTakimi("Almanya  ");
        FutbolTakimi Fransa = new FutbolTakimi("Fransa   ");
        FutbolTakimi Arjantin = new FutbolTakimi("Arjantin ");
        FutbolTakimi Ingiltere = new FutbolTakimi("İngiltere");

        FutbolTakimi[] yariFinal = { Almanya, Fransa, Arjantin, Ingiltere};

        oyuncuYerlestir(yariFinal);
    }
}
