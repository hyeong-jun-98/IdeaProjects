import java.util.Arrays;
import java.util.Random;

public class Play {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] arr = new int[6];
       for(int i = 0; i < 6; i++) {
            arr[i] = rd.nextInt(46) + 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                  i--;
                }
            }

        }
        Arrays.sort(arr);

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }




    }
}
