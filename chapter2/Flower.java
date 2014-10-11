class Flower {
  String color = "red";
  Petal[] petals;
  private class Petal {
    public Petal() {System.out.println(color);}
    String color = "purple";
    static final int count = 3;
  }
  
  Flower() {
    petals = new Petal[2];
    petals[0] = new Petal();
  }

  public static void main(String args[]) {
    new Flower();
  }
}
