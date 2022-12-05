package Task;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2 {
    static Scanner v = new Scanner(System.in);
    static int[] datas = new int[]{ -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };

    public static int findIndex(int data[], int t){
        return IntStream.range(0, data.length).filter(i -> t == data[i]).findFirst().orElse(-1);
    }
    public static void main(String[] args) {

        Arrays.sort(datas);
        System.out.println("Outputs: ");
        for (int i = 0 ; i< datas.length; i++){
            System.out.print(datas[i]+ " ");
        }
        System.out.println("\n");

        System.out.print("Input Index: ");
        int a = v.nextInt();

        System.out.println();
        System.out.println("Index Position of " +a+ " is: " +findIndex(datas,a));
    }
}
