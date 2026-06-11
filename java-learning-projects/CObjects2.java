import java.util.*;
public class CObjects2{
public static void main(String [] args){

int length = 90;
int width = 120;
int area = 360;

Scanner console = new Scanner(System.in);

System.out.println("Enter length of the rectangle: ");
length = console.nextInt();

System.out.println("Enter width of the rectangle: ");
width = console.nextInt();

area = length*width;
System.out.println("The area of rectangle: " + area);

}
}