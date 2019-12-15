class one {
void show1 (){
System.out.println("Helo ");
}


}

class two extends one{
  void show2 (){
    System.out.println("bItch ");
  }
}


class gen {
  public static void main(String[] args) {
  //  one obj;
    //obj = (one)new two(); //object casting
    //obj.show1();
//  two obj1;
//obj1 = (two)new one();//Widening for overriding
//obj1.show1();///Exception in thread "main" java.lang.ClassCastException: class one cannot be cast to class two (one and two are in unnamed module of loader 'app')
//	at gen.main(gen.java:22)

//Narrowing

one ob = new two();
two obj2 = (two)ob;
obj2.show1();
obj2.show2();
ob.show1();
//ob.show2();
  }
}
