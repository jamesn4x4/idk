import java.util.Scanner;

public class W09_BMI{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        double weight = kb.nextDouble();
        System.out.print("Enter your height (cm): ");
        double height = kb.nextDouble();
        double bmi = (weight/(height/100*height/100));
        System.out.println("Your BMI is " + String.format("%.2f",bmi));
        if(bmi>=40){
            System.out.println("อ้วนระดับ 3");
        }
        else if(bmi>=35){
            System.out.println("อ้วนระดับ 2");
        }
        else if(bmi>=30){
            System.out.println("อ้วนระดับ 1");
        }
        else if(bmi>=25){
            System.out.println("น้ำหนักมากกว่าเกณฑ์");
        }
        else if(bmi>=18.5){
            System.out.println("ปกติ");
        }
        else{
            System.out.println("น้ำหนักน้อยกว่าเกณฑ์");
        }
    kb.close();
    }
}
//BMI = kg/(h*h)