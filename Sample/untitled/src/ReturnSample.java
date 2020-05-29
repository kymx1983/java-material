public class ReturnSample {

  static int triangleSample(int bottom, int height) {
    return bottom * height / 2;
  }

  public static void main(String[] args) {
    int value = triangleSample(10, 20);
    System.out.println(value);
  }
}
