package Constructor;

public class Animal {
    String name;
    int Hp;
    Boolean live;

    Animal(){
        name = null;
        Hp = 0;
        live = true;
    }

    Animal(String n, int h, boolean l){
        name = n;
        Hp = h;
        live = l;
    }



    void move() {
        System.out.println("Move");
    }

    void die() {
        live = false;
        System.out.println("Die");
    }



}
