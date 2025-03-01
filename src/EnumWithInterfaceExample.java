interface Printable {
    void print();
}

enum Color implements Printable {
  RED, GREEN, BLUE;

  @Override
  public void print() {
    System.out.println("Printable interface implemented by Color: " + this.name());
  }
}

public class EnumWithInterfaceExample {
    public static void main(String[] args) {
      Color.RED.print();
      Color.GREEN.print();
      Color.BLUE.print();
}

}
