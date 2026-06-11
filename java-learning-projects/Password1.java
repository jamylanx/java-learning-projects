import java.util.Scanner;
public class Password1{
public static void main(String[]args){

Scanner scnnr = new Scanner(System.in);
String PASSWORD = "DazzlerS";
String USERNAME = "MarionBeri";
int max_attempts = 3;
int attempts = 0;

while(attempts < max_attempts){
System.out.println("Enter username: ");
String username = scnnr.nextLine();
System.out.println("Enter password: ");
String password = scnnr.nextLine();

if(password.equals(PASSWORD) && username.equals(USERNAME)){
System.out.println("Kongwatz! logging in...");
System.exit(0);
}

else{
     attempts++;
      int attemptsleft = max_attempts - attempts;
	System.out.println("Incorrect! " + attemptsleft + " attempt(s)left.");
	}
	}
	System.out.println("Maximum attempts reached. Exiting... ");
	System.exit(1);
	}
	}