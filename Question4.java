import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    int start = 0;
    Scanner integer = new Scanner(System.in);
    System.out.print("");
    int num = integer.nextInt();

    while (start++ < num){
      for(int i = 1; i < (start + 1); i++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
}
