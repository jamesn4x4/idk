import java.util.Scanner;

public class testReal {
    public static void main(String[] args) {
    String cname;
    int w;
    double rate,total,vat;
    Scanner kb = new Scanner(System.in);
    System.out.println("-------------INPUT-------------");
    System.out.print("Customer Name : ");
    cname = kb.nextLine();
    System.out.print("Units Consumed (kWh) : ");
    w = kb.nextInt();
    System.out.print("Rate per Unit (Bath) : ");
    rate = kb.nextDouble();
    System.out.println("-------------OUTPUT------------");
    System.out.println("Customer Name : "+" "+cname);
    System.out.println("kWh x Rate : "+ w +" x "+rate + " = "+(w*rate));
    System.out.println("VAT 7.5% : "+ String.format("%.3f", (w*rate)*0.075));
    vat =  (w*rate)*0.075;
    total = (w*rate)+vat;
    System.out.println("-------------------------------");
    System.out.println("TOTAL BILL : "+total);
    System.out.println("-------------------------------");
    }
}