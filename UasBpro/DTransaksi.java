public class DTransaksi{
 private double kuantiti;
 private barang brg;
 
 public DTransaksi(barang brg, double kuantiti){
  this.brg=brg;
  this.kuantiti=kuantiti;
 }
        public barang getBarang(){
  return brg;
 }
        public double getKuantiti(){
  return kuantiti;
 }
 public double hitungSubTotal(){
  return brg.getHargajual() * kuantiti;
 }
}