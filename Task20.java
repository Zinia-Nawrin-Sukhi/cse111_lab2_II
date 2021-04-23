import java.util.Scanner;
public class Task20
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    
    
    
    System.out.println("please enter a number");
  int n=sc.nextInt();
  if(n<10)
  {
    
    
      String[]arrayString={"zero","one","two","three","four","five","six","seven","eight","nine"};
  
      for(int i=0;i<arrayString.length;i++)
      {
        if(n==i)
        {
          System.out.println(arrayString[i]);
       
      }
      }
    }
  }
}