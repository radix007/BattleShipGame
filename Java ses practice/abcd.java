class abc {
void man(){
  System.out.println("Hello Bitch");
}


void wom(){
  System.out.println("Hello My Man");
}
}

class abcde extends abc{

void man(){
  System.out.println("BITCH PLEASE");
}





}

class abd extends abcde{
void man(){
super.man();
System.out.println("MOVE ON");

}
}


class abcd {
  public static void main(String[] args) {
    //abcde obj1 = new abcde();
    //obj1.man();
    //obj1.wom();
abcde obj2 = new  abd();
obj2.man();

  }
}
