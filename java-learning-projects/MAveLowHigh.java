import java.util.Scanner;
 public class MAveLowHigh{
  public static void main (String [] args){

// Average

  int [] grades = {87,68,94,100,83,78,85,91,76,87};

  System.out.println("Welcome to the grade book for CS101 Introduction to Java Programming");
  System.out.println("the grades are; ");

  float Total = 0;
  for (int i = 0; i<10; i++) {
     System.out.println("Student " +i+ ":" +grades[i]);
     Total = Total + grades[i];
     }

// Lowest


  int temp1 = grades[0];

     for (int i = 0; i<10; i++){
		 if(temp1>grades[i]){
			 temp1 = grades[i];

   }
}


// Highest

int temp2 = grades[0];

     for (int i = 0; i<10; i++){
		 if(temp2<grades[i]){
			 temp2 = grades[i];

   }
}

System.out.println("Class Average is: " + Total / 10);
System.out.println("Lowest grade is: " + temp1);
System.out.println("Highest grade is: " + temp2);

}



// Method

public static double average (int [] numbers){
	int sum = 0;
	for (int i = 0; i < numbers.length; i++) {

		sum += numbers[i];
	}

	return (double) sum / numbers.length;
 }
}
