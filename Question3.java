import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner integer = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int i = integer.nextInt();

    int power = i * i;
    System.out.print(String.format("Number multiplied by itself is %s.", power));
  }
}
