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
        String search_Name = null;

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
            System.out.println();            // 회원정보 기본 입력
            System.out.print("메뉴를 선택하시오 : ");
            num = sc.nextLine();
            System.out.println();

            switch (Integer.parseInt(num)) {
                case 1:
                    System.out.println("1. 회원정보 추가");
                    cl = new Client();
                    a_Client.add(cl);
                    cl.set_Client();
                    break;
                case 2:  // 이름 검색 후 입금
                    System.out.println("2. 입금");
                    System.out.println();
                    System.out.print("입금을 실행할 사람의 이름을 쓰시오 : ");   search_Name = sc.nextLine();

                    for(int i = 0; i < a_Client.size(); i++) {
                        if(search_Name.equals(a_Client.get(i).getName())) {
                            a_Client.get(i).in_count();
                        }
                    }
                    break;
                case 3:   // 이름 검색 후 출금
                    System.out.println("3. 출금");
                    System.out.print("출금을 실행할 사람의 이름을 쓰시오 : ");   search_Name = sc.nextLine();

                    for(int i = 0; i < a_Client.size(); i++) {
                        if(search_Name.equals(a_Client.get(i).getName())) {
                            a_Client.get(i).out_count();
                        }
                    }
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
                System.out.println();
                break;
            }

//            // Runtime.getRuntime().exec("cls")가 안되는 이유는 cmd안에 내장된 명령어이기 때문에 호출할 수 있는 표준 cls.exe 또는 실행파일이 없다.
//            // 이 문제를 해결하려면 cmd를 호출하고 --> 기본 제공 명령어를 호출할  cls를 실행하도록 지시해야 한다.
//            if (num.equals("8")) {  // cmd에서 자바 컴파일해서 cls 명령어 실행하기............. cmd에서 한글이 깨짐....됐다,,,,,,,,,,,
//                try {
//                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // cmd를 호출하고 cls명령을 실행. 인터 프리터 출력 채널을 java 프로세스 출력 채털과 연결해야 한다. .inheritIO()메서드를 통해 사용가능
//                    break;
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
        }


        // ========================================================================================
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

//====================================================================================================
//        for(int i = 0; i < a_Client.size(); i++) {   // 회원정보 입력
//            a_Client.get(i).set_Client();
//
//        }
        //=============================================================================================
//        for(int i = 0; i < a_Client.size(); i++) {           // 회원정보 출력
//            a_Client.get(i).putClient();
//        }
        //=============================================================================================

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

        //=============================================================================================

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
        //=============================================================================================


    }
}
