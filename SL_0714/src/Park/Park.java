package Park;

import java.util.ArrayList;
import java.util.Scanner;

public class Park {
    Scanner sc = new Scanner(System.in);
    ArrayList<Park> a_park = new ArrayList<Park>(5);

    String carNum;
    boolean checkSpot;
    int hour, minute;
    boolean checkCar;

    public String getCarNum() {
        return carNum;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public boolean getCheckCar() {
        return checkCar;
    }

    public void carIn() {
        System.out.print("차 번호를 입력하세요 : ");
        carNum = sc.nextLine();
        while (true) {
            for (int i = 0; i < a_park.size(); i++) {
                if (a_park.get(i).getCarNum().equals(carNum)) {
                    System.out.println("잘못된 정보입니다.");
                }
            }
            System.out.print("시간을 입력하세요 : ");
            hour = sc.nextInt();
            if (hour > 12) {
                System.out.println("잘못된 입력입니다.");
                break;
            } else {
                System.out.print("분을 입력하세요 : ");
                minute = sc.nextInt(); sc.nextLine();
                if (minute > 59) {
                    System.out.println("잘못된 입력입니다.");
                    break;
                } else {
                    checkCar = true;
                    break;
                }
            }

        }

    }

    public void carOut() {
        System.out.print("차량 번호를 입력하세요 : ");
        carNum = sc.nextLine();
        for (int i = 0; i < a_park.size(); i++) {
            if (a_park.get(i).getCheckCar() == false) {
                System.out.println("차량이 존재하지 않습니다.");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Park park = null;
        ArrayList<Park> a_park = new ArrayList<Park>(5);


        park = new Park();
        park.carIn();
        a_park.add(park);

        park = new Park();
        park.carIn();
        a_park.add(park);

        park.carOut();


        for (int i = 0; i < a_park.size(); i++) {
            System.out.print(a_park.get(i).carNum + "  ");
            System.out.print(a_park.get(i).getHour() + "시");
            System.out.println(a_park.get(i).getMinute() + "분");
        }

    }
}
