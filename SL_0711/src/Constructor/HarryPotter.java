package Constructor;

public class HarryPotter extends Human {


    HarryPotter(String n, float h, float m, float s) {
        hName = n;
        hHp = h;
        hMp = m;
        hSt = s;
    }
    HarryPotter() {

    }
    void useMagic() {
        System.out.println("아바다 케다브라라");
   }

}
