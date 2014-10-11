import java.io.*;
class TwistThrowsException {
  public void readFile(String file) throws FileNotFoundException {
    System.out.println("readFile");
    throw new FileNotFoundException();
  }
  void useReadFile(String name) throws FileNotFoundException {
    System.out.println("useReadFile");
    try {
      readFile(name);
    }
    catch (FileNotFoundException e) {

    } }
    public static void main(String args[]) {
      new TwistThrowsException().useReadFile("a");
    } }
