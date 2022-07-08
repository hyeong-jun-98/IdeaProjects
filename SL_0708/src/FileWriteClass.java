import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class FileWriteClass {
    public static void main(String[] args) throws IOException {




        //파일스트림(객체를 저장할곳은 이곳이다)
        // 객체담당 클래스 <--------> 파일담당 클래스  (둘이 연결되어야한다.) <------> 하드웨어 (하드디크/usb 드라이버/네트워크)

        FileOutputStream fileStream = new FileOutputStream("C:\\datatest\\honjong.txt");   // \대신 \\을 두번 써야된다. 이유는 : 이스케이프 문자

        //객체저장스트림(객체를 파일스트림과 연결한다.)-파이프연결

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);

        //저장할객체들의 내용과 그것들을 컨테이너에 저장해둠

//        HashMap userInfoMap = new HashMap();    // 해쉬맵 버전
//
//        userInfoMap.put("TEL", "02-324-2424");
//
//        userInfoMap.put("phone", "010-9999-9999");
//
//        userInfoMap.put("address", "서울서 서추구 방배동 34244");
//
//        userInfoMap.put("age", "43");
//
//        userInfoMap.put("bitrhday", "19330101");

        ArrayList<String> a_name = new ArrayList<String>();         // Arraylist 버전
        ArrayList<Integer> a_age = new ArrayList<Integer>();
        a_name.add("Yang");
        a_name.add("Park");
        a_age.add(13);
        a_age.add(29);

        //HashMap이라는곳에 저장된것들을 통째로 파일에 저장한다.(객체스트림-->파일스트림-->실제파일에 저장)

        objectOutputStream.writeObject(a_name);  // 하드디스크에 저장하는 역할.
        objectOutputStream.writeObject(a_age);  // 하드디스크에 저장하는 역할.

        objectOutputStream.close();//스트림들을 닫는다.
    }
}