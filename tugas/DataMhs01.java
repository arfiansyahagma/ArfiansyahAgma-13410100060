import java.util.*;
public class DataMhs01 {
  public static String cariByNim(String nim) {
    for(int i=0;i<dMhs.length;i++) {
      if(dMhs[i][0].equals(nim))
        return dMhs[i][0]+"\t"+dMhs[i][1];
    }
    return"";
  }
  public static String filterByNama(String nama) {
    for(int i=0;i<dMhs.length;i++){
      if(dMhs[i][1].toLowerCase().contains(nama.toLowerCase()))
        return dMhs[i][0]+"\t"+dMhs[i][1] ;
    }
    return"";
  }
  public static String filterPerAngkatan(String angkatan) {
    for(int i=0;i<dMhs.length;i++) {
      if(dMhs[i][0].substring(0,2).equals(angkatan))
        return dMhs[i][0]+"\t"+dMhs[i][1] ;
    }
    return"";
  }
  public static String[][]dMhs={
   {"08410100375","Purwanto"},
  {"10410100146","Noer Hidayat"},
  {"10410100162","Sandy Perdana"},
  {"11410100142","Himawan Pradipta Utama"},
  {"12410100049","Sujatmiko Hadinugroho"},
  {"12410100070","Denny Kusuma"},
  {"12410100088","Mochammad Afri Fitriansyah"},
  {"12410100131","Pradita Satria Prima"},
  {"12410100159","Fajriyan Nurli"},
  {"12410100160","Hazvi Fahlevi"},
  {"13410100006","Nico Stephanus Kuncoro"},
  {"13410100007","Ramdhani Kurniawan"},
  {"13410100048","Alanvianto Mukti Tamtomo"},
  {"13410100049","Satryo Widodo"},
  {"13410100058","Khamim Ahsanu Amala"},
  {"13410100060","Arfiansyah Agma"},
  {"13410100061","Candra Dwi Prasetya"},
  {"13410100069","Mohammad Rangga Nurcahyo"},
  {"13410100083","Raymond Andreas Soebijantoro"},
  {"13410100153","Dwiki Rizwan Nizar"},
  {"13410100155","Anggy Pranindya Sudarmadji"},
  {"13410100157","Wahyu Alfiyanda"},
  {"13410100180","Rayana Suryatama"},
  {"13410100190","Bryan Asril Zani"},
  {"13410100192","Eko Amiyantho"},
  {"13410100200","Kristin Lebdaningrum"},
  {"13410100206","RB. Nuriana Alim Putra"},
  {"13410100216","Sabdo Wicaksono Putra"},
  {"14410100170","Rizky Akbar"},
  {"14410100172","Abdul Haris"},
  {"14410100173","Ach Nofal Kurniawan"},
  {"14410100174","Andri Anggara"},
  {"14410100175","Auda Rizqi Aulany"},
  {"14410100176","Noppy Wahyono Suwoto"},
  {"14410100177","Arya Teja"},
  {"14410100178","Nuari Imas Masita"},
  {"14410100179","Afif Lutfian Fahmi Chudlori"},
  {"14410100181","Novita Perdani"},
  {"14410100182","Dheta Amelya Kurniawendy"}} ;
}