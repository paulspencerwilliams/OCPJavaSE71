public class Book extends Gift
{
  private int price;
  public Book (int price) {
    this.price = price;;
  }

  @Override
  public int getPrice (){
    return price;
  }
  
}
