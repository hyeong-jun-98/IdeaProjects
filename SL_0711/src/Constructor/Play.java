package Constructor;

import java.util.ArrayList;

public class Play {
    public static void main(String[] args) {


        ArrayList<Animal> arrayList = new ArrayList<Animal>();
        Fish fish = new Fish("shark", 10000, true);
        Bird bird = new Bird("eagle", 10000, false);
        arrayList.add(fish);
        arrayList.add(bird);

        System.out.println(arrayList.size());

        Fish animal = (Fish) arrayList.get(0);
        Bird animal2 = (Bird)arrayList.get(1);


        animal.putFishInfo();
        animal2.putBirdInfo();

        String objectType = animal.getClass().getName();
        System.out.println("object type : " + objectType);


    }
}
