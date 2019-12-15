import java.io.*;

Interface Shape{
void no_of_sides();
final int x = 20;


}

class square implements Shape{

void no_of_sides(){
int x = 4;
System.out.println("no_of_sides"+x);


}
}

class triangle implements Shape
{
int x = 3;
void no_of_sides(){
  System.out.println("no_of_sides"+x);
}


}
class circle implements Shape{
void no_of_sides(){
System.out.println("Sides = 0");
}


}

class TesT{
  public static void main(String[] args) {

    square obj = new square();
triangle obj1 = new triangle();
circle obj2 = new circle();
obj.no_of_sides();
obj1.no_of_sides();
obj2.no_of_sides();
  }
}


