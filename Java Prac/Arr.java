import java.io.*;
import java.util.*;
import java.lang.*;
/*
class Ar{public static void main(String[] args) {
    

    ArrayList<Integer> o = new ArrayList<Integer>();
    o.add(1);
    o.add(2);
    o.add(3);
    o.add(25);
for(Integer i : o){
    System.out.println(i);
}
o.forEach(a->System.out.println(a));
    o.add(2,254);
ArrayList<Integer> ox = new ArrayList<Integer>();
ox.addAll(o);

System.out.println(ox.isEmpty());
ox.clear();
System.out.println(ox.isEmpty());

    System.out.println("********");
    System.out.println(ox); 

}}*/

/*
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    
}

class ArrayListUserDefinedObjectExample {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Rajeev", 25));
        users.add(new User("John", 34));
        users.add(new User("Steve", 29));

users.forEach(user -> {
            System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
        });    }
}*/

class Ar{ String abc;
    int x;
    Ar(String abc,int x){
this.abc = abc;
this.x = x;
}

String getac(){
    return abc;
}
int geta(){
    return x;
}

public static void main(String[] args) {
    ArrayList<Ar> ok = new ArrayList<Ar>();
ok.add(new Ar("Hello",121));
ok.add(new Ar("H",13321));
ok.add(new Ar("asd",11));
for(int i =0;i<ok.size();i++){
    System.out.println(ok.get(i));
}
ok.forEach(i->System.out.println(i.geta()+" "+i.getac()));


}}



