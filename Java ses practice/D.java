abstract class A{
static void sub(){
  System.out.println("HEEELO");
}  abstract   void add();

}

class B extends A{
 void add(){System.out.println("YYYO");}

}
//class D extends B{
//  void k(){
  //  System.out.println("HHH");
  //}

class C{
public static void main(String[] args) {
  B obj = new B();
  //B.add();
//D.k();
  B.sub();
}

}
