import java.io.*;
import java.util.*;
class battle{
int  y1,w1,b1,d1;
public void battleship()throws IOException{
    String[][] batgrid = new String[5][5];
int x = batgrid.length;
int  y = (int)(Math.random()*x);
y1 = y;
int z= batgrid.length;
 int w = (int)(Math.random()*z);
w1 = w;
 batgrid[y][w] = "VULCAN SHIP 1 ";
int a = batgrid.length;
 int b = (int)(Math.random()*a);
b1 = b;

 int c = batgrid.length;

 int d = (int)(Math.random()*c);
d1 = d;
 batgrid[b][d] = "VULCAN SHIP 2 ";
System.out.println("                                                             *******************WELCOME TO BATTLESHIP***********************");
//System.out.println(""+y+""+w+"     "+b+""+d);
//System.out.println(""+batgrid[y][w]+"***"+batgrid[b][d]);
}
 
}
class battleshipmain extends battle{

void bmc()throws IOException{
for(int r =1;r<4;r++){
  System.out.println("       1. NEW GAME    "+"    2.RULES   3. EXIT   ");
  BufferedReader eng = new BufferedReader(new InputStreamReader(System.in));
   r =Integer.parseInt(eng.readLine());
    if(r==1){
       System.out.println("                                                                                LET THE GAME BEGIN                                   ");

       System.out.println("                                                                                  WELCOME PLAYER                                     ");

       System.out.println("                                                                YOUR AIM IS TO SAVE THE HUMANITY FROM THE VULCANS                    ");

       int c1,c2;
int count = 0;
for(int k=2;k>=0;k--){
       System.out.println("                                                                               ENTER THE COORDINATES :                               ");


BufferedReader cor = new BufferedReader(new InputStreamReader(System.in));
c1 = Integer.parseInt(cor.readLine());
if(c1>6){

System.out.println("                                                                   INVALID INPUT , ENTER THE COORDINATE AGAIN (RANGE 0-5) :");
c1 = Integer.parseInt(cor.readLine());
}
c2 = Integer.parseInt(cor.readLine());
if(c2>6){
  System.out.println("                                                                 INVALID INPUT , ENTER THE COORDINATE AGAIN (RANGE 0-5) :");
c2 = Integer.parseInt(cor.readLine());
}

if(c1==y1&&c2==w1||c1==b1&&c2==d1){
  System.out.println("                                                                                    DIRECT HIT GOOD ONE !!! ");
count = count +1;
}
else {System.out.println("                                                                   SORRY YOU MISSED THE VULCAN SHIP ... TRY AGAIN!!");
System.out.println("                                                                                            CHANCES LEFT "+k);}
}
if(count==2){
  System.out.println("                                                                        YOU WON CONGRATS ON SAVING THE HUMANITY !!!");

}
else{
  System.out.println("                                                                         YOU  LOST !! BETTER LUCK NEXT TIME  ");
}
}

  else if(r==2){

  System.out.println("                                                                                     RULES :                                                    ");


  System.out.println("1.There are two battleships in the space. And Your Battleship is Hidden In The Saturn Dust .");
  System.out.println("2. YOUR SHIP IS THE USS ENTERPRISE . YOUR MISSION IS TO SAVE THE HUMANITY FROM THE VULCANS . ");
  System.out.println("3.You have three chances to hit before the VULCANS  figure out your position and You Fail To Save The Humanity ");
  System.out.println("4.Enter the Desired Coordinates , Make Sure You enter the Coordinates wisely as you will only get 3 chances  ");
  System.out.println("5.If You are able to  blow up the VULCANS SHIP  in one go then you get an extra chance  ");
  System.out.println("6.Coordinates Range (0-5)(0-5)");
  }
  else if(r==3){

  System.out.println("THANK YOU FOR PLAYING");

  break;
  }
  }
  

}
}

class battletest {
public static void main(String[] args)throws IOException {
    battleshipmain obj = new battleshipmain();
    obj.battleship();
obj.bmc();
}
}
