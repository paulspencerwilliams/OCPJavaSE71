public class JustOne {
  public <T,V> V print (T toPrint, V fred) {
    System.out.println(toPrint.toString());
    return null;
  }

  public static void main (String[] args) {
    String s = new JustOne().print("hello", new java.util.ArrayList());
  }
}
