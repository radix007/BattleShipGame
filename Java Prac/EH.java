import java.io.*;
import java.util.*;
import java.lang.*;
/*
class trycatch1 {
public static void main(String[] args) {
    
    try{
        System.out.println("Entered Try Blco");
        int[] i = new int[10];
    i[15] = 212;
    int a=12,v=0,x;
x = a/v;
        System.out.println("Exiting try block");
    }
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
e.printStackTrace();
}
catch(ArithmeticException o){
    System.out.println(o);
}
 finally{ 
}
}

}*/



class Alpha extends Exception{
    Alpha(String Message){
super(Message);}
}

class Beta {
void xa()throws Alpha{

    //int[] s = new int[3];//{12,545,3435,5464,5464};
//s[0]= 1;

//s[1]= 121;
//s[2]= 1123;
// s[15]= 21;
//int [4]= 1;
int i=1,j=1;
    if(i/j==1){
throw new Alpha("INdex out of boudns ");
}}
}
class testm{
    public static void main(String[] args) {
     //   Alpha obj = new Alpha();
    Beta obj = new Beta();
    try{
obj.xa();
    }
    catch(Alpha oh){oh.printStackTrace();
System.out.println("NIGGA IS A BITCH");
    }
    finally{//for(int i=0;i<s.length;i++)
        {
        System.out.println("i/j = ");
    }}
    }
}
