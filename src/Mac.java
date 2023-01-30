import java.util.Random;

abstract public class Mac {
    Random rnd = new Random();
    private boolean hucumYap(FutbolTakimi saldiranTakim, FutbolTakimi savunanTakim){
        int zarSaldir = rnd.nextInt(10)+1;
        int zarSavun = rnd.nextInt(18)+1;

        return zarSaldir+(saldiranTakim.getSaldiriGucu()/saldiranTakim.getOyuncuSayisi()) >
                zarSavun+(savunanTakim.getSavunmaGucu()/savunanTakim.getOyuncuSayisi());
    }
    public Mac(FutbolTakimi evSahibi, FutbolTakimi deplasman) {
        Random rand = new Random();
        int hamleSayisi = rnd.nextInt(11)+10;
        int hamle;
        int evSahibiGol = 0;
        int deplasmanGol = 0;

        for (int i = 0; i < hamleSayisi; i++) {
           hamle= rnd.nextInt(305); // ev sahibinin %5 daha fazla atak yapmasını sağlıyoruz.
           hamle /= 100;
           switch (hamle){
               case 0: // hucum kaçtı
                   break;
               case 1:
                   if(hucumYap(deplasman,evSahibi)) {
                       deplasmanGol++;
                       evSahibi.setAveraj(-1);
                       deplasman.setAveraj(+1);
                   }
                   break;
               default:
                   if(hucumYap(evSahibi,deplasman)) {
                       evSahibiGol++;
                       deplasman.setAveraj(-1);
                       evSahibi.setAveraj(+1);
                   }
                   break;
           }
        }
        System.out.println("\nMaç sonucu : ");
        System.out.println(evSahibi.getTakimIsmi()+" : "+evSahibiGol+" "+deplasman.getTakimIsmi()+" : "+deplasmanGol);
        if (evSahibiGol == deplasmanGol){
            evSahibi.setBerabereSayisi(1);
            deplasman.setBerabereSayisi(1);
        } else if (evSahibiGol > deplasmanGol) {
            evSahibi.setKazanmaSayisi(1);
            deplasman.setKaybetmeSayisi(1);
        }
        else {
            evSahibi.setKaybetmeSayisi(1);
            deplasman.setKazanmaSayisi(1);
        }
    }
}
