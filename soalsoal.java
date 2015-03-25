import java.util.*;
public class soalsoal{
  public static void main (String []args){
    Scanner sc=new Scanner (System.in);
    System.out.println ("Masukan jumlah soal :");
    int soal=sc.nextInt();
    int j=1;
    int nilai=0 ;
    String output="";
    String status="";
    System.out.println ("Jawablah soal ini dengan benar");
    System.out.println ("No. \tSoal \tJawaban"); 
   
    while(j<soal+1){
    int a=(int)(Math.random()*20);
    int b=(int)(Math.random()*10);
    int kunci=a+b;
   
    System.out.print (j+").\t"+a+"+"+b+"=");
    int jawab=sc.nextInt();
    if (jawab==kunci){
    status="Benar";
    nilai+=10 ;
    }else{
    status="Salah";
    }

    output +="\n"+j+").\t"+jawab+"\t"+kunci+"\t"+status;
   j++;
    }
    System.out.println ("Hasil kuis anda:");  
    System.out.println ("\nNo."+"\tJawaban"+"\tKunci"+"\tStatus");
    System.out.println (output);  
    System.out.println ("Nilai : " + nilai/soal*10);
}
}