public class Arr2Display{
  	public static void main(String[]args){

  		int[][] grades = {{87, 96, 70},{68, 87, 90},{94, 100, 90},{100, 81, 82},{83, 65, 85},{78, 87, 65},{85, 75, 83},{91, 94, 100},{76, 72, 84},{87, 93, 73}};

		for (int i=0; i<grades.length; i++)
 		{
			int sum = 0;
    	    for (int j=0; j<grades[i].length; j++)
    	    {
				sum += grades[i][j];
			}
			double average = sum / (double) grades[i].length;
			System.out.println("Student " + (i + 1) + " " + "Average: " + average);
		}
	}
}