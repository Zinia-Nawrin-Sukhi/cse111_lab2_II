import java.util.Scanner;
    public class Task3
    {
     public static void main(String[]args) 
     {
        Scanner sc=new Scanner(System.in);
     int a[]=new int[5];
     int max;
     int min;
     int index;
     for(index=0;index<a.length;index++)
            {
              System.out.println("please enter a number");
                a[index] = sc.nextInt();
            }
            max = a[0];
            min=a[0];
            int max_index=0;
            int min_index=0;
            for(  index=0; index <a.length; index++)
            {
              if(max < a[index])
                {
                max = a[index];
                max_index=index;
                }
             else
             {
               if(min>a[index])
               {
                 min=a[index];
                 min_index=index;
               }
             }
            }
            
                System.out.println("smallest number was"+" "+ min+ " "+"at location"+min_index); 
             System.out.println("largest number was"+" "+ max+ " "+"at location"+max_index); 
            

        }

    }