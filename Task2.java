import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int index=0; index<a.length; index++){
    System.out.println("Please enter a number");
    a[index]=sc.nextInt();
  }
  for(int index=0; index<a.length; index++)
  {
    System.out.println(a[index]);
  }
  }
}