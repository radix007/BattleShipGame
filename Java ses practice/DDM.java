class game{
void display(){
System.out.println("Indoor Game");

}
}

class cricket extends game{
void display(){
System.out.println("Outdoor game");

}

}

class DDM{
  public static void main(String[] args) {
    game gm  = new game();
    cricket cri = new cricket();
    gm.display();
    cri.display();
    gm = cri;
    gm.display();
  }
}
