import java.util.Scanner;
  public class Search{
    public static void main(String [] args){

    int [] list1 = new int [10];

    System.out.print("input number of items in the set: ");
    Scanner scnnr1 = new Scanner(System.in);
    int size = scnnr1.nextInt();
    putItems(list1, size);

    System.out.print("input item to search: ");
    int x = scnnr1.nextInt();
    int itemIndex = linearSearch(list1, size, x);

    if(itemIndex >= 0){
      System.out.println("Item is found at index" + itemIndex);
    }
    else
    {
    System.out.println("Item is not on the list!");
    }

     }

  public static void putItems(int [] a, int s) {
	  for(int i = 0; i < s; i++) {
		  System.out.print("Input item #" + (i + 1) + ": ");
		  Scanner scnnr2 = new Scanner(System.in);
		  int x = scnnr2.nextInt();
		  a[i] = x;
   }
}


  public static int linearSearch(int[] b, int s, int x){
	  for (int j = 0; j < s; j++) {
		  if (b[j] == x){
			  return j;

	   }
   }

       return -1;

     }
   }