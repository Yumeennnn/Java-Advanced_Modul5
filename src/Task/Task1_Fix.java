package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_Fix {
    static Scanner c = new Scanner(System.in);
    static int[] datas = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
    static int a;
    public static int findIndex(int data[], int t) {
        if (data == null) {
            return -1;
        }

        int i = 0;

        while (i < data.length) {
            if (data[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Arrays.sort(datas);
        System.out.println("Outputs: ");
        for (int i = 0 ; i< datas.length; i++){
            System.out.print(datas[i]+ " ");
        }

        System.out.println("\n");
        System.out.print("Input Index: ");
        a = c.nextInt();
        System.out.println();

        System.out.println("Index Position of " +a+ " is: " +findIndex(datas,a));

    }
}
