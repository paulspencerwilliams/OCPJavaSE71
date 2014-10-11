public class AssertionTwist {
  public static void main(String args[]) {
    evenOdd(-11);
  }
  static void evenOdd(int num) {
    if (num%2 == 0)
      System.out.println("Even");
    else if (num%2 == 1)
      System.out.println("Odd");
    else {
      System.out.println(num%2);
      assert false : new Person();
    } }
}
