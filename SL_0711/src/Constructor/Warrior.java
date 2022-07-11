package Constructor;

public class Warrior extends Human {

    Warrior() {
        this.hName = null;
        this.hHp = 0.0f;
        this.hMp = 0.0f;
        this.hSt = 0.0f;
        this.weapon = null;
    }

    public Warrior(String n, float h, float m, float s) {
        this.hName = n;
        this.hHp = h;
        this.hMp = m;
        this.hSt = s;
        this.weapon = "단검";
    }


    void Attack() {
        System.out.println("일반공격");
    }
}
