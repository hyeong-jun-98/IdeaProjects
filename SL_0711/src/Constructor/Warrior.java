package Constructor;

public class Warrior extends Human {

    public Warrior(String n, float h, float m, float s) {
        hName = n;
        hHp = h;
        hMp = m;
        hSt = s;
    }

    Warrior() {
        this.hName = null;
        this.hHp = 0.0f;
        this.hMp = 0.0f;
        this.hSt = 0.0f;
        this.weapon = null;
    }


    void Attack() {
        System.out.println("일반공격");
    }

    void useWeapon() {
        System.out.println("무기사용");
    }

}


