import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileReadClass {
    public static void main(String [] args ) throws ClassNotFoundException, IOException {

        // 하드디스크의 특정파일과 fileStream 객체를 연결해준다.
        // 그러면 이제부터는 fileStream이라는게 파일을 담당한다.(이걸로 접근할 수 있다는 얘기이다.)

        FileInputStream fileStream = new FileInputStream("C:\\datatest\\product.txt");

         // 프로그래머가 객체작업을 하려면 ObjectInputStream을 사용해줘야 한다.
        // 그래서 objectInputStream과 fileStream을 연결해줘야 한다.
        // 그러면 결론적으로 *객체작업담당과 <---------> *파일작업담덩 이렇게 연결된다.

        ObjectInputStream objectInputStream = new ObjectInputStream(fileStream);  // 일단 최상위 포식자으로 선언

        // 연결은 다 되었지만, 데이터를 파일에서 읽어와서 메모이에 저장해준 다음이 문제.
        // 읽어온 객체가ㅣ 어떤 타입인지 모르기 때문에 반드기 타입캐스팅 (그게 원래 어쩐 객체였는지)을 해줘야 한다.
        // 우리는 사람이름(String)을 저장했었기 떄문에 그것으로 타입 캐스팅 해야한다._

        Object object = objectInputStream.readObject();
        //  원래 저장할 때 컨테이터 타입이 Arraylist였다. 그러므로 일단 그 타입으로 캐스팅 되어야 한다.'
        // 그 다음, 그 안에 들어있는 각각의 객체가 String 타입이였음.
        // 각각의 String  타입 객체흫 뽑아서 화면에 출력해야한다.

        ArrayList<String> members = (ArrayList<String>) object;
        // 알았으니 형변환
        System.out.print(members.size());
        System.out.println(members.get(0));
        System.out.println(members.get(1));



        objectInputStream.close();  // 항상 닫아줘야 한다.

    }
}
