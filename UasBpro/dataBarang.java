public class dataBarang
{
 private String idBarang;
 private String namaBarang;
 private float hargaBarang;
 private float hargaJual;
 private float Untung;
 
 
 public dataBarang(String idBarang, String namaBarang, float hargaBarang)
 {
  this.idBarang = idBarang;
  this.namaBarang = namaBarang;
  this.hargaBarang = hargaBarang;
  hargaJual = hargaBarang + (int)(hargaBarang * 0.1);
  Untung = hargaJual - hargaBarang;
 }
 
 public String getId()
 {
  return idBarang;
 }
 
 public String getNamaBarang()
 {
  return namaBarang;
 }
 
 public float getHargaBarang()
 {
  return hargaBarang;
 }
 
 public float getHargaJual()
 {
  return hargaJual;
 }
 
 public void setHarga(float hargaBarang)
 {
  this.hargaBarang = hargaBarang;
 }
 
 public void setNama(String namaBarang)
 {
  this.namaBarang = namaBarang;
 }
 
 
}
 