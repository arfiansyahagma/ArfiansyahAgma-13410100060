public class SimpleSearch01{
  public static String daftarNim[]={"08410100375",
    "10410100146",
    "10410100162",
    "11410100142",
    "12410100049",
    "12410100070",
    "12410100088",
    "12410100131",
    "12410100159",
    "12410100160",
    "13410100006",
    "13410100007",
    "13410100048",
    "13410100049",
    "13410100058",
    "13410100060",
    "13410100061",
    "13410100069",
    "13410100083",
    "13410100153",
    "13410100155",
    "13410100157",
    "13410100180",
    "13410100190",
    "13410100192",
    "13410100200",
    "13410100206",
    "13410100216",
    "14410100170",
    "14410100172",
    "14410100173",
    "14410100174",
    "14410100175",
    "14410100176",
    "14410100177",
    "14410100178",
    "14410100179",
    "14410100181",
    "14410100182"};
  public static String []daftarNama = {
    "Purwanto",
"Noer Hidayat",
"Sandy Perdana",
"Himawan Pradipta Utama",
"Sujatmiko Hadinugroho",
"Denny Kusuma",
"Mochammad Afri Fitriansyah",
"Pradita Satria Prima",
"Fajriyan Nurli",
"Hazvi Fahlevi",
"Nico Stephanus Kuncoro",
"Ramdhani Kurniawan",
"Alanvianto Mukti Tamtomo",
"Satryo Widodo",
"Khamim Ahsanu Amala",
"Arfiansyah Agma",
"Candra Dwi Prasetya",
"Mohammad Rangga Nurcahyo",
"Raymond Andreas Soebijantoro",
"Dwiki Rizwan Nizar",
"Anggy Pranindya Sudarmadji",
"Wahyu Alfiyanda",
"Rayana Suryatama",
"Bryan Asril Zani",
"Eko Amiyantho",
"Kristin Lebdaningrum",
"RB. Nuriana Alim Putra",
"Sabdo Wicaksono Putra",
"Rizky Akbar",
"Abdul Haris",
"Ach Nofal Kurniawan",
"Andri Anggara",
"Auda Rizqi Aulany",
"Noppy Wahyono Suwoto",
"Arya Teja",
"Nuari Imas Masita",
"Afif Lutfian Fahmi Chudlori",
"Novita Perdani",
    "Dheta Amelya Kurniawendy"};

    
  public static int cariByNim(String nim){
   //tuliskan algoritma anda di sini
    int idx=-1 ;
    int i=0;
    do{
      if(nim.equals(daftarNim[i]))
        idx=i;
    }while((idx==-1)&&(i<daftarNim.length)) ;
    return idx;
  }
  public static int cariByNama(String nim){
   //tuliskan algoritma anda di sini 
    int idx=-1;
    return idx;
  }
  //public []String filterPerAngkatan(String angkatan){
  
  //}
  public String filterNama(String nama){
   //hitung jumlah data yang mengandung kata nama
    int counter=0 ;
    for(int i=0;i<daftarNama.length; i++) {
      if(daftarNama[i].contains(nama))
        arr(counter)=daftarNama[i] ;
        counter++;
    }
    //buat array of string dengan panjang jumlah data pada langkah 1
    String []arr=new String(counter);
    //lakukan looping lagi untuk mengecek
    counter=0;
     for(int i=0;i<daftarNama.length; i++) {
       //jika mengandung nama yang dicari maka isikan ke array pada langkah 1
       if(daftarNama[i].contains(nama)){
        counter++;
       }
  }
     //return array of string
     return arr;
  }
  }

  public static void main(String []str){
    String nim="13410100060" ;
    int hasilCari = cariByNim(nim) ;
    if(hasilCari==-1)
      System.out.println("Nim : "+nim+ "Tidak Ditemukan !") ;
    else
      System.out.println("Nim "+ nim + " ada pada index= "+hasilCari) ;
  }
}