package library;

public class CourseBook extends Book {
  public CourseBook () {
    System.out.println("Course book");
  }

  public static void main (String args[])
  {
    new CourseBook ();
    ITalking t = (ITalking) new CourseBook ();
  }
}
