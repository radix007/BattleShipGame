import java.io.*;

abstract class car{
abstract void stroke();



}

class maruti extends car {
  void stroke(){System.out.println("Hello");
}
}

class ks {
  public static void main(String[] args) {
    maruti obj = new maruti();
    obj.stroke();
  }
}
