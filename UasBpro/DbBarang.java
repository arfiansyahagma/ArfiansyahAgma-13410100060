import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
public class DbBarang {
    public static Vector<barang> tabelbarang=new Vector<barang>();
    public static Vector<String> report=new Vector <String>();
    public static TransaksiProgram tr1;
    public static String idTrans;
    public static String cetakhasil="";
    public static double totTrans;
    public static int jml;
    public static String hasilreport;
    public static Vector <DTransaksi> detailTransaksi = new Vector<DTransaksi>();
    public static barang stokAwal=new barang("B01","Laptop",4500000);
    public static barang stokAwal1=new barang("B02","Mouse",150000);
    public static Scanner sc =new Scanner(System.in);
    public static Calendar cal = Calendar.getInstance();
    public static SimpleDateFormat contoh4 =  new SimpleDateFormat("EEEE,ddMM yyyy");
    public static SimpleDateFormat contoh5 =  new SimpleDateFormat("HH:mm:ss");
    public static String tgl4 = contoh4.format(cal.getTime());
    public static String tgl5 = contoh5.format(cal.getTime());
    public static  boolean start=false;
    public static void addBarang(){
      if (start==false){
          tabelbarang.add(stokAwal);
          tabelbarang.add(stokAwal1);
      }
          boolean input=false;
          start=true;
          do{
          System.out.println();
            System.out.println("--TAMBAH DATA BARANG--");
            String id=bacaStr("Masukkan id barang : ");
            int idx=cari(id);
            if(idx==-1){
              input=true;
            String nama=bacaStr("Masukkan nama barang : ");
            int harga=bacaInt("Masukkan harga barang : ");
            barang brgBaru=new barang(id,nama,harga);
            tabelbarang.add(brgBaru);   
            System.out.println();
            }else{
            System.out.println("ID sudah digunakan");
        }
          }while(input==false);
        }
        public static void viewAllBarang(){
   System.out.println();
            System.out.println("--VIEW ALL BARANG--");
            System.out.println("ID \t Nama \t Harga");
            for(barang brg:tabelbarang){
                System.out.println(brg.getId()+"\t"+brg.getNama()+"\t"+brg.getHargajual());
            }
            System.out.println();
        }
        
        private static int cari(String id){
        int idx=-1;
        int i=0;
        do{
            if(tabelbarang.elementAt(i).getId().equals(id))
                idx=i;
            i++;
        }
        while((i<tabelbarang.size()&&(idx==-1)));
        return idx;
        }    
        
        public static void hapusBarang(){
   System.out.println();
            System.out.println("--HAPUS DATA BARANG--");
            String id=bacaStr("Masukkan id barang yg akan dihapus : ");
                int idx=cari(id);
                    if(idx==-1){
                        System.out.println("Nama Barang"+id+"tidak ada dalam tabel barang");
                    }
                    else{
                         String tanya=bacaStr("Apakah id barang "+id+"akan dihapus?[y/t] : ");
                          if(tanya.equalsIgnoreCase("y")){
                             tabelbarang.removeElementAt(idx);
                              System.out.println("ID : "+id+" berhasil dihapus");
                          }
                    }
                    System.out.println();
        }
        public static void updateBarang(){
   System.out.println();
            System.out.println("--UPDATE DATA BARANG--");
            String id=bacaStr("Masukkan id barang yg akan diupdate : ");
            
                int idx=cari(id);
                    if(idx==-1){
                        System.out.println("Nama Barang"+id+"tidak ada dalam tabel barang");
                    }
                    else{
                         int hrg=bacaInt("Masukkan harga yang akan diupdate : ");
                         String tanya=bacaStr("Apakah harga barang Rp"+hrg+" akan diupdate?[y/t] : ");
                         if(tanya.equalsIgnoreCase("y")){
                            tabelbarang.elementAt(idx).setHargajual(hrg);
                             System.out.println("Harga berhasil diupdate");
                         }
                    }
        }        
        public static void mainMenu(){
   System.out.println();
            System.out.println("*-------- Maintance Data Barang ---------*");
            System.out.println("* 1. Insert Barang Baru                  *");
            System.out.println("* 2. Delete Barang                       *");
            System.out.println("* 3. Update Barang                       *");
            System.out.println("* 4. View All Barang                     *");
            System.out.println("* 5. Kembali Ke Menu Utama               *");
        }
     public static int bacaInt(String pesan){
            System.out.print(pesan);  
            int i=sc.nextInt();
            return i;
  }
  public static String bacaStr(String pesan){ 
            System.out.print(pesan);  
            String str=sc.next();
            return str;
  }
  
   public static int caribarang(String nambuah){
    int idx=-1;
    int i=0;
    do{
      if(tabelbarang.elementAt(i).getNama().equalsIgnoreCase(nambuah))
        idx=i;
      i++;
    }while((i<tabelbarang.size())&&(idx==-1));
  return idx;
}
   
   public static void tampilData()
   {
     String cari = DbBarang.bacaStr("Masukan Nama Barang yang dicari: ");
    for(int i = 0; i < tabelbarang.size(); i++)
     {
       if(tabelbarang.elementAt(i).getNama().equalsIgnoreCase(cari))
       {
         System.out.println("ID Barang   : " + tabelbarang.elementAt(i).getId());
         System.out.println("Nama Barang : " + tabelbarang.elementAt(i).getNama());
         System.out.println("Harga Jual  : " + tabelbarang.elementAt(i).getHargajual());
         System.out.println("Harga Beli  : " + tabelbarang.elementAt(i).getHargabeli());
       }
     }
   }
   
 public static void trans(){
 System.out.println("-----------Penjualan--------------");
 idTrans=DbBarang.bacaStr("Masukan kode transaksi");
 tr1=new TransaksiProgram(idTrans);
 jml=DbBarang.bacaInt("Masukan jumlah pembelian");
  cetakhasil="";
 tr1.tglTr = tgl4; tr1.tglTr1 = tgl5; 
 for (int i=0;i<jml;i++){ 
   int indexnama;
   String namaBarang;
   do{
           namaBarang=DbBarang.bacaStr("Masukan Nama Barang : ");
          indexnama=DbBarang.caribarang(namaBarang);
          if (indexnama==-1){
          System.out.println("Barang tidak ditemukan");
          }
   }while(indexnama==-1);
          if (indexnama!=-1){
            String id=tabelbarang.elementAt(indexnama).getId();
            double hargabeli=tabelbarang.elementAt(indexnama).getHargajual();
            barang b1=new barang(id,namaBarang, hargabeli);
            int q=DbBarang.bacaInt("Masukan kuantiti :");
            DTransaksi dt1=new DTransaksi(b1,q);
            tr1.tambahDtr(dt1);
            cetakhasil+=b1.getId()+"\t"+b1.getNama()+"\t"+b1.getHargajual()+"\t"+dt1.getKuantiti()+"\t"+dt1.hitungSubTotal()+"\n";
            totTrans+=dt1.hitungSubTotal();
          }else{
            System.out.println("Barang tidak ditemukan");
          }
}
 hasilreport+=("\nID Transaksi :"+idTrans+"\n---------------------\nJumlah item : "+jml+"\nDetail : \n"+cetakhasil+"\nTotal : "+totTrans+"\n--------------------") ;
 System.out.println() ;
}
 
 public static void cetaktrans(){
 tr1.cetakTransaksi();
 System.out.println(cetakhasil);
  System.out.println("----------------------------");
 System.out.println("Total Transaksi : "+totTrans);
}
 
 public static void cetakreport(){
   System.out.println("Hari-Tgl-Jam : "+tgl4+" - "+tgl5);
   System.out.println(hasilreport);
   System.out.println();
 }
   
}