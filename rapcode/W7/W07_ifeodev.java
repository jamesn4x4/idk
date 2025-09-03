import java.util.Scanner;

public class W07_ifeodev{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = kb.nextInt();
        if(n%2 == 0){
            System.out.println(n+" is even");
        }
        else
        System.out.println(n+" is odd");
    kb.close();
    }
}