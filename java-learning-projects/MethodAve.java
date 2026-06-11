import java.util.Scanner;
 public class MethodAve{
  public static void main (String [] args){


 Scanner input = new Scanner(System.in);

  int [] grades = {87,68,94,100,83,78,85,91,76,87};

  double ave = average (grades);

System.out.println("The grades of BSCS Students are: ");

 double sum = 0;
  for (int i = 0; i<10; i++) {

     System.out.println("Student " +i+ ":" +grades[i]);
     sum = sum + grades[i];
     }


System.out.println("Class Average is: " + ave);

}

// Method

public static double average (int []grades){

	int sum = 0;
	for (int i = 0; i < 10; i++) {

		sum += grades [i];
	}

	return (double) sum / 10;
 }

}

