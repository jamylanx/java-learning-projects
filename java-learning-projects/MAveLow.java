import java.util.Scanner;

public class MAveLow {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] grades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        double ave = average(grades);

        System.out.println("The Grades are: ");
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + ":" + grades[i]);
            sum = sum + grades[i];
        }

        System.out.println("The Class Average is: " + ave);
        System.out.println("The Lowest grade is: " + min(grades));

    }

    public static double average(int[] grades) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += grades[i];
        }

        return (double) sum / 10;
    }

    // Lowest

    public static int min(int[] grades) {
        int temp1 = grades[0];
        for (int i = 0; i < 10; i++) {
            if (temp1 > grades[i]) {
                temp1 = grades[i];
            }
        }
        return temp1;
    }
}
