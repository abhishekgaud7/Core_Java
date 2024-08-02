public class power2 {
  public static void main(String[] args) {

    int n = 3;
    int x = 4;

    int sum = 1;

    for (; x != 0; --x) {
      sum *= n;
    }

    System.out.println("Answer = " + sum);
  }
}
