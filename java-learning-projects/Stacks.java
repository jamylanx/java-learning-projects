import java.util.Scanner;
import java.util.Stack;

public class Stacks{
	public static void main(String []args){

	Scanner scanner = new Scanner(System.in);
	Stack<Integer> stack = new Stack<>();

	while (true) {
	System.out.println("Enter a command (push, pop, peek, or exit): ");
	String command = scanner.next();

	if(command.equalsIgnoreCase("push")){
		System.out.println("Enter an integer to push onto the stack:");
		int num = scanner.nextInt();
		stack.push(num);
	}else if (command.equalsIgnoreCase("pop")){
		if(stack.isEmpty()){
		System.out.println("The stack is empty.");
		}else{
			int num = stack.pop();
			System.out.println("Popped: " + num);
		}
	}else if(command.equalsIgnoreCase("peek")){
		if(stack.isEmpty()){
		System.out.println("The stack is empty.");
		}else{
		int num = stack.peek();
		System.out.println("Peek: " + num);
		}
		}else if (command.equalsIgnoreCase("exit")){
		System.exit(0);
		}else{
		System.out.println("Invalid command.");
		}
		}
		}
		}