enum Sizes {
  SMALL, MEDIUM, LARGE;
  static{ System.out.println("static init block"); }
  Sizes(){
    System.out.println("constructor");
  }
  public static void main(String... args){
    System.out.println(Sizes.SMALL);
  }
}


