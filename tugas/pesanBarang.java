import java.util.*;
class pesanBarang
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);  
  String Hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
  String Barang[] = {"Pensil", "Pulpen", "Buku", "Stabilo"};
  int Jumlah[][] = {
       {10,10,4,23,2,10,59},
       {5,8,4,3,12,11,43},
       {9,3,4,13,12,10,51},
       {14,10,4,3,1,10,42}
      };
  int Total[] = new int[7];
  System.out.print("Hari \t\t");
  //HARI
  for(int a = 0; a < Hari.length; a++)
  {
   System.out.print(Hari[a] + "\t");
  }
  System.out.print("Total");
  System.out.println();
  System.out.println("---------------------------------------------------------------------");
  //JUMLAH
  for(int b = 0; b < Barang.length; b++)
  { 
   System.out.print(Barang[b] + "\t\t");
    for(int c = 0; c < Jumlah[b].length; c++)
    {
     System.out.print(Jumlah[b][c] + "\t");
     //int Total += Jumlah[b][0];
    }
     System.out.println();
  }
   System.out.println("---------------------------------------------------------------------");
   System.out.print("Total Per Hari\t");
   
   for (int i = 0; i < Jumlah[0].length; i++){
        int total = 0;

        for (int j = 0; j < Jumlah.length; j++){
            total += Jumlah[j][i];

        }
        System.out.print(total+"\t");

    }
   
   
 }
}