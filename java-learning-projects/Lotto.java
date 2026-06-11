import java.util.*;
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		char input;

		do{
        System.out.println(".");
        System.out.println("\t<==============================>");
		System.out.println("\tWelcome to Lotto Combinations!");
		System.out.println("\t<==============================>");
		System.out.println("\tVersion 2K24 edition 1 by S.B.M");
		System.out.println("\t<=============================>");
		System.out.println("\tPlease choose you Lotto Combinations");
		System.out.println("\t<=============================>");
		System.out.println("\t1: 2 Digit Lotto Combinations");
		System.out.println("\t2: 3 Digit Lotto Combinations");
		System.out.println("\t3: 4 Digit Lotto Combinations");
		System.out.println("\t4: 6/45 Digit Lotto Combinations");
		System.out.println("\t5: 6/49 Digit Lotto Combinations");
		System.out.println("\t6: EXIT ");
		System.out.println("\t\tChoose your option(1-6)");

		int option = s.nextInt();

		switch(option)
		{

		case 1:
			rand2D();
			break;

		case 2:
			rand3D();
			break;

		case 3:
			rand4D();
			break;

		case 4:
			rand645D();
			break;

		case 5:
			rand649D();
			break;

        case 6 :
		    System.out.println("\nThank you for using the Program");
		    System.exit(0);
		    break;

		default :
			System.out.println("\nInvalid output.Try again!");
			break;
		}
		System.out.println("\nDo you want to give it another try? Input [y/n]: ");
		input = s.next().charAt(0);

		s.nextLine();
	}
	while(input == 'Y' || input == 'y');
	System.out.println("Thank you for using the Program");
}
public static void rand2D()
{
	Random rand = new Random();
	int [] n = new int[2];
	for (int i = 0; i < n.length; i++) {
		n[i] = rand.nextInt(10);
	}
	System.out.println(" Lotto Combination for 2 Digits>>"+ Arrays.toString(n));
}
public static void rand3D()
{
	Random rand = new Random();
	int [] n = new int[3];
	for (int i = 0; i < n.length; i++) {
		n[i] = rand.nextInt(10);
	}
	System.out.println(" Lotto Combination for 3 Digits>>"+ Arrays.toString(n));
}
public static void rand4D()
{
	Random rand = new Random();
	int [] n = new int[4];
	for (int i = 0; i < n.length; i++) {
		n[i] = rand.nextInt(10);
	}
	System.out.println(" Lotto Combination for 4 Digits>>"+ Arrays.toString(n));
}
public static void rand645D()
{
	Random rand = new Random();
	int [] n = new int[6];
	for (int i = 0; i < n.length; i++) {
		n[i] = rand.nextInt(45);
	}
	System.out.println(" Lotto Combination for 6/45 Digits>>"+ Arrays.toString(n));
}
public static void rand649D()
{
	Random rand = new Random();
	int [] n = new int[6];
	for (int i = 0; i < n.length; i++) {
		n[i] = rand.nextInt(49);
	}
	System.out.println(" Lotto Combination for 6/49 Digits>>"+ Arrays.toString(n));
 }
}