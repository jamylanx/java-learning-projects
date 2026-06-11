import java.util.Scanner;
    public class BubbleSort{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int araySize,temp1, i;

        System.out.print("Enter the number of array you want to enter: ");
        araySize = input.nextInt();
        int [] sort = new int[araySize];
        System.out.println("Enter " + araySize + " Array elements ");
        for( i = 0; i<araySize; i++);{
		   sort[i] = input.nextInt();
	}

	System.out.print("Original list : ");
	for( i = 0; i < araySize-1; i++)
	{
		System.out.print(sort[i] + ", ");
	}
	System.out.println(sort[araySize-1]);

	for( i=0; i < araySize-1; i++){
		for(int j = 0; j <araySize-1; j++){
			if(sort[j] > sort[j+1]){
				temp1 = sort[j];
				sort[j] = sort[j+1];
				sort[j+1] = temp1;
			}
		}
	}

	System.out.print("Sorted list : ");
	for( i = 0; i < sort.length-1; i++){
		System.out.print(sort[i] + " ,");
	}
	System.out.println(sort[araySize-1]);
	}
}