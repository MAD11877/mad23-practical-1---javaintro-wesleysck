import java.util.Scanner;

public class Question5
{
  public static void main(String[] args) {
  

    Scanner scanner = new Scanner(System.in);

    int num;
    int input;

    System.out.print("");
    num = scanner.nextInt();

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      System.out.print("");
      input = scanner.nextInt();
      list.add(input);
    }

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < list.size(); i++) {
      if (map.containsKey(list.get(i)) == false) {
        map.put(list.get(i), 1);
      }

      else {
        map.put(list.get(i), (map.get(list.get(i)) + 1));
      }
    }

    int maxval = (Collections.max(map.values()));

    for (Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == maxval) {
        System.out.println(entry.getKey());
      }
    }

  }
}
