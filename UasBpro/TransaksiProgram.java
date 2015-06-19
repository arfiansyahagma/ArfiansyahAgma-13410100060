import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.*;
import java.util.*;

public class TransaksiProgram{
 private static String id;
 public static String tglTr;
 public static String tglTr1;
 private static Vector <DTransaksi> detailTransaksi = new Vector<DTransaksi>();
 //constructor
 public TransaksiProgram(String id){
  this.id=id;
 }
  public String getId(){
  return id;
 }
 //method untuk menambah detail transaksi
 public static void tambahDtr(DTransaksi dtr){
  
 }
 
 
 public static double hitungTotal(double a, double b, double c){
 double total = a+b+c;
            return (total);
 }
 public void cetakTransaksi(){
  System.out.println("Toko Elektronik Murah Meriah");
  System.out.println("ID TR#: "+id+" Jam : "+tglTr1+" Tanggal : "+tglTr);
  System.out.println("-------------------------------------------");
  System.out.println("IDBarang \t Nama \t Harga \t Kuantiti \t Sub Total");
 }
}
  