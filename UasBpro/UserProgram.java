import java.util.*;
public class UserProgram
{
 private String userName;
 private String password;
 private String type;
 private static Scanner Scn=new Scanner (System.in);
 
 public UserProgram(String userName, String password, String type)
 {
  this.userName = userName;
  this.password = password;
  this.type = type;
 }
 
 public String getUserName()
 {
  return userName;
 }
 
 public String getPassword()
 {
  return password;
 }
 
 public String getType()
 {
  return type;
 }
 
 public boolean cekType(String tipe)
 {
  return (tipe.equalsIgnoreCase(type));
 }
 
 public boolean checkPassUser(String user, String pass, String tipe)
 {
  return (user.equals(userName) && (pass.equals(password)) &&  (tipe.equalsIgnoreCase(type)));
 }
 
 public void setPassword(String pass)
 {
  password = pass;
 }
 
  public static void addUser(Vector <UserProgram> usr) // Tambah User
 {
  System.out.println("     Tambah User Baru     ");
  System.out.print("Masukkan Username Baru \t : ");
  String userName = Scn.next();
  System.out.print("Masukkan Password \t : ");
  String password = Scn.next();
  System.out.print("Masukkan Tipe \t : ");
  String type = Scn.next();
  UserProgram userBaru = new UserProgram(userName, password, type);
  usr.add(userBaru);
 }
 
 public static void viewUser(Vector <UserProgram> usr) // Lihat Data User
 {
  System.out.println("No. Username\tPassword\tType");
  System.out.println("-------------------------------------");
  int i = 0;
  for(UserProgram vUser : usr)
  {
   System.out.println((i+1) + ".  " + vUser.getUserName() + "\t" + vUser.getPassword() + "\t\t" + vUser.getType());
   i++;
  }
  System.out.println("-------------------------------------");
 }
 
 public static void deleteUser(Vector <UserProgram> usr) // Hapus Data User
 {
  int idx = -1;
  int i = 0;
  System.out.println("     Hapus Data User     ");
  System.out.print("Masukkan Username yang akan dihapus \t: ");
  String userName = Scn.next();
  do
  {
   if(usr.elementAt(i).getUserName().equals(userName))
   {
    idx = i;
   }
   i++;
  }while((i < usr.size() && (idx == -1)));
  
  if(idx == -1)
  {
   System.out.println(userName + " Tidak ada ditemukan");
  }
  else
  {
   System.out.print("Apakah User " + userName + " akan dihapus (Y / T)");
   String Hapus = Scn.next();
   if(Hapus.equalsIgnoreCase("Y"))
   {
    usr.removeElementAt(idx);
    System.out.println("User " + userName + " Berhasil dihapus");
   }
  }
 }
 
 public static void changePass(Vector <UserProgram> usr)
 {
  int idx = -1;
  int i = 0;
  System.out.println("     Ganti Password User     ");
  System.out.print("Masukkan Username yang akan diubah \t: ");
  String usrName = Scn.next();
  do
  {
   if(usr.elementAt(i).getUserName().equals(usrName))
   {
    idx = i;
   }
   i++;
  }while((i <usr.size() && (idx == -1)));
  
  if(idx == -1)
  {
   System.out.println(usrName + " Tidak ada ditemukan");
  }
  else
  {
   System.out.print("Masukkan Password Baru : ");
   String newPass = Scn.next();
   usr.elementAt(idx).setPassword(newPass);
  }
 }
 
}