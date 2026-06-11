import java.util.*;

 public class AllMethod{
   public static void main(String[]args){

   Scanner input = new Scanner(System.in);

     System.out.print("How many entries would you like to accept: ");
     int num = input.nextInt();
     int [] values = new int[num];

     for (int i = 0; i<values.length; i++)
     {
       System.out.print("Enter values " + (i+1) + ":");
       values[i] = input.nextInt();
     }
//ORIGINAL LIST
     System.out.print("\nOriginal List: ");
      for (int i = 0; i<values.length; i++)
      {
		 System.out.println("Values " +i+ ": " + values[i]);
	  }

// SEARCH ITEM

     System.out.print("Enter item to search: ");
     int search = input.nextInt();
     int itemIndex = search(values, num, search);
     if(itemIndex >= 0){
		 System.out.println("Item is at index: " + itemIndex);
	 }
	 else{
		 System.out.println("Item is not found");
	 }

//REVERSE LIST
      System.out.print("Reverse List:\n");
      reverse(values);
      for(int i = 0; i<values.length; i++)
      {
         System.out.println("Values" +i+ ":" + values[i]);
      }


//SORTED LIST

             System.out.println("\nSorted is: ");
             sort(values, num);
             for(int i = 0; i < num-1; i++)
             {
				 System.out.print(values[i] + ",");
			 }
			     System.out.print(values[num - 1]);


//AVERAGE LIST

				double avg =  average(values);

				double sum = 0;
				for (int i = 0; i < values.length; i++){
					sum = sum + values[i];
				}
					System.out.println(" ");
					System.out.println("Average is: " + avg);

//LOWEST, HIGHEST

            System.out.println("Lowest of array: " + findMin(values));
            System.out.println("Highest of array: " + findMax(values));


//DOUBLE ENTRY

         int [] doubled = doble(values);
         System.out.println("\nDouble Entry: " + Arrays.toString(doubled));
//INCREASE ENTRY
         increase (values);
         System.out.println("Increase Entry: " + Arrays.toString(values));
	   }

//METHOD FOR REVERSE

         public static void reverse(int[] numbers)
         {
         for (int i = 0; i<numbers.length / 2; i++)
         {
         int temp = numbers[i];
         numbers[i] = numbers[numbers.length -1 -i];
         numbers[numbers.length -1-i] = temp;
     }
  }

 //METHOD FOR SORTING
 		public static void sort(int[] values, int numbers)
 	{
		for (int i = numbers-1; i >= 0; i--)
		{
			for(int j = 0; j <= i-1; j++)
			{
				if (values[j] > values[j+1])
				{
					int temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
				}
			}
		}
	}



  // METHOD FOR AVERAGE

         public static double average(int [] values){
            int sum = 0;
             for (int i = 0; i<values.length; i++)
             {
                sum = sum + values[i];
                }
                return (double) sum / values.length;
          }


  // METHOD FOR LOWEST

           public static int findMin(int[] values){
             int temp = values[0];
             for (int i = 0; i < values.length; i++)
             {
                 if (temp > values[i])
                 {
                     temp = values[i];
                     }
			  }
                   return temp;
     }
   // METHOD FOR HIGHEST

         public static int findMax(int [] values){
            int temp = values[0];
            for (int i = 0; i < values.length; i++){
                   if (temp < values[i]){
                       temp = values[i];
	                   }
				 }
                 return temp;
}

//SEARCH METHOD
       public static int search (int[] values, int num, int search){
		   for(int i = 0; i < num; i++){
			   if(values[i] == search){
				   return i;
			   }
		   }
		   return -1;
	   }
   //METHOD FOR DOUBLE ENTRY

              public static int [] doble (int [] values)
              {
                  int [] result = new int [2 * values.length];
                  for (int i = 0; i < values.length; i++)
                  {
                         result[2*i]  = values[i];
                         result[2*i+1] = values[i];
                      }
                         return result;
                  }

   //METHOD FOR INCREASE

               public static void increase(int[] values)
               {
                   for (int i = 0; i < values.length; i++)
                   {
                     values[i] = values[i]*2;
                 }
         }
  }
















































