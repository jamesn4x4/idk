import java.util.Scanner;

public class W07_ifcriarea {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter radius = ");
        double radius = kb.nextDouble();
        System.out.println("1 is area|2 is circumference");
        System.out.print("Enter input = ");
        byte input = kb.nextByte();
        final double PI = 3.14;
        if(input == 1){
            System.out.println(PI*radius*radius);
        }
        if(input == 2){
            System.out.println(2*PI*radius);
        }
    kb.close();
}
}
