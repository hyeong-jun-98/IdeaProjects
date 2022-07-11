package Constructor;

import java.util.ArrayList;

public class Fish extends Animal{

    Fish(String n, int h, boolean live) {
        super(n,h,live);
    }
    Fish() {

    }
    void Swim() {
        System.out.println("Swim");
    }

    void putFishInfo() {
        System.out.println("name : " + name + ", Hp : " + Hp + ", Alive : " + live);
    }

    public static void main(String [] args) {







    }
}
