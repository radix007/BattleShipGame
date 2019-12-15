import java.io.*;
import java.util.*;

class testm{
public static void main(String[] args) {
    try{
        File fw = new File("/home/root007/Docuements/H.txt");
        if(fw.createNewFile()){
            System.out.println("The name of file is "+fw.getName());
        }
        else{
            System.out.println("File Not FOund");
        }
        FileWriter ox = new FileWriter("H.txt");
        BufferedWriter ok = new BufferedWriter(ox);
ox.write("JHJSHDS");
FileReader os = new FileReader("H.txt");
BufferedReader k = new BufferedReader(os);
int ch ;
while(ch=k.read()!=-1){
    System.out.println((char)k);

}

String op;
while(op=ok.readLine()!=null){
    System.out.println(op);
}

char[]   ssw= new char[15];

ok.read(ssw,0,10);
System.out.println(ssw);

ox.close();

    }
    catch(Exception e){
        e.printStackTrace();
    }
}


}