package loop;
import java.util.Scanner;
public class W11_menuSwitchcase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number 1: ");       
        int num1 = kb.nextInt();
        System.out.print("Enter number 2: ");       
        int num2 = kb.nextInt();
        System.out.println("=======================");
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtracion");
        System.out.println("3. Exit");
        System.out.println("=======================");
        while (true) { 
            System.out.print("Enter your choice: ");     
            int choice = kb.nextInt();
            System.out.println("-----------------------");
            // if(choice == 1){
            //     System.out.println("Addition number");
            //     System.out.println(num1+" + "+num2+(" = ")+(num1+num2));
            //     break;
            // }
            // else if(choice == 2){
            //     System.out.println("Subtracion number");
            //     System.out.println(num1+" - "+num2+(" = ")+(num1-num2));
            //     break;
            // }
            // else if (choice == 3){
            //     System.out.println("Exiting program");
            //     break;
            // }
            // else{
            //     System.out.println("choice you chose dont have in menu");
            //     System.out.println("-----------------------");
            // }
            switch (choice) {
                case 1:
                    System.out.println("Addition number");
                    System.out.println(num1+" + "+num2+(" = ")+(num1+num2));
                    break;
                case 2:
                    System.out.println("Subtracion number");
                    System.out.println(num1+" - "+num2+(" = ")+(num1-num2));
                    break;
                case 3:
                    System.out.println("Exiting program");
                    break;
            }
            if(choice <= 3){
                break;
            }
            else{
                System.out.println("choice you chose dont have in menu");
                System.out.println("-----------------------");
            }
        }
    }
}
