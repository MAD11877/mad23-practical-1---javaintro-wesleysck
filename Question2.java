import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    
    Scanner height = new Scanner(System.in);
    System.out.print("");  
    double h = height.nextDouble();
    
    Scanner weight = new Scanner(System.in);
    System.out.print("");  
    double w = weight.nextDouble();

    double bmi = w / (h * h);
    
    System.out.print("");  
  }
}
