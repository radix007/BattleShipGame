import java.io.*;
import java.util.*;

//Q1. Provide an interface Measurable with a method double getMeasure() that measures an object in some way. 
//Make Employee implement Measurable. Provide a method double average(Measurable[] objects) that computes the average measure. 
//Use it to compute the average salary of an array of employees.

interface Measurable{
        double getMeasure();
}

public class Employee implements Measurable {
double getMeasure(){
        System.out.println("Heoo");
}
double average(Measurable[] objects ){
        System.out.println("Hello");
}

         
}
class testm{
        public static void main(String[] args) {
                Employee obj = new Employee();
                //obj.average();
                obj.getMeasure();
        }
}