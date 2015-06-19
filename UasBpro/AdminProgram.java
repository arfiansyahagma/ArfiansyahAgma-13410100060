import java.util.*;
public class AdminProgram {
 //Inisialisasi Vector Buah
 public static Scanner sc = new Scanner (System.in);
 public static void admin (){
  boolean haladmin=false;
  do {
   System.out.println ("");
   System.out.println ("****** Halaman Admin *******");
   System.out.println("****************************") ;
   System.out.println ("1. Manajemen Barang");
   System.out.println ("2. Manajemen User");
   System.out.println ("3. Laporan Penjualan");
   System.out.println ("4. Cari Data");
   System.out.println ("5. Logout");
   System.out.print ("Pilih pilihan [1-5] : ");
   int Pil_Barang = sc.nextInt();
    boolean barang=false;
    
   switch (Pil_Barang) {
    case 1:
     do {
      DbBarang.mainMenu(); //untuk memanggil class dbBarang dan method main menu
      int pilbarang = DbBarang.bacaInt("Pilih pilihan [1-5] : ");
      int urutan=-1;
      
       if (pilbarang == 1){
       boolean cekbarang = false;
        do {
        DbBarang.addBarang();
        cekbarang=true;
        } while (cekbarang == false);
           }
       
       if (pilbarang == 2){
        DbBarang.hapusBarang();
       }
       
       if (pilbarang == 3){
        DbBarang.updateBarang();
       }
       
       if (pilbarang == 4){
        DbBarang.viewAllBarang();
       }
       
       if (pilbarang == 5){
        barang = true;
       }
       
     } while (barang == false);
    break;
    
    case 2:
     ProgramPertama.ManajemenUser();
    break;
    
    case 3:
    DbBarang.cetakreport();
    break;
    case 4:DbBarang.tampilData();
    break;
    case 5:
     haladmin = true;
    break;
   }
  } while (haladmin == false);
 }
 
 public static void Penjualan () {

 }
 
 public static Vector total= new Vector();
 public static Vector <String> namabarang2= new Vector <String>();
 public static Vector <String> hari = new Vector <String>();
 public static Vector totalhari = new Vector();
 public static Vector totalminggu = new Vector();
 public static Vector alltotal = new Vector();
 

 public static void kasir (){
  boolean halkasir = false;
  
  do {
   System.out.println ("");
   System.out.println ("******* Halaman Kasir *******");
   System.out.println("****************************") ;
   System.out.println ("1. Penjualan");
   System.out.println ("2. Lihat Penjualan");
   System.out.println ("3. Logout");
   int Pil_Kasir = sc.nextInt();
   String ksrbuah;
   
   switch (Pil_Kasir) {
    case 1:DbBarang.trans();
      break;
    case 2:DbBarang.cetaktrans();
      break;
     case 3:
       halkasir=true;
       break;
   }
  }while(halkasir == false);
 }
 
}
