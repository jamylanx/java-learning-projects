import java.util.*;
  public class InsertionSort{
    public static void main(String[]args){

        Scanner scnnr = new Scanner(System.in);

           System.out.print("Enter how many numbers you want to enter: ");

              int entries = scnnr.nextInt();
              int[] data = new int [entries];
              for (int i=0; i<data.length; i++);
            {
                System.out.print("Enter no." + (i+1) + ": ");

              data[i] = scnnr.nextInt();
		    }
              System.out.println("Sorted array: ");
              insertionSort(data);
              for(int i=0; i<entries-1; i++)
              {
				System.out.print(data[i] + " ");
			  }
			    System.out.println(data[entries-1]);
		      }
			   	public static void insertionSort(int[] arr)
			  {
				  int n = arr.length;
				    for(int i = 1; i < n; i++)
				    {
					  int key = arr[i];
					  int j = i - 1;

					  while(j >= 0 && arr[j] > key)
					   {
						   arr[j + 1] = arr[j];
						   j--;
				       }

                  arr[j + 1] = key;
	   }
    }
}
