package loop;
import java.util.Scanner;
public class W11_loopWhile_true{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//NO.1
        // while(true){
        //     System.out.print("enter alphabet: ");
        //     int num = kb.nextInt();
        //     if(num == 9){
        //         break;
        //         }
            
        //     }
//NO.2
        while(true){
            System.out.print("enter alphabet: ");
            String alphabet = kb.nextLine();
            if(alphabet.equals("e")){
                break;
                }
            
            }
    }
}