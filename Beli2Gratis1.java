import java.io.* ;
public class Beli2Gratis1 {
  public static void main (String[]argc) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ;
  //variabel
    int jumlahBarang ;
    int bonus ;
    int total ;
    int harga = 25000 ;
    int totalHarga ;
   //output
    System.out.println("====TOKO T-SHIRT====") ;
    System.out.println("Promo Beli 2 Gratis 1") ;
    System.out.println() ;
    System.out.println("Jumlah barang yang dibeli : ") ;
    jumlahBarang = Integer.parseInt(br.readLine()) ;
    bonus=(jumlahBarang/2) ;
    total=(jumlahBarang+bonus) ;
    totalHarga=(jumlahBarang*harga) ;
    System.out.println("Jumlah barang anda = "+jumlahBarang+" Jadi bonus anda adalah "+bonus) ;
    System.out.println() ;
    System.out.println("Total Barang anda : "+total) ;
    System.out.println() ;
    System.out.println("Total Harga Anda : "+totalHarga) ;
    System.out.println() ;
  }
}