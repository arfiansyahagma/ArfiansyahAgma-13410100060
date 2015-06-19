public class ArrayNxMO1B {
  public static void main(String []argc) {
    //mendeklarasikan array 2 dimensi dengan baris = 3
    int [][]m=new int[3][] ;
    //setiap baris berisi 3 kolom
    m[0]=new int[2] ;
    m[1]=new int[4] ;
    m[2]=new int[3] ;
    m[0][0]=5 ;
    m[1][3]=5 ;
    m[2][2]=5 ;
    //looping baris
    for (int i=0; i<m.length; i++) {
      //looping kolom
      for(int j=0; j<m[i].length; j++) {
        System.out.print(m[i][j]+"") ;
      }
      System.out.println() ;
    }
  }
}