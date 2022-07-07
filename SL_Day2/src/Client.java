import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    String name;
    String bank_account_number;
    int my_count;
    String search = "";

    int in_count, out_count;

//    public void Client(String name, String bank_account_number, int my_count) {
//        this.my_count = my_count;
//        this.in_count = in_count;
//        this.out_count = out_count;
//        this.name = name;
//        this.bank_account_number = bank_account_number;
//    }


    public void set_Client() {  // 고객정보 입력


        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("계좌번호 : ");
        bank_account_number = sc.nextLine();
        System.out.print("잔액 : ");
        my_count = sc.nextInt();
        System.out.println();
    }

    public String getName() {  // 이름
        return name;
    }
    public String getBank_account_number() {  // 계좌번호
        return bank_account_number;
    }
    public int getMy_count() {   // 잔액
        return my_count;
    }
    public int in_count() {   // 입금
        Scanner sc = new Scanner(System.in);
        System.out.print("입금 금액 : ");  in_count = sc.nextInt();
        if (in_count < 0) {
            System.out.println("다시 입력하십시오.");
            return -1;
        }
        my_count += in_count;
        balance();

        return in_count;
    }

    public int out_count() {  // 출금
        Scanner sc = new Scanner(System.in);
        System.out.print("출금 금액 : ");
        out_count = sc.nextInt();
        if (out_count > my_count) {
            System.out.println("잔액보다 많습니다. 다시 입력하십시오.");
            return -1;
        }
        my_count -= out_count;
        balance();
        return out_count;
    }

    public int balance() {  // 잔액
        System.out.println(getName() + "의 현재 잔액 : " + my_count);

        return my_count;
    }


    public void putClient() {  // 고객 정보 출력
        System.out.println("고객 이름 : " + name);
        System.out.println("고객 계좌번호 : " + bank_account_number);
        System.out.println("고객 잔액 : " + my_count);
        System.out.println();
    }

//    public void search(String search) {
//
//        if (name.contains(search) == true || bank_account_number.contains(search) == true) {
//            System.out.println("고객 정보가 존재합니다.");
//        } else {
//            System.out.println("고객 정보가 존재하지 않습니다.");
//
//        }
//    }

    public static void main(String[] args) {

    }
}
