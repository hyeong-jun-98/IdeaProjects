import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//
public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String search = "";
        String name = null, bank_account = null, my_count = null;
        Client cl = null;
        String out = null;

//        Client cl1 = new Client();
//        Client cl2 = new Client();
//
//        a_Client.add(cl1);
//        a_Client.add(cl2);

        ArrayList<Client> a_Client = new ArrayList<Client>();

        System.out.println("## 메뉴 ##");             // 메뉴 선택
        System.out.println("** 회원정보 입력은 필수입니다. **");
        System.out.println("1. 회원정보 추가 입력");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 잔액 조회");
        System.out.println("5. 회원정보 검색");
        System.out.println("6. 회원정보 출력");
        System.out.println("7. 종료");
        System.out.println("8. cmd 창에서 cls 명령어 수행");
        System.out.println();
        String num = null;

        System.out.println("회원정보 입력");
        cl = new Client();
        a_Client.add(cl);
        cl.set_Client();


        while (true) {
            System.out.println();
            System.out.print("메뉴를 선택하시오 : ");
            num = sc.nextLine();

            switch (Integer.parseInt(num)) {
                case 1:
                    System.out.println("1. 회원정보 추가");
                    cl = new Client();
                    a_Client.add(cl);
                    cl.set_Client();
                    break;
                case 2:
                    System.out.println("2. 입금");
                    cl.in_count();
                    break;
                case 3:
                    System.out.println("3. 출금");
                    cl.out_count();
                    break;
                case 4:
                    System.out.println("4. 잔액 조회");
                    cl.balance();
                    break;
                case 5:
                    System.out.println("5. 회원정보 검색");
                    System.out.print("검색 : ");
                    search = sc.nextLine();
                    for (int i = 0; i < a_Client.size(); i++) {
                        if (a_Client.get(i).getName().equals(search)) {
                            System.out.println("고객 정보가 존재합니다.");
                        }
                    }
                    break;
                case 6:
                    System.out.println("6. 회원정보 출력");
                    for (int i = 0; i < a_Client.size(); i++) {
                        a_Client.get(i).putClient();
                    }
                    break;
            }
            if (num.equals("7")) {
                System.out.println("종료되었습니다.!!!");
                break;
            }
            if (num.equals("8")) {  // cmd에서 자바 컴파일해서 cls 명령어 실행하기............. cmd에서 한글이 깨짐....됐다,,,,,,,,,,,
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
//        while(true) {           // 회원정보 입력
//            cl = new Client();
//            a_Client.add(cl);
//            cl.set_Client();
//
//            System.out.print("계속 진행할까요? "); out = sc.nextLine();
//
//            if(out.equals("yes")) {     // yes일 때 계속 입력
//                System.out.println();
//                continue;
//            } else if (out.equals("no")) {     // NO면 그만 입력
//                break;
//            }
//        }


//        for(int i = 0; i < a_Client.size(); i++) {   // 회원정보 입력
//            a_Client.get(i).set_Client();
//
//        }
//        for(int i = 0; i < a_Client.size(); i++) {           // 회원정보 출력
//            a_Client.get(i).putClient();
//        }

//        System.out.print("검색 : ");               // 검색
//        search = sc.nextLine();
//
//        for(int i = 0; i < a_Client.size(); i++) {
//            if (a_Client.get(i).getName().equals(search)) {
//                System.out.println("고객 정보가 존재합니다.");
//            }
//        }
//        if(a_Client.contains(search) == true) {
//            System.out.println("고객정보가 존재합니다.");
//        } else {
//            System.out.println("고객정보가 존재하지 않습니다.");
//        }


//        for(int i = 0; i < a_Client.size(); i++) {          // 특정 인믈 잔액 표시
//            a_Client.get(i).getName().in_count();
//            System.out.println(a_Client.get(i) + "의 잔액 : " + a_Client.get(i).balance());
//
//        }
//
//        for(int i = 0; i < a_Client.size(); i++) {
//            a_Client.get(i).out_count();
//            System.out.println(a_Client.get(i) + "의 잔액 : " + a_Client.get(i).balance());
//
//        }


    }
}
