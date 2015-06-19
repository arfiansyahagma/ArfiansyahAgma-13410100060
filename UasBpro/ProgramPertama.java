import java.util.* ;
public class ProgramPertama {
  public static Vector <UserProgram> username = new Vector <UserProgram>() ;
  public static Scanner sc=new Scanner (System.in) ;
  
  public static void main (String [] argc) {
    //Data Pertama
    username.add(new UserProgram("toya","123","admin")) ;
    username.add(new UserProgram("tooya","321","kasir")) ;
    int pil=0 ;
    do {
      System.out.println("===========================");
      System.out.println("  PROGRAM MANAGER Toko Elektronik");
      System.out.println("==========================");
      System.out.println("1. ADMIN");
      System.out.println("2. KASIR");
      System.out.println("3. KELUAR");
      System.out.print("Masukkan Pillihan Anda(1-3): ");
      pil=sc.nextInt();
      switch(pil){
        case 1: 
          String statusLgn="Admin";
             System.out.println ("");
             System.out.println ("======= LOGIN =======");
             System.out.print ("Input Username \t: ");
             String userLgn = sc.next();
             System.out.print ("Input Password \t: ");
             String passLgn = sc.next();
             System.out.println("======================") ;
             for (int i=0;i<username.size();i++){
                   if(username.elementAt(i).checkPassUser(userLgn, passLgn, statusLgn))
    {
      int urutan = username.indexOf(userLgn);
      String cek = statusLgn;
      
      if (cek.equalsIgnoreCase("admin")){
      AdminProgram.admin();
       }
       else if (cek.equalsIgnoreCase("kasir")) {
        System.out.print ("Login gagal ");
       }
                   }
             }
          break;
        case 2: 
           String statusLgn2="Kasir";
             System.out.println ("");
             System.out.println ("======= LOGIN =======");
             System.out.print ("Input Username \t: ");
             String userLgn2 = sc.next();
             System.out.print ("Input Password \t: ");
             String passLgn2 = sc.next();
             System.out.println("==========================");
             for (int i=0;i<username.size();i++){
                   if(username.elementAt(i).checkPassUser(userLgn2, passLgn2, statusLgn2))
    {
      int urutan = username.indexOf(userLgn2);
      String cek = statusLgn2;
      
      if (cek.equalsIgnoreCase("kasir")){
      AdminProgram.kasir();
       }
       else if (cek.equalsIgnoreCase("admin")) {
        System.out.print ("Login gagal ");
       }
                   }
             }
          break;
      }
    }while(pil<3) ;
  }
  
   public static void ManajemenUser() {
  boolean manajemenuser = false;
  do {
   System.out.println ("");
   System.out.println ("======= Manajemen User =======");
   System.out.println ("1. Menambah Data User");
   System.out.println ("2. Menghapus Data User");
   System.out.println ("3. Update User");
   System.out.println ("4. Menampilkan User");
   System.out.println ("5. Exit");
   System.out.print ("Pilih pilihan [1-4] : ");
   int piluser = sc.nextInt();
   int urutan=-1;
   
   if (piluser == 1){
    UserProgram.addUser(username);
   }
   
   if (piluser == 2){
     UserProgram.deleteUser(username);
   }
   
   if (piluser == 3){
   UserProgram.changePass(username);
   }
   
   if (piluser == 4){
    UserProgram.viewUser(username);
   }
   
   if (piluser == 5){
    manajemenuser = true;
   }
   
  } while (manajemenuser = false);
 }
}