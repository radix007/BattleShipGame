abstract class shape{
abstract void no_of_sides();


}

class square extends shape{
void no_of_sides(){
 int x = 4;
 System.out.println("no_of_sides"+x);
}


}

class triangle extends shape {
void no_of_sides(){
int x = 3;
System.out.println("no_of_sides"+x);

}


}

class circle extends shape{

  void no_of_sides(){
    System.out.println("no sides");
  }
}

class TestShape{
  public static void main(String[] args) {
    square  obj = new square();
    triangle obj1 = new triangle();
    circle obj2 = new circle();
    obj.no_of_sides();
    obj1.no_of_sides();
    obj2.no_of_sides();
  }
}
