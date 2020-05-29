public class LeapYear {
  static boolean isLeapYear(int year) {
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    boolean value = isLeapYear(2001);
    System.out.println(value);
  }
}
