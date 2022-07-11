
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

        ArrayList arrayList = (ArrayList) objectInputStream.readObject();
        Product p = (Product) arrayList.get(0);
        p.putProduct();
        p = (Product) arrayList.get(1);
        p.putProduct();


        objectInputStream.close();
    }

}
