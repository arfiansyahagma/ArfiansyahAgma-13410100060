import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TugasMenuMakanan{
 public static void main (String[]args){
  Scanner sc=new Scanner(System.in);
  Calendar cal = Calendar.getInstance();
  SimpleDateFormat tglF =  new SimpleDateFormat("EEEE,dd MM yyyy");
  SimpleDateFormat jamF =  new SimpleDateFormat("HH:mm:ss");
  String tgl = tglF.format(cal.getTime());
  String jam = jamF.format(cal.getTime());
  String[]makanan={"Soto Ayam  ","Soto Daging","Rujak Cingur","Gado-gado  ","Pangsit Ayam"};
  int[]harga={10000,15000,10000,9000,7000};
  String nota="";
  int subtotal=0;
  int total=0;
  int bayar=0 ;
  int kembalian=0 ;
  System.out.println();
  System.out.println("\"Daftar Menu Makanan\"");
  System.out.println();
  System.out.println("Makanan \t\t\tHarga");
  System.out.println();
  
  for(int i=0; i<makanan.length;i++){
   System.out.println((i+1) + "." + makanan[i]+"\t\t"+harga[i]);
  }
  String jawab="y";
  while(jawab.equalsIgnoreCase("y")){
   System.out.println();
    System.out.print("Masukkan pilihan : ");
    int pilih=sc.nextInt();
    System.out.println();
    System.out.println(makanan[pilih-1]);
    System.out.println();
    
    System.out.print("Masukkan Jumlah Pesanan : ");
    int a=sc.nextInt();
    System.out.println("Harga : "+harga[pilih-1]);
    subtotal=harga[pilih-1]*a;
    System.out.println("Bayar : "+subtotal);
    System.out.println();
    
    nota+=makanan[pilih-1]+"\t\t"+a+" Porsi\t\t"+harga[pilih-1]+"\t\t"+subtotal+"\n-----------------------------------------------------------------\n";
    total+=subtotal;
    System.out.println("Pesan lagi?[Y/N]");
    jawab=sc.next(); 
    System.out.println();
  }
  System.out.println("Total bayar : "+total);
  while(bayar<total){
  System.out.print("Tunai : ");
  bayar=sc.nextInt();
  if (bayar>total){
    kembalian=bayar-total;
    System.out.println("Kembalian : "+kembalian);
  }else{
    System.out.println("Pembayaran kurang");
  }
  }
  
    System.out.println("=================================================================");
    System.out.println("\t\tNota");
    System.out.println("=================================================================");
    System.out.println("TANGGAL : "+tgl+"\t"+"JAM : "+jam);
    System.out.println("=================================================================");
    System.out.println("MENU \t\t\tJUMLAH \t\t HARGA \t\t SUBTOTAL");
    System.out.println("-----------------------------------------------------------------");
    System.out.println(nota);
    System.out.println("=================================================================");
    System.out.println("Total bayar : "+total);
    System.out.println("Tunai : "+bayar);
    System.out.println("Kembalian : "+kembalian);
    System.out.println("=================================================================");
    System.out.println("Terima Kasih atas kunjungan anda");
  
 }
}