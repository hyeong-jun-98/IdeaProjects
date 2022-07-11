package Constructor;

import Constructor.Animal;

public class Bird extends Animal {
    Bird() {

    }

    Bird(String n, int h, boolean live) {    // 생성자를 하나 만들었을 때 상속 받는 쪽도 새서자가 반드시 필요하다.
        super(n, h, live);
    }


    void fly() {
        System.out.println("Fly");
    }

    void putBirdInfo() {
        System.out.println("name : " + name + ", Hp : " + Hp + ", Alive : " + live);
    }

}
