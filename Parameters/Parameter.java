public class Parameter {
  static void myParam(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myParam("shetty", 5);
    myParam("Pratheeka", 8);
    myParam("Anja", 31);
  }
}