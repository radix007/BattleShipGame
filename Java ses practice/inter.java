import java.io.*;

Interface A {
void abc();
int x = 2019;
}

Interface B {
void abc();
int x=20120;

}

class C implements B , implements A{
 x = 20;
  void abc(){
    System.out.println("HELLO JAVA"+x);
  }
}


class main {
public static void main(String[] args) {
  C obj = new C();
  obj.abc();
}

}
