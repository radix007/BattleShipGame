import java.io.*;

class Marks{


int[] markss = new int[]{87,78,69,92,75};

/*for(int x=0;x<5;x++){
  BufferredReader xyz = new BufferredReader(new InputStreamReader(System.in()));
  int markss[x] = Integer.parseInt(xyz.readLine());*/
}







class B extends Marks{
void perc(){
double percentage ;

percentage = (markss[0]+markss[1]+markss[2]+markss[3]+markss[4]);
percentage = (percentage/500)*100;
System.out.println("The percentage is "+percentage);

}
}

class TestMarks{
  public static void main(String[] args)throws IOException{
//Marks obj1 = new Marks();
    B obj = new B();
  //  obj1.xz();
    obj.perc();

  }
}
