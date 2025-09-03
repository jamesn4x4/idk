import java.util.Scanner;
public class Areatri {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);//สร้างScannerเพื่อinput

        System.out.print("Enter Height = " );
        int height = ns.nextInt();
        System.out.print("Enter Base = " );
        int base = ns.nextInt();
        Double area = 0.5*height * base;
        System.out.println("Area of Triangle = "+area);

        ns.close(); //ปิดScannerที่สร้างมา
    }
}
