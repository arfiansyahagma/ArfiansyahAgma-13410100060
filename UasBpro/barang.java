public class barang
{
 private String id;
 private String nama;
 private double harga;
 private double hargaJual;
 
 public barang(String id, String nama, double harga){
  this.id=id; //untuk mengisi nilai
  this.nama=nama;
  this.harga=harga;
 }
 public String getId(){ //memanggil
  return id; //yang dipanggil
 }
 public void setHargajual(int harga){ //ganti
  this.harga=harga;
 }
 public double getHargajual(){
  return harga+(harga*0.1);
 }
 public void setHargabeli(int harga){
  this.harga=harga;
 }
 public double getHargabeli(){
  return harga;
 }
 public String getNama(){
  return nama;
 }
 public void setNama(String nama){
  this.nama=nama;
 }
 

}