package Member;

import java.io.*;
import java.util.Scanner;

abstract class Product implements Serializable {

    static boolean sex;
    static String address;
    static int age;



    static boolean getSex() {
        return sex;
    }

    static String getAddress() {
        return address;
    }

    static int getAge() {
        return age;
    }



}

class baby_product extends Product {
    public void setProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("sex : ");
        sex = sc.nextBoolean();
        System.out.print("address : ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.print("age : ");
        age = sc.nextInt();
        System.out.println();
    }
     public void putProduct() {
        System.out.println();
        System.out.println("**회원정보 출력**  \n");
        System.out.println("sex : " + sex);
        System.out.println("address : " + address);
        System.out.println("age : " + age);
    }
}
