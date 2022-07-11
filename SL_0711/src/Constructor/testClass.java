package Constructor;

public class testClass {
    public static void main(String [] args) {

        Warrior w = new Warrior();
        w.putHumanInfo();


        Warrior ww = new Warrior("Kim", 5000f, 10f, 250f);
        ww.putHumanInfo();

    }
}
