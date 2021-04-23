import java.util.Scanner;

public class Task5 {
  public static void main(String []args) {
    int  i, j, temp;
    Scanner input = new Scanner(System.in);   
 
    int array[] = new int[5];  
 
    for (i = 0; i <5; i++){ 
      System.out.println("please enter a number ");
      array[i] = input.nextInt();
    }
 
    for (i = 0; i < ( 5 - 1 ); i++) {
      for (j = 0; j < 5 - i - 1; j++) {
        if (array[j] < array[j+1]) 
        {
          temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
 
    System.out.println("Sorted list of integers:");
 
    for (i = 0; i < 5; i++) 
      System.out.println(array[i]);
  } 
}

