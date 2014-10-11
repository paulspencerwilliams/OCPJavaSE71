public class ThrowRunTimeException 
{
  public void doSomething() throws RuntimeException, java.io.FileNotFoundException 
  {
  }

  public void doSomethingElse ()
  {
    try {
      doSomething();
    } catch (java.io.FileNotFoundException|ArithmeticException ex) {}
  }
}
