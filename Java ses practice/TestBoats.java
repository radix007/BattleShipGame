class Outer {
static int x = 25;
final int y = 19;
int z = 23;
private int q = 254;
private final int e = 2;
int r ;
/*Inner.ax = 14;
void dis(){
System.out.prinln("Outer ae valu e "+ax);
}*/
//this.ax;
class Inner {
void abcd(){
x = 18;
//y = 14;
z = 9;
q = 154;
//e = 285 ;
Outer.this.r = 25;
 int ax = 15;
System.out.println("Values are "+x+" "+y+" "+z+" "+q+" "+e+"  "+Outer.this.r);



}

}

}


class TestBoats{
  public static void main(String[] args) {
Outer obj = new Outer();
Outer.Inner obj2  = obj.new Inner();
obj2.abcd();
//obj.dis();
  }
}
