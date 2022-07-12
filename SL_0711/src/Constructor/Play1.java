package Constructor;

import java.util.ArrayList;
import java.util.Random;

public class Play1 {
    public static void main(String[] args) {
        ArrayList<Human> arrayList = new ArrayList<Human>();
        Random random = new Random();
        Warrior warrior = new Warrior("전사", 2000, 100, 5000);
        HarryPotter harryPotter = new HarryPotter("해리포터", 50000, 30000, 1500000);




        for (int i = 0; i < 5; i++) {
            if (random.nextInt(10) < 5) {
                arrayList.add(warrior);
            } else {
                arrayList.add(harryPotter);
            }

        }
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getClass());
        }

// class Constructor.Warrior
//class Constructor.HarryPotter


        for (int i = 0; i < arrayList.size(); i++) {
          if (arrayList.get(i).getClass().getName().equals("Constructor.Warrior")) {
              //getName()을 해줘야 String 타입으로 받아줌
              warrior.useWeapon();
          } else if(arrayList.get(i).getClass().getName().equals("Constructor.HarryPotter")){
              harryPotter.useMagic();
          }
        }






    }
}
