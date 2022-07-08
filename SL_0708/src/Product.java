import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {

    int serial_no;  // 고유번호
    String name;   // 물건이름
    int price;  // 가격
    int quantity;   // 갯수
    String expired;  // 유통기한


    public void setProducr() {

        Scanner sc = new Scanner(System.in);
        System.out.println("** Welcome Product **  ");
        System.out.print("name : ");
        name = sc.nextLine();
        System.out.print("Serial_Num : ");
        serial_no = sc.nextInt();
        System.out.print("Price : ");
        price = sc.nextInt();
        System.out.print("Count : ");
        quantity = sc.nextInt();
        System.out.print("Expired : ");
        expired = sc.nextLine();
        sc.nextLine();
    }

//    public void putProduct() {
//        System.out.println("name : " + name);
//        System.out.println("Serial_Num : " + serial_no);
//        System.out.println("Price : " + price);
//        System.out.println("Count : " + quantity);
//        System.out.println("Expired : " + expired);
//        System.out.println();
//    }

//    @Override
//    public String toString() {
//        return ;
//    }

    //     String search;

//    public void register() {
//        serial_no++;
//        System.out.print("물건이름 : ");
//        name = sc.nextLine();    // char형은 스캐너로 받을 수 없어서 이런식으로 해야한다.
//        System.out.print("고유번호 : " + serial_no);
//        System.out.print("가격 : ");
//        price = sc.nextInt();
//        System.out.print("갯수 : ");
//        quantity = sc.nextInt();
//
//    }
//
//    public void delete() {
//
//    }
//
//    public void search() {
//        System.out.print("물건이름을 입력하세요 : ");
//        search = sc.nextLine();
//        if (search.equals(name)) {
//            System.out.println("");
//        }
//    }
//
//    public int getSerial_no() {
//        return serial_no;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }




}
