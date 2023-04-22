import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    int start = 0;
    Scanner integer = new Scanner(System.in);
    System.out.print("");
    int num = integer.nextInt();

    while (start++ < num){
      for(int i = num; i > (start - 1); i--) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
    
}
