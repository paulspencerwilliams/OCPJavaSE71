class Outer
{
  protected String name;

  public  Outer (String name)
  {
    this.name = name;
  }
  void sayHello (){
    class Inner {
      void reallySayIt () {
        System.out.println(name);
      }
    }
    new Inner().reallySayIt();
  }

  public static void main (String[] args)
  {
    new Outer("fred").sayHello();
  }
}
