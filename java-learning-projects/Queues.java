import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queues{

public static void main(String [] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the size of the queue: ");
int queueSize = scanner.nextInt();

Queue<Integer> queue = new ArrayDeque<>(queueSize);

for(int i = 0; i < queueSize; i++){
	System.out.print("Enter an integer to add to the queue: ");
	int num = scanner.nextInt();

	queue.offer(num);

	System.out.println("Enqueued: " + num + ", Queue: " + queue);
	}

	while(!queue.isEmpty()){
	System.out.println("Dequeued: " + queue.poll() + ", Remaining Queue: " + queue);
	}

	scanner.close();
	}
	}