import java.util.Scanner;
public class RevString1{
public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  System.out.println("Enter a Word/Sentence: " );
  String word = input.nextLine();
  String REVERSE = reverse(word);
  System.out.println(REVERSE);
  }

  public static String reverse(String word){
  char[]letters = new char[word.length()];
  int letterIndex = 0;
  for(int i = word.length()-1; i >= 0; i--){
  letters [letterIndex] = word.charAt(i);
  letterIndex++;
  }

  String reverse = " ";
  for (int i = 0; i < word.length(); i++){
  reverse = reverse + letters[i];
  }

  return reverse;

  }
}

