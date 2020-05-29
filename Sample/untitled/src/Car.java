class Car {
  String carType;
  String carNumber;
  int fuel;

  void run(int distance) {
    int runDistance = fuel * distance;
    System.out.println(runDistance + "km走りました。");
  }

}
