package Task;

import javax.security.sasl.SaslClient;
import java.util.Enumeration;
import java.util.Scanner;

public class Task1 {
    public static int findIndex(int data[], int t)
    {

        // if array is Null
        if (data == null) {
            return -1;
        }

        // find length of array
        int i = 0;

        // traverse in the array
        while (i < data.length) {

            // if the i-th element is t
            // then return the index
            if (data[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }


    // Driver Code
    public static void main(String[] args) {

        int[] datas = { 75, 10, 0, 30, 0, 30, 90, 70, 89, 50, 55, 30 };
//        int[] datas = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
        Scanner c = new Scanner(System.in);
        int index = -1;
        int a;
        System.out.print("Input Index: ");
        a = c.nextInt();
        System.out.println();

        for(int i = 0 ; i < datas.length ; i++){
            if (datas[i] == a){
                index = i;
                break;
            }
        }
        System.out.println("Index Position of " +a+ " is: " +index);

    }
}
