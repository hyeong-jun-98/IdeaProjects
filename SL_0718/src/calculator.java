import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);






       String name = null;
        int weight = 0;
        double height = 0.0;

        System.out.print("name : ");
        name = sc.nextLine();
        System.out.print("height : ");
        height = sc.nextDouble();
        System.out.print("weight : ");
        weight = sc.nextInt();

        double bmi = weight / (height * height);

        if(bmi > 30) {
            System.out.println("비만");;
        } else if(bmi >= 25 && bmi <= 29) {
            System.out.println("과체중");
        } else if(bmi >= 20 && bmi <= 24){
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }

        System.out.println(bmi);



        int a = 60, b = 50, c = 70;
        int sum = a + b + c;
        double avg = sum / 3.0;  // 변수를 쓰면 램의 공간을 차지하기 때문에..

        if (a < 40 || b < 40 || c < 40) {
            System.out.println("불합격");
        } else if(avg >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

    }
}
