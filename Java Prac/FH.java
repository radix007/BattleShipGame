import java.io.*;
class testm{
public static void main(String[] args)throws IOException {
    File oj = new File("/home/root007/Documents/Java Prac/NIGGABITCH.txt");
    oj.createNewFile();
//System.out.println("CHECKINF "+oj.exists()+" LENGTH "+oj.length()+"   GET NAME ::     "+oj.getName());
FileWriter fw = new FileWriter("NIGGABITCH.txt",true);
BufferedWriter xy = new BufferedWriter(fw);
fw.write("MY BIYCH 4654564564");
FileReader ss = new FileReader("NIGGABITCH.txt");
BufferedReader nx = new BufferedReader(ss);
//String xya;
//while((xya=nx.readLine())!= null){
//System.out.print(xya);
char[] sa = new char[20];
nx.read(sa,0,15);
System.out.println(sa);
///int ch;
//while((ch=nx.read())!= -1){
//System.out.print((char)ch);
fw.close();

}

//System.out.println("CHECKINF "+oj.exists()+" LENGTH "+oj.length()+"    GET NAME ::     "+oj.getName());

}


