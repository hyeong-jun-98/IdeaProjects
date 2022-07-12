package Constructor;

public abstract class Human {
    static String hName;
    static float hHp;
    static float hMp;
    static float hSt;

    public String gethName() {
        return hName;
    }
    public float gethHp() {
        return hHp;
    }
    public float gethMp() {
        return hMp;
    }
    public float gethSt() {
        return hSt;
    }

    static String weapon;

    Human() {
        this.hName = null;
        this.hHp = 0.0f;
        this.hMp = 0.0f;
        this.hSt = 0.0f;
    }

    Human(String n, float h, float m, float s) {
        this.hName = n;
        this.hHp = h;
        this.hMp = m;
        this.hSt = s;
    }


    public void Check() {
        System.out.println("Human Class");
    }

    public void putHumanInfo() {
        System.out.println(this.hName + " " + this.hHp + " " + this.hMp + " " + this.hSt + " " + this.weapon);
    }
}