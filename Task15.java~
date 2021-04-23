import java.util.Scanner;
    public class Task4
    {
      public static void main(String[] args) 
        {
            int  x;
            Scanner s = new Scanner(System.in);            
            int a[] = new int[5];          

            for (int i = 0; i < 5; i++) 
            {
              System.out.println("please enter a number");
                a[i] = s.nextInt();
            }

            for (int i = 0; i < 5; i++)
            {
              for (int j = i + 1; j < 5; j++)
                {
                if (a[i] > a[j]) 
                    {
                        x = a[i];
                        a[i] = a[j];
                        a[j] = x;
                }   
              }
            }            
            for (int i = 0; i < 5 - 1; i++) 
            {
              System.out.print(a[i] + ",");
            }
            System.out.print(a[5 - 1]);
        }
    }