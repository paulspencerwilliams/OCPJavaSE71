public class Parcel<Pi> implements Sendable<Pi> {
  private Pi contents;

  public Parcel (Pi contents) {
    this.contents = contents;
  }
}
