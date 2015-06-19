import java.util.* ;
public class WhileDemo {
  public static void main(String []argc) {
    Scanner input = new Scanner(System.in) ;
    int jmlData=input.nextInt() ;
    int sum=0 ;
    int count=0 ;
    int max=0;
    int min=0;
    int a=0;
    double ratarata=0.0 ;
    while (count<jmlData) {
      a=input.nextInt() ;
      if(a>max)
      {
        max=a;
      }
      
        if(min==0)
        {
        min=a;
        }
        if(a<min)
        {
          min=a;
        }
      
      sum += a;
      count++ ;
    }
    ratarata = sum/(double)jmlData ;
    System.out.println("Sum = "+sum) ;
    System.out.println("Avg = "+ratarata) ;
    System.out.println("Max = "+max) ;
    System.out.println("Min = "+min) ;
  }
}