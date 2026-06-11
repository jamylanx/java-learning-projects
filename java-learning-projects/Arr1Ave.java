import java.util.Scanner;
 public class ArrAve{
  public static void main (String [] args){

  int [] grades = {87,68,94,100,83,78,85,91,76,87};

  System.out.println("Welcome to the grade book for CS101 Introduction to Java Programming");
  System.out.println("the grades are; ");

  float Total = 0;
  for (int i = 0; i<10; i++) {
     System.out.println("Student " +i+ ":" +grades[i]);
     Total = Total + grades[i];
     }
System.out.println("Class Average is: " + Total/10);
    }
}

