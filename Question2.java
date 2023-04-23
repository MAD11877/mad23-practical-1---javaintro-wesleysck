import java.util.Scanner;


public class Question2
{
  
  public static void main(String[] args)
  {
    
    Scanner scanner = new Scanner(System.in);
    
    double weight;
    double height;

    System.out.println("");
    weight = scanner.nextDouble();

    System.out.println("");
    height = scanner.nextDouble();

    double bmi = (weight / (height * height));
    
    System.out.print(bmi);  
  }
}
