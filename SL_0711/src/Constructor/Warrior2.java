package Constructor;

import Constructor.Warrior;

public class Warrior2 extends Warrior {
    public void Attack() {
        System.out.println("특수공격");
    }
    public void Run() {
        System.out.println("계속 달려");
    }
    public void Run(int time) {
        System.out.println(time + "시간 동안 달려");
    }

}