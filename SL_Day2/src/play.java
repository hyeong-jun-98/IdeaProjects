import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class play {

//    public static void clearScreen() {
//        System.out.println("\033[H\033[23");
//        System.out.flush();
//    }

    public static void main(String[] args) throws IOException, InterruptedException {

//        member m1 = new member();
//        member m2 = new member();
//        member m3 = new member();
//        member[] m_box = new member[3];
//        String tmpName = null;
//        m_box[0] = m1;
//        m_box[1] = m2;
//        m_box[2] = m3;
//
//        for (int i = 0; i < m_box.length; i++) {
//            m_box[i].setMemberInfo();
//            tmpName = m_box[i].getMemberName();
//            System.out.println("반환된 이름 : " + tmpName);
//            m_box[i].putMemberInfo();
        //        }
// =====================================================================

//        Scanner sc = new Scanner(System.in);


//        ArrayList pitches = new ArrayList();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//
//        System.out.println("0 번째 : " + pitches.get(0));
//        System.out.println("크기 : " + pitches.size());
//        System.out.println("0 번째 제거 : " + pitches.remove(0));
//        System.out.println("0 번째 : " + pitches.get(0));
//        System.out.println("크기 : " + pitches.size());
//
//        if (pitches.contains("129")) {
//            System.out.println("OK");
//        }//===============================================================

// 우리가 만든 회원정보 객체를 Arraylist에 저장할 수 있도록 코드를 작성해본다.
// 중요한 것은 Arraylist에 특정 타입(클래스를) 어떻게 저장하는가하는 부분이다.
//
//        member member1 = new member();
//        member member2 = new member();
//
//        ArrayList <member> members = new ArrayList<member>();
//
//        members.add(member1);
//        members.add(member2);
//
//        members.get(0).setMemberInfo();
//        members.get(0).putMemberInfo();
//        members.get(1).setMemberInfo();
//        members.get(1).putMemberInfo();
//


        Runtime runtime = Runtime.getRuntime();  // 계산기 실행

//        try {
//            runtime.exec(".exe");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

       try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException e){
            Runtime.getRuntime().exec("clear");
        }




    }
}