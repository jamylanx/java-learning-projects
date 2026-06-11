import java.util.LinkedList;
import java.util.Scanner;

public class MenuLinkedList {
	private static void clearScreen(){
		try{
		final String os = System.getProperty("os.name");
			if(os.contains("Windows")){
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}else{
			System.out.print("\033[H\033[2J");
			System.out.flush();
			}
		} catch (final Exception e){
		System.out.println("Error." + e.getMessage());
	}
}
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("\nChoose an option you want:");
            System.out.println("1. Add element");
            System.out.println("2. Edit element");
            System.out.println("3. Delete element");
            System.out.println("4. Search element");
            System.out.println("5. Display elements");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an element to add:");
                    scanner.nextLine();
                    String addElement = scanner.nextLine();
                    myList.add(addElement);
                    clearScreen();
                    break;
                case 2:
                    System.out.println("Enter the index of the element to edit:");
                    int index = scanner.nextInt();
                    System.out.println("Enter the new element:");
                    scanner.nextLine();
                    String newElement = scanner.nextLine();
                    if (index >= 0 && index < myList.size()) {
                        myList.set(index, newElement);
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    clearScreen();
                    break;
              case 3:
                    System.out.println("Enter the element to delete:");
                    String deleteElement = scanner.next();
                    if (myList.remove(deleteElement)) {
                        System.out.println("Element deleted.");
                    } else {
                        System.out.println("Element not found.");
                    }
                     clearScreen();
                    break;
                case 4:

                    System.out.println("Enter the element to search:");
                    String searchElement = scanner.next();
                    clearScreen();
                    if (myList.contains(searchElement)) {
                        System.out.println("Element found.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 5:
                    System.out.println("Elements in the list:");
                    for (String s : myList) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
		}
	}
}
