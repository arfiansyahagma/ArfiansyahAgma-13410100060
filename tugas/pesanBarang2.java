import java.util.*;
public class pesanBarang2 {
 public static void main (String[]args){
 int [][]databrg = {{12,10,10,5},
     {3,5,8,9},
     {15,10,6,2},
     {13,8,7,4},
     {19,5,5,11},
     {20,4,4,8},
     {6,12,12,10}};
 String [] hari= {"Senin ","Selasa","Rabu  ","Kamis ","Jumat ","Sabtu ","Minggu"};
 String [] barang= {"Pensil","       Penggaris","       Penghapus","        Bolpoin","                    Omset"};
 int omset=0;
 int omset1=0;
 int omset2=0;
 int omset3=0;
 int omset4=0;
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("                       Toko \"Toya\"                            ");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Harga perBarang  :                               ");
    System.out.println("1. Pensil = Rp.1500,-                  ");
    System.out.println("2. Penggaris = Rp.3000,-              ");
    System.out.println("3. Penghapus = Rp.2000,-             ");
    System.out.println("4. Bolpoin = Rp.2500,-             ");
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("");
    System.out.println("===========================================================================================");
 
 System.out.print("Barang/Hari"+"\t");
 
 for (int a=0; a<barang.length; a++) {
 System.out.print(barang[a] + "\t");
 }
 System.out.println("");
 for (int i=0; i<hari.length; i++){
 System.out.print(hari[i] + "\t" + "\t");
 for (int j=0; j<databrg[i].length; j++){
 System.out.print(databrg[i][j] + "\t" + "\t");
 omset+=databrg[i][j];
 }
 System.out.print( "\t"+omset );
 omset=0;
 System.out.println();
 }
 for (int b=0; b<databrg.length; b++){
 omset1+=databrg[b][0];
 omset2+=databrg[b][1];
 omset3+=databrg[b][2];
 omset4+=databrg[b][3];
 }
 System.out.print("Total" + "\t\t"+ omset1 + "\t\t" + omset2 + "\t\t" + omset3 + "\t\t" + omset4 );
  System.out.println(" ");
    System.out.println("=================================================================================================");
 
 System.out.println(" ");
    
    String [] namabarang = {"Pensil" , "Penggaris" , "Penghapus" , "Bolpoin"};
    int [] harga = {1500 , 3000 , 2000 , 2500};
    Scanner sc = new Scanner (System.in);
    int omset5 [] = new int [namabarang.length];
    int barangterlaris [] = new int [namabarang.length];
    int totalperhari [] = new int [namabarang.length];
    int totalperminggu [] = {0,0,0,0,0,0,0};
    int harian=0;
    int totalakhir=0;
    int banyak=0;
    int sedikit=0;
    int rata=0;
    int ratatot=0;
    int total [] = {0,0,0,0,0,0,0};
  
  
    for(int a=0;a<hari.length;a++)
    {
      //Looping Hari Senin-Minggu
      System.out.println("Hari "+hari[a]);
       for(int b=0;b<namabarang.length;b++)
       {
         //Looping Nama Barang
         System.out.print("Masukkan jumlah " +namabarang[b]+ " yang terjual : " + " ");
          barangterlaris [b] = sc.nextInt();
          //Mencari barang terlaris dan tidak laris
          if (barangterlaris[banyak]>barangterlaris[b]);
          {
            banyak=banyak;
          }
          if (barangterlaris[b]>barangterlaris[banyak]){
            banyak=b;
          }
           if (barangterlaris[sedikit]<barangterlaris[b]);
          {
            sedikit=sedikit;
          }
          if (barangterlaris[b]<barangterlaris[sedikit]){
            sedikit=b;
          }
          totalperhari[b] = barangterlaris[b]*harga[b];
          harian+=totalperhari[b];
       }
          total[a]+=harian;
          totalperminggu[a]+=total[a];
          totalakhir+=totalperminggu[a];
          ratatot = totalakhir/7;
    rata    = harian / 4;
    System.out.println(" ");
    System.out.println("============================================================================================");
          System.out.println("Produk paling laris terjual di hari " +hari[a]+ " : " +namabarang[banyak] );
          System.out.println("Produk paling tidak laris terjual di hari " +hari[a]+ " : " +namabarang[sedikit]);
          System.out.println("Rata - rata penjualan produk di hari " +hari[a]+ " : " +"Rp."+rata);
          banyak=0;
          sedikit=0;
          System.out.println("Omset Per hari " +hari[a]+ " : " +"Rp."+total[a]);
          harian=0;
    System.out.println("============================================================================================");
          System.out.println("\n");
    }     
    
    System.out.println("   Total pendapatan selama seminggu "+"Rp." +totalakhir+                 "");
    System.out.println("   Rata - rata pendapatan selama seminggu "+"Rp." +ratatot+                 "");
    System.out.println("====================================================================");
 }
}