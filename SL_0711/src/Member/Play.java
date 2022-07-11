package Member;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        baby_product bp = null;
        Scanner sc = new Scanner(System.in);
        ArrayList<baby_product> a_product = new ArrayList<baby_product>();

        FileOutputStream fileStream_out = new FileOutputStream("C:\\datatest\\MemberInfo.txt");
        FileInputStream fileStream_in = new FileInputStream("C:\\datatest\\MemberInfo.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream_out);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileStream_in);  // 일단 최상위 포식자으로 선언

        System.out.println("** 회원정보 최초 입력 ** \n");
        bp = new baby_product();
        a_product.add(bp);
        bp.setProduct();
//        objectOutputStream.writeObject(a_product);

        while (true) {
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("1. 회원정보 등록");
                    bp = new baby_product();
                    a_product.add(bp);
                    bp.setProduct();
                    objectOutputStream.writeObject(a_product);
                    break;
                case 2:
                    System.out.println("2. 회원정보 불러오기");
                    ArrayList<baby_product> arrayList = (ArrayList) objectInputStream.readObject();
                    baby_product bp1 = null;
                    System.out.println(arrayList.size());
//                    for(int i = 0; i < arrayList.size(); i++) {
//                         arrayList.get(i).putProduct();
//                    }

                    break;

            }
            if(num == 3) {
                System.out.println("** 종료 **");
                break;
            }
        }


    }
}
