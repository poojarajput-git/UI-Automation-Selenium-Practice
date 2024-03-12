import java.util.Scanner;
import java.util.Arrays;

public class practiceDSA {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        int target = sc.nextInt();

        boolean present = false;
        for(int j = 0 ;  j<n ; j++){
            if(target == arr[j]){
                present = true;
                break;
            }
        }
        System.out.println(present);


        //System.out.println("Hello Open Browser");

    }
}
