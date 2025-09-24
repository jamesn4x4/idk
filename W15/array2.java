
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num[] = new int[100];
        int y,x;
        for (int i=0;i <num.length ;i++){
            num[i]=(i+24);
            System.out.println("index "+i+" = "+num[i]);
        }
        x=num[49];y=num[50];
        System.out.println("num 50 = "+x);
        System.out.println("num Position 50 = "+x);

    }
}