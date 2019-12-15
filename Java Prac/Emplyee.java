import java.io.*;
import java.util.*;


//Q1. Provide an interface Measurable with a method double getMeasure() that measures an object in some way. 
//Make Employee implement Measurable. Provide a method double average(Measurable[] objects) that computes the average measure. 
//Use it to compute the average salary of an array of employees.

//Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of miles, to add a 
//given number of gallons to the gas tank, and to get the current distance from the origin and fuel level.  Specify the fuel efficiency
  //(in miles/gallons) in the constructor. Should this be an immutable class? Why or why not?
/*
  final class Car{

final double gas_tank;
final double miles;
final double miles_tra ;
void drive_by_miles(double miles){
System.out.println("The Number OF Miles The Car Is going to be driven is ",+miles);
}
void add_gas(double add_gas){
    System.out.println("The Gas Added in the tank is ",+gas);
}
double   getdistance_tra(){
    return miles_tra;
}
void gas_left();
Car(double fuel_efficiency);}
  
  class tesm{
      public static void main(String[] args) {
          Car obj = new Car();
obj.drive_by_miles(30.0);
obj.add_gas(25.0);
obj.Car(15.0);

      }
  }*/


//  Implement a class Queue, an unbounded queue of strings. Provide methods add, adding at the tail, and remove, removing at the head of the queue.
  // Store elements as a linked list of nodes. Make Node a nested class. Should it be static or not?
/*
  class QueueExapmle{void Nodess(){
Queue<String> queue = new LinkedList<>();
queue.add("One");
queue.add("Two");
queue.add("three");
queue.add("four");
System.out.println(queue);
queue.remove("four");
  Queue<String> queue1 = new LinkedList<>();  
queue1.addAll(queue);
System.out.println(queue1);
System.out.println("The Size OF queue 1 is "+queue.size());
queue.poll();queue.poll();
queue.poll();
queue.poll();

System.out.println("Queue is "+queue+"  Yo "+queue.size());
}
  }
class testm extends QueueExapmle{
public static void main(String[] args){
    QueueExapmle obj = new QueueExapmle();
     obj.Nodess();
}



}*/
/*
class Que{void abcd(){
Queue<String> ob = new LinkedList<>();
ob.add("HELLO");
ob.add("MY NAME IS ");
System.out.println(ob);
System.out.println(ob.size());

ob.poll();
System.out.println(ob);

}}
class x{
    public static void main(String[] args){
        Que obk = new Que();
        obk.abcd();
    }
}*/


class Ar{void x(){    ArrayList<String> mylist = new ArrayList<String>();
mylist.add("WHAT");
mylist.add("THE ");
mylist.add("FUCK!!!");
System.out.println(mylist);
mylist.remove("WHAT");
System.out.println(mylist);
System.out.println(mylist.size());
int u = mylist.indexof("THE ");
System.out.println(u);
}
}
class m{
    public static void main(String[] args) {
        Ar obj = new Ar();
        obj.x();
    }
}