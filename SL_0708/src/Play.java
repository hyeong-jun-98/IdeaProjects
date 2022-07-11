
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Play {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("c:\\datatest\\product.txt");
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        ArrayList<Product> a_product = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        Product pd = null;
        String input;

        while (true) {
            pd = new Product();
            a_product.add(pd);
            pd.setProducr();

            System.out.print("continue? : ");
            input = sc.nextLine();
            System.out.println();
            if (input.equals("yes")) {
                continue;
            } else if (input.equals("no")) {
//                for (int i = 0; i < a_product.size(); i++) {
//                    objectOutputStream.writeObject(a_product.get(i));
//
//                }

                break;
            }

        }
        objectOutputStream.writeObject(a_product);
        readData();


//        ArrayList<Product> a_product = new ArrayList<Product>();
//        Scanner sc = new Scanner(System.in);
//        Product pd1 = new Product();
//        Product pd2 = new Product();
//        pd1.setProducr();
//        pd2.setProducr();
//        a_product.add(pd1);
//        a_product.add(pd2);
//        objectOutputStream.writeObject(a_product);

//        for(int i = 0; i < a_product.size(); i++) {
//            objectOutputStream.writeObject(a_product.get(i));
//        }


    }

    static void readData() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:\\datatest\\product.txt");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

//        Product p1 = (Product) objectInputStream.readObject();
        // 기존의 객체(a_client)에 데이터가 저장되어 있는데 여기서는 새로운 객체(arraylist)에서 기존의 객체의 데이터를 읽어와서 새로 넣어준다.
        // 그리고 Product로 형변환을 시켜서 읽어온 데이터를 출력시켜준다.
        ArrayList arrayList = (ArrayList) objectInputStream.readObject();

        Product p = (Product) arrayList.get(0);
        p.putProduct();
        p = (Product) arrayList.get(1);
        p.putProduct();

//        for(int i = 0; i < arrayList.size(); i++) {
//            p = (Product) arrayList.get(i).p
//        }

        objectInputStream.close();
    }

}
// 어떤 것이든 파일에서 객체들의 정보를 읽어올 때 주의할 부분!!
// 반드기 저장된 객체들의 정보를 저장한만큼 읽어와야 한다. (갯수를 미리 정해놔야 한다는 뜻)
// 마지막에 저장할 때 사용한 컨테이너의 형태 그갣로 읽어와야 한다.