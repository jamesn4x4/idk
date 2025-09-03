import java.util.Scanner;
public class Classsubsum {
    public static void main(String[] a) {
        Scanner ns = new Scanner(System.in);//สร้างScannerเพื่อinput
        System.out.print("Enter scoreclass1 = " );
        int score1 = ns.nextInt();
        System.out.print("Enter scoreclass2 = " );
        int score2 = ns.nextInt();
        System.out.print("Enter scoreclass3 = " );
        int score3 = ns.nextInt();
        int final_score = score1 + score2 + score3;
        System.out.println("final score = "+final_score);
        ns.close(); //ปิดScannerที่สร้างมา
    }
}
