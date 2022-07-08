import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Market {
    static int serial_no;  // 고유번호
    static int price;  // 가격
    static int quantity;   // 갯수
    static char[] name = new char[10];   // 물건이름
    static char[] expired = new char[10];  // 유통기한
    static  String search;
    Scanner sc = new Scanner(System.in);
    public void register() {
        serial_no ++;
        System.out.print("물건이름 : "); name = sc.next().toCharArray();    // char형은 스캐너로 받을 수 없어서 이런식으로 해야한다.
        System.out.print("고유번호 : " + serial_no);
        System.out.print("가격 : "); price = sc.nextInt();
        System.out.print("갯수 : "); quantity = sc.nextInt();

    }

    public void delete() {

    }

    public void search() {
        System.out.print("물건이름을 입력하세요 : "); search = sc.nextLine();
        if(search.equals(name)) {
            System.out.println("");
        }
    }

    public int getSerial_no() {return serial_no;}
    public int getPrice() {return price;}
    public int getQuantity() {return quantity;}


}

class macaron extends Market {


    public static void main(String[] args) {
//        ArrayList<Market> a_mk = new ArrayList<Market>();
        Market mk = new macaron();



    }
}
