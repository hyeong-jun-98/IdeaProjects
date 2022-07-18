import java.util.Scanner;

public class calculator {
    int a,b, add, sub, mul, div;

    public void cal() {
        Scanner sc = new Scanner(System.in);

        System.out.print("a : ");
        a = sc.nextInt();

        System.out.print("b : ");
        b = sc.nextInt();

        add = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;

        System.out.println("a + b = " + add);
        System.out.println("a - b = " + sub);
        System.out.println("a * b = " + mul);
        System.out.println("a / b = " + div);

    }


    public static void main(String [] args) {

        calculator cl = new calculator();
        cl.cal();


    }
}
